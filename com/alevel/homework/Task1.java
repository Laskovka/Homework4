package com.alevel.homework;

import java.util.Locale;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Please, enter any text in Cyrillic letters.");
        System.out.println("(text size should not exceed 30 characters).");
        Scanner scanner = new Scanner(System.in);
        String line = "";
        while (true) {
            line = scanner.nextLine();
            if(line.length() > 30) {
                System.out.println("The text size has exceeded 30 characters. Please try again.");
            } else {
                break;
            }
        }
        System.out.println(transliteration(line.toLowerCase(Locale.ROOT)));
    }

    static String transliteration(String inputString) {
        String[] russianAlphabet = {"а", "б", "в", "г", "д", "е", "ё", "ж", "з", "и", "й",
                                    "к", "л", "м", "н", "о", "п", "р", "с", "т", "у", "ф",
                                    "х", "ц", "ч", "ш", "щ", "ъ", "ы", "ь", "э", "ю", "я", " "};
        String[] lettersForTransliteration = {"a", "b", "v", "g", "d", "e", "yo", "zh", "z", "i", "yi",
                                            "k", "l", "m", "n", "o", "p", "r", "s", "t", "u", "f",
                                            "h", "c", "ch", "sh", "shch", "″", "y", "′", "e", "yu", "ya", " "};
        String transliteratedString = "";
        for (int i = 0; i < inputString.length(); i++) {
            for (int j = 0; j < russianAlphabet.length; j++) {
                if(String.valueOf(inputString.charAt(i)).equals(russianAlphabet[j])) {
                    transliteratedString+=lettersForTransliteration[j];
                    break;
                }
            }
        }
        return transliteratedString;
    }
}
