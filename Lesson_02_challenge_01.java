public class Lesson_02_challenge_01 {
  public static void main(String[] args) {
    double firstValue = 20.00;
    double secondValue = 80.00;
    double operationWithDouble = (firstValue + secondValue) * 100.00;
    double remainderFromOperationWithDouble = operationWithDouble % 40.00;
    boolean remainderIsZero;

    if (remainderFromOperationWithDouble == 0) {
     remainderIsZero = true;
    }
    else {
      remainderIsZero = false;
    }

    System.out.println(operationWithDouble);
    System.out.println(remainderFromOperationWithDouble);
    String text = !remainderIsZero ? "Is not zero" : "Is zero";
    System.out.print(text);

    if (remainderIsZero != true)
    {System.out.print(" got some reminder");}


  }
}
