package pl.sdacademy.algorithms;

public class PeselUtility {
    public boolean isValid(String pesel) {
        int sum = 0;

        for (int i = 0; i < pesel.length(); i++) {
            int digit = Character.getNumericValue(pesel.charAt(i));

            if (i == 0 || i == 4 || i == 8 || i == 10) {
                sum += digit;
            } else if (i == 1 || i == 5 || i == 9) {
                sum += digit * 3;
            } else if (i == 2 || i == 6) {
                sum += digit * 7;
            } else if (i == 3 || i == 7) {
                sum += digit * 9;
            }
        }

        return sum % 10 == 0;
    }


    public boolean isMale(String pesel) {
        int digit = Character.getNumericValue(pesel.charAt(9));

        return digit % 2 != 0;
    }
}
