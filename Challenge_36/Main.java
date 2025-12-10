package Challenge_36;

import Challenge_36.visitor.StatsVisitor;

import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {

        Path startingPath = Path.of(".");

        FileVisitor<Path> visitor = new StatsVisitor(1);

        try {
            Files.walkFileTree(startingPath, visitor);
        } catch (Exception e) {
                //e.printStackTrace();
                 System.out.println("Error walking directory tree: " + startingPath);
        }

    }
}