package pl.sdacademy.algorithms;

public class EmailValidator {

    public boolean isValid(String email) {
        boolean result = true;

        // checking the number of "ats"
        int numberOfAts = 0;
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                numberOfAts++;
            }
        }
        if (numberOfAts != 1) {
            result = false;
        }

        // checking the domain's length
        String[] addressParts1 = email.split("@");
        String domain = addressParts1[1];

        if (domain.charAt(domain.length() - 2) == '.') {
            result = false;
        }

        return result;
    }
}
