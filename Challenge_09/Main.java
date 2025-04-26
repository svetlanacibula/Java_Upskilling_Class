package Challenge_09;

public class Main {
  public static void main(String[] args) {
    SpaceInvestigator Investigator = new SpaceInvestigator();

    Investigator.setInputText("   Lazy  fox, jumps  over.\nSomething54546  much more,\n78Not sure , if it does." +
                              "\nHave , a good day.\nFor example\nHello ! ) How are you ? \\\" Fine !     ");

    Investigator.spaceInvestigator();
  }
}
