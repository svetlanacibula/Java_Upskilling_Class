package Challenge_36.visitor;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class StatsVisitor extends SimpleFileVisitor<Path> {
    private Path initialPath = null;
    private final Map<Path,Stats> folderStats = new LinkedHashMap<>();
    private int initialCount;
    private final int printLevel;
    private static class Stats {
        long size = 0L;
        int fileCount = 0;
        int dirCount = 0;
    }

    public StatsVisitor(int printLevel) {
        this.printLevel = printLevel;
    }


    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        Objects.requireNonNull(dir);
        Objects.requireNonNull(attrs);
        if (initialPath == null) {
            initialPath = dir;
            initialCount = dir.getNameCount();

        }
        folderStats.putIfAbsent(dir, new Stats());
        Path parent = dir.getParent();
        if (parent != null) {
            folderStats.putIfAbsent(parent, new Stats());
            folderStats.get(parent).dirCount++;
        }
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        Objects.requireNonNull(file);
        Objects.requireNonNull(attrs);
        Path parent = file.getParent();
        if (parent != null) {
            folderStats.putIfAbsent(parent, new Stats());
            Stats s = folderStats.get(parent);
            s.size += attrs.size();
            s.fileCount++;
        }
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        Objects.requireNonNull(dir);
        if (exc != null) {
            System.err.println("Error visiting " + dir + ": " + exc.getMessage());
            return FileVisitResult.SKIP_SUBTREE;
        }
        int relativeLevel = dir.getNameCount() - initialCount;
        if (relativeLevel == 1) {
            folderStats.forEach((key,value) -> {
                int level = key.getNameCount() - initialCount - 1;
                if (level < 0) {
                   level = 0;
                }
                System.out.printf("%s[%s] - %,d bytes, %d dirs, %d files%n",
                        "\t".repeat(level),
                        key.getFileName(),
                        value.size,
                        value.dirCount,
                        value.fileCount);
            });
        } else if (relativeLevel > 1) {
            Path parent = dir.getParent();
            if (parent != null) {
                Stats current = folderStats.getOrDefault(dir, new Stats());
                folderStats.putIfAbsent(parent, new Stats());
                Stats p = folderStats.get(parent);
                p.size += current.size;
                p.dirCount += current.dirCount;
                p.fileCount += current.fileCount;
            }
        }
        return FileVisitResult.CONTINUE;
    }
}
