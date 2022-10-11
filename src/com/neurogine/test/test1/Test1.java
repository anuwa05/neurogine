package com.neurogine.test.test1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args){
        System.out.println(convertToUpperCase(new String[]{"dede","dede","ded"}));
        test2(new String[]{"abc", "an", "", "apple", "bcd", "", "jk"});
    }

    private static void test2(String[] stringArray){
        List<String> moreThanTwoChars = Arrays.stream(stringArray).filter(value -> value.length()>2).collect(Collectors.toList());
        System.out.println(moreThanTwoChars);

        long startsWithACount = Arrays.stream(stringArray).filter(value -> value.toUpperCase().startsWith("A")).count();
        System.out.println(startsWithACount);

        long emptyStringCount = Arrays.stream(stringArray).filter(String::isEmpty).count();
        System.out.println(emptyStringCount);
    }

    private static String convertToUpperCase(String[] stringArray) {
        return Arrays.stream(stringArray).map(String::toUpperCase).collect(Collectors.joining(","));
    }


}
