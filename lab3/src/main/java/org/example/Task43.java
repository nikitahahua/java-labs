package org.example;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task43 {
    private static final Set<String> C_KEYWORDS = new HashSet<>();

    static {
        C_KEYWORDS.add("if");
        C_KEYWORDS.add("for");
        C_KEYWORDS.add("while");
        C_KEYWORDS.add("do");
        C_KEYWORDS.add("else");
    }

    public void task43(List<String> words) {
        System.out.println("Amount of arguments: " + words.size());

        for (String word : words) {
            String type = determineType(word);
            System.out.println("Argument: " + word + " | Type: " + type);
        }
    }

    private static String determineType(String arg) {
        if (C_KEYWORDS.contains(arg)) {
            return "Keyword";
        }

        if (isCIdentifier(arg)) {
            return "Identifier";
        }

        return "Illegal";
    }

    private static boolean isCIdentifier(String arg) {
        if (!arg.isEmpty() && Character.isLetter(arg.charAt(0)) && arg.contains("_")) {
            return true;
        }
        return false;
    }
}
