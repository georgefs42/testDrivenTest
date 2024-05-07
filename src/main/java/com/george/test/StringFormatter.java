package com.george.test;

public class StringFormatter {
    public String toNameFormat(String input) {
        // Kontrollera om inmatningen är null eller tom
        if (input == null || input.isEmpty()) {
            return input;
        }

        // Konvertera första bokstaven till stor bokstav och resten till små bokstäver
        String formattedString = input.substring(0, 1).toUpperCase() + input.substring(1).toLowerCase();

        return formattedString;
    }

    public static void main(String[] args) {
        String input = "hej, JAG Är En StRÄnG!";
        StringFormatter formatter = new StringFormatter();
        String formattedString = formatter.toNameFormat(input);
        System.out.println("Formatted String: " + formattedString);
    }
}
