import java.util.Scanner;

public class Lesson_03_Exam_Grade {
/*A	95–100	Exceptional
B	85–94	Excellent
C	75–84	Very good
D	65–74	Good
E 55–64	Sufficient – lowest passing grade
F	0–54	Insufficient – failing grade */

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a score: ");
    int score = scanner.nextInt();

    String gradeA = "A";
    String gradeB = "B";
    String gradeC = "C";
    String gradeD = "D";
    String gradeE = "E";
    String gradeF = "F";

    if (score >= 95) {
      System.out.println("Exam grade is "+ gradeA);
    }
    else if (score >= 85 & score < 95) {
      System.out.println("Exam grade is "+ gradeB);
    }
    else if (score >= 75 & score < 85) {
      System.out.println("Exam grade is "+ gradeC);
    }
    else if (score >= 65 & score < 75) {
      System.out.println("Exam grade is "+ gradeD);
    }
    else if (score >= 55 & score < 65) {
      System.out.println("Exam grade is "+ gradeE);
    }
    else {
      System.out.println("Exam grade is "+ gradeF);
    }
  }

}
