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
        System.out.println(transliteration(line));
    }

    static String transliteration(String inputString) {
        String[] russianAlphabetLowerCase = {"а", "б", "в", "г", "д", "е", "ё", "ж", "з", "и", "й",
                                    "к", "л", "м", "н", "о", "п", "р", "с", "т", "у", "ф",
                                    "х", "ц", "ч", "ш", "щ", "ъ", "ы", "ь", "э", "ю", "я", " "};

        String[] russianAlphabetUpperCase = {"А", "Б", "В", "Г", "Д", "Е", "Ё", "Ж", "З", "И", "Й",
                                            "К", "Л", "М", "Н", "О", "П", "Р", "С", "Т", "У", "Ф",
                                            "Х", "Ц", "Ч", "Ш", "Щ", "Ъ", "Ы", "Ь", "Э", "Ю", "Я", " "};

        String[] lettersForTransliterationLowerCase = {"a", "b", "v", "g", "d", "e", "yo", "zh", "z", "i", "yi",
                                            "k", "l", "m", "n", "o", "p", "r", "s", "t", "u", "f",
                                            "h", "c", "ch", "sh", "shch", "″", "y", "′", "e", "yu", "ya", " "};

        String[] lettersForTransliterationUpperCase = {"A", "B", "V", "G", "D", "E", "YO", "ZH", "Z", "I", "YI",
                                                    "K", "L", "M", "N", "O", "P", "R", "S", "T", "U", "F",
                                                    "H", "C", "CH", "SH", "SHCH", "″", "Y", "′", "E", "YU", "YA", " "};

        String transliteratedString = "";
        for (int i = 0; i < inputString.length(); i++) {
            for (int j = 0; j < russianAlphabetLowerCase.length; j++) {
                if(String.valueOf(inputString.charAt(i)).equals(russianAlphabetLowerCase[j])) {
                    transliteratedString+=lettersForTransliterationLowerCase[j];
                    break;
                } else if(String.valueOf(inputString.charAt(i)).equals(russianAlphabetUpperCase[j])){
                    transliteratedString+=lettersForTransliterationUpperCase[j];
                    break;
                }
            }
        }
        return transliteratedString;
    }
}
