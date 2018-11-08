package org.pursuit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Algorithms implements DataStructures {

    @Override
    public char[] stringToCharArray(String word) {
        char[] myArray = new char[0];
        for (int i = 0; i < word.length(); i++) {
            myArray = new char[]{word.charAt(i)};

        }

        return myArray;

    }


    @Override
    public ArrayList<Integer> multiplicationTableList(int number) {
        ArrayList<Integer> multiply = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            multiply.add(number += i);

        }
        return multiply;
    }

    @Override
    public HashMap<String, Integer> wordLength(String[] wordArray) {
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < wordArray.length; i++) {

            map.put("", wordArray.length);

        }
        return map;
    }

    @Override
    public HashSet<Character> uniqueCharacters(String word) {
        HashSet<Character> myChar = new HashSet<Character>();

        for (int i = 0; i < word.length(); i++){
            word.charAt(i);
            myChar.add( word.charAt(i));

        }
        return myChar;
    }
}
