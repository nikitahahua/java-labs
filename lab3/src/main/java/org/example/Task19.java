package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Task19 {
    public Map<String, String> task19(List<String> dataToAlalyze){
        String regExp = "^0[0-7]{7}$";

        Map<String, String> result = new HashMap<>();
        for (String s : dataToAlalyze){
            if (Pattern.matches(regExp, s)){
                result.put(s, "Octal");
                continue;
            }
            result.put(s, "String");
        }

        System.out.println("Amount of arguments: " + result.size());
        for (Map.Entry<String, String> entry : result.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        return result;
    }
}
