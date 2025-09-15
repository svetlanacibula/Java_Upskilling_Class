package Challenge_22;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.UnaryOperator;


public class Main {
    public static void main(String[] args) {
        String[] firstNamesArray = {"aLEx", "annA", "mArY", "dAnIeL", "eMiLy", "MiKe", "KaTe", "oTTo", "boB"};
        Random random = new Random();

        List<String> firstNames = Arrays.asList(firstNamesArray);

        UnaryOperator<String> toUpperCase = String::toUpperCase;
        UnaryOperator<String> capitalizeFirstLetter = name -> {
            String lower = name.toLowerCase();
            return Character.toUpperCase(lower.charAt(0)) + lower.substring(1);
        };

        UnaryOperator<String> addRandomCapitalLetter = name -> {
            String formatted = Character.toUpperCase(name.charAt(0)) + name.substring(1).toLowerCase();
            char randomCapital = (char) ('A' + random.nextInt(26));
            return formatted + " " + randomCapital + ".";
        };

        UnaryOperator<String> addReversedAsSurname = name -> {
            String[] parts = name.split(" ");
            String firstName = parts[0];
            String reversed = new StringBuilder(firstName).reverse().toString();
            String capitalizedSurname = Character.toUpperCase(reversed.charAt(0)) + reversed.substring(1, reversed.length() - 1) + Character.toLowerCase(reversed.charAt(reversed.length() - 1));
            return firstName + " " + capitalizedSurname;
        };


        firstNames.replaceAll(toUpperCase);
        System.out.println(firstNames);
        System.out.println(" ");

        firstNames.replaceAll(capitalizeFirstLetter);
        System.out.println(firstNames);
        System.out.println(" ");

        firstNames.replaceAll(addRandomCapitalLetter);
        System.out.println(firstNames);

        firstNames.replaceAll(addReversedAsSurname);
        System.out.println();
        System.out.println(firstNames);


    }
}
