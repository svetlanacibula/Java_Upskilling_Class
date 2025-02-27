public class Lesson_03_Seconds_And_Minutes {
  public static void main(String[] args) {
    int seconds = 25984;
    int minutes = 10;

    String durationInHours = getDurationOnString(seconds);

    System.out.println(durationInHours);

  }
  public static String getDurationOnString(int seconds) {
   /* int hours = seconds / 3600;
    int remainingSeconds = seconds % 3600;
    int minutes = remainingSeconds / 60;
    int secs = remainingSeconds % 60; */

    return getDurationString(seconds,0);
  }

  public static String getDurationString(int seconds, int minutes) {
    int totalSeconds = minutes * 60 +seconds;
    int hours = totalSeconds / 3600;
    int remainingMinutes = (totalSeconds % 3600) / 60;
    int remainingSeconds = totalSeconds % 60;

    return String.format("%02d hours %02d minutes %02d seconds", hours, remainingMinutes, remainingSeconds);

  }
}
