

public class Lesson_03_Barking_Dog_Alarm {
  public static void main(String[] args) {

    shouldWakeUp(true, 5);  // Should print "wake up"
    shouldWakeUp(true, 11); // Should not print anything
    shouldWakeUp(false, 2); // Should not print anything
    shouldWakeUp(true, 22); // Should not print anything
    shouldWakeUp(true, 24); // Should not print anything (invalid hour)
  }

    public static void shouldWakeUp (boolean barking, int hoursOfDay){
      if (hoursOfDay < 0 || hoursOfDay > 23) {
        System.out.println("Invalid hourOfDay: " + hoursOfDay);
      }

      // Check if barking and hourOfDay is less than 8 or greater than 23
      if (barking && (hoursOfDay < 8 || hoursOfDay >= 22)) {
        System.out.println("Wake up");
      }
      if (barking && (hoursOfDay >= 8 || hoursOfDay < 22)) {
        System.out.println("Ignore");
      }
    }
}
