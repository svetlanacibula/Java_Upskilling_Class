package Challenge_09;

public class SpaceInvestigator {
  public String inputText;

  public SpaceInvestigator() {
    this.inputText = "";
  }

  public void setInputText(String inputText) {
    this.inputText = inputText;
  }

  public String spaceInvestigator() {
    indentNewLine();
    replaceDoubleSpaces();
    removeSpacesBetweenCommaAndLetters();
    removeLeadingAndTrailingSpaces();
    addSpaceBetweenNumbersAndLetters();
    removeSpacesAroundPunctuation();
    return inputText;
  }

  public String indentNewLine() {
    System.out.println("Original text:");
    System.out.println();
    System.out.println(inputText);
    System.out.println();
    System.out.println("Method indents new line");
    System.out.println();
    System.out.println(inputText.indent(1));
    System.out.println("<<<<<<<<<<<<<<<<<<<< ++ >>>>>>>>>>>>>>>>>>");
    return inputText;
  }

  public String replaceDoubleSpaces() {
    System.out.println("Method replaces double spaces");
    System.out.println();
    System.out.println(inputText.replaceAll("  ", " "));
    System.out.println("<<<<<<<<<<<<<<<<<<<< ++ >>>>>>>>>>>>>>>>>>");
    return inputText;
  }

  public String removeSpacesBetweenCommaAndLetters() {
    System.out.println("Method removes spaces between comma and letter");
    System.out.println();
    System.out.println(inputText.replaceAll(",\\s+(?=\\p{L})", ","));
    System.out.println("<<<<<<<<<<<<<<<<<<<< ++ >>>>>>>>>>>>>>>>>>");
    return inputText;
  }

  public String removeLeadingAndTrailingSpaces() {
    System.out.println("Method removes leading and trailing spaces");
    System.out.println();
    System.out.println(inputText.trim());
    System.out.println("<<<<<<<<<<<<<<<<<<<< ++ >>>>>>>>>>>>>>>>>>");
    return inputText;
  }

  public String addSpaceBetweenNumbersAndLetters() {
    System.out.println("Method adds spaces between numbers and letters");
    System.out.println();
    System.out.println(inputText.replaceAll("(?<=\\d)(?=[a-zA-Z])", " ")
                                .replaceAll("(?<=[a-zA-Z])(?=\\d)", " "));
    System.out.println("<<<<<<<<<<<<<<<<<<<< ++ >>>>>>>>>>>>>>>>>>");
    return inputText;
  }

  public String removeSpacesAroundPunctuation() {
    System.out.println("Method removes space before or after a question or exclamation mark that is followed by a closing quotation mark, parenthesis or bracket");
    System.out.println();
    System.out.println(inputText.replaceAll("\\s*([!?])\\s*(?=[\"\\)\\]])", "$1"));
    System.out.println("<<<<<<<<<<<<<<<<<<<< ++ >>>>>>>>>>>>>>>>>>");
    return inputText;
  }
}