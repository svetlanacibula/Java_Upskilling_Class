import java.util.Scanner;

public class Lesson_03_Byte_Convertor {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter any amount of bytes: ");
    long bytes = scanner.nextInt();
    System.out.println(formatBytes(bytes));
  }

  public static String formatBytes(long bytes) {
    if (bytes < 1024) {
      return bytes + " Bytes";
    }
    else if (bytes < 1024 * 1024) {
      return String.format("%.2f KiloBytes", bytes / 1024.0);
    }
    else if (bytes < 1024 * 1024 * 1024) {
      return String.format("%.2f MegaBytes", bytes / (1024.0 * 1024));
    }
    else if (bytes < (long)1024 * 1024 * 1024 * 1024) {
      return String.format("%.2f GigaBytes", bytes / (1024.0 * 1024 * 1024));
    }
    else {
      return String.format("%.2f TeraBytes", bytes / (1024.0 * 1024 * 1024 * 1024));
    }
  }
}
