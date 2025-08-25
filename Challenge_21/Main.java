package Challenge_21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String[] firstNamesArray = {
                "aLEx", "annA", "mArY", "dAnIeL", "eMiLy", "MiKe", "KaTe", "oTTo", "boB"
        };
        Random random = new Random();

        List<String> firstNames = Arrays.asList(firstNamesArray);

        firstNames.replaceAll(String::toUpperCase);

        firstNames.forEach(System.out::println);

        firstNames.replaceAll(name -> {
            String normalized = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
            char middleInitial = (char) ('A' + random.nextInt(26));
            return normalized + " " + middleInitial + ".";
        });

        firstNames.forEach(System.out::println);

        firstNames.replaceAll(name -> {
            String reversed = new StringBuilder(name).reverse().toString();
            String trimmedReversed = reversed.length() > 2 ? reversed.substring(2) : "";
            String trimmedReversedNormalized = trimmedReversed.substring(0, 2).toUpperCase() + trimmedReversed.substring(2).toLowerCase();
            return name + trimmedReversedNormalized;
        });

        firstNames.forEach(System.out::println);

        ArrayList<String> modifiableNames = new ArrayList<>(firstNames);

        modifiableNames.removeIf(fullName -> {
            String[] parts = fullName.split(" ");

            String firstName = parts[0];
            String lastName = parts[2];
            return firstName.equalsIgnoreCase(lastName);
        });

        System.out.println("\nFiltered names (last name ≠ first name):");
        modifiableNames.forEach(System.out::println);

    }

}

