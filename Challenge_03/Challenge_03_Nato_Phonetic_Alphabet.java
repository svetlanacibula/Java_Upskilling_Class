package Challenge_03;

import java.util.Scanner;

public class Challenge_03_Nato_Phonetic_Alphabet {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a character: ");
    char letter = scanner.next().charAt(0);

    scanner.close();

    switch (letter) {
      case 'A', 'a':
        System.out.println(letter + " Alfa");
        break;
      case 'B', 'b':
        System.out.println(letter + " Bravo");
        break;
      case 'C', 'c':
        System.out.println(letter + " Charlie");
        break;
      case 'D', 'd':
        System.out.println(letter + " Delta");
        break;
      case 'E', 'e':
        System.out.println(letter + " Echo");
        break;
      case 'F', 'f':
        System.out.println(letter + " Foxtrot");
        break;
      case 'G', 'g':
        System.out.println(letter + " Golf");
        break;
      case 'H', 'h':
        System.out.println(letter + " Hotel");
        break;
      case 'I', 'i':
        System.out.println(letter + " India");
        break;
      case 'J', 'j':
        System.out.println(letter + " Juliett");
        break;
      case 'K', 'k':
        System.out.println(letter + " Kilo");
        break;
      case 'L', 'l':
        System.out.println(letter + " Lima");
        break;
      case 'M', 'm':
        System.out.println(letter + " Mike");
        break;
      case 'N', 'n':
        System.out.println(letter + " November");
        break;
      case 'O', 'o':
        System.out.println(letter + " Oscar");
        break;
      case 'P', 'p':
        System.out.println(letter + " Papa");
        break;
      case 'Q', 'q':
        System.out.println(letter + " Quebec");
        break;
      case 'R', 'r':
        System.out.println(letter + " Romeo");
        break;
      case 'S', 's':
        System.out.println(letter + " Sierra");
        break;
      case 'T', 't':
        System.out.println(letter + " Tango");
        break;
      case 'U', 'u':
        System.out.println(letter + " Uniform");
        break;
      case 'V', 'v':
        System.out.println(letter + " Victor");
        break;
      case 'W', 'w':
        System.out.println(letter + " Whiskey");
        break;
      case 'X', 'x':
        System.out.println(letter + " Xray");
        break;
      case 'Y', 'y':
        System.out.println(letter + " Yankee");
        break;
      case 'Z', 'z':
        System.out.println(letter + " Zulu");
        break;
      default:
        System.out.println("Not found");
        break;
    }
  }
}


