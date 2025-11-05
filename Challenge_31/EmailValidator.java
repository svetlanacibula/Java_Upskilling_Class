package Challenge_31;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {

    String[] emails = {"jane.doe_92@example.com",
            "alpha-beta.team@techhub.th.org",
            "sunny_day-77@outlook.com",
            "michael_angelo@art-mail.net",
            "code!.master-101@devzone.io",
            "lucy.liu_88@creative-space.com",
            "xX_shadow_Xx@gameworld.22.gg",
            "data.miner-2025@cloudmail?.net"};
    String regex = "^([a-zA-Z0-9._-]+)@([a-zA-Z0-9.-]+\\.[a-zA-Z]{2,})$";
    Pattern pattern = Pattern.compile(regex);

    public static void main(String[] args) {
        EmailValidator validator = new EmailValidator();
        validator.validateEmails();
    }

    public void validateEmails() {
        for (String email : emails) {
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
                String usernamePart = matcher.group(1);
                String domainPart = matcher.group(2);
                System.out.println(email + " is valid.");
                System.out.println("  User name part: " + usernamePart);
                System.out.println("  Domain part: " + domainPart);
            } else {
                System.out.println(email + " is invalid.");
            }
        }
    }

}
