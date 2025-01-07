package NewArrayWithGivenArrayWithoutIndex_7_01_2025;

// Given an array of integers,
// return a new array such that each element at index i
// of the new array is the product of all the numbers
// in the original array except the one at i.
// For example, if our input was [1, 2, 3, 4, 5],
// the expected output would be [120, 60, 40, 30, 24].
// If our input was [3, 2, 1],
// the expected output would be [2, 3, 6].
//
// Follow-up: what if you can't use division?

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> given = new ArrayList<>();
        given.add(1);
        given.add(2);
        given.add(3);
        given.add(4);
        given.add(5);

        System.out.println("array given: " + given);
        System.out.println("array out: " + ArrayWithoutI(given));
        System.out.println("array randomized: ");
        System.out.println("array out: " + ArrayWithoutIRandomized(5));
    }

    private static String ArrayWithoutI(ArrayList<Integer> given) {
        ArrayList<Integer> out = new ArrayList<>();

        for (int i = 0; i < given.size(); i++) {
            int temp = 1;
            for (int j = 0; j < given.size(); j++) {
                if (i!=j){
                    temp = temp * given.get(j);
                }
            }
            out.add(temp);
        }

        return out.toString();
    }
    private static String ArrayWithoutIRandomized(int sizeOfRandomizedArray) {
        ArrayList<Integer> given = ArrayRandomized(sizeOfRandomizedArray);
        System.out.println(given.toString());
        ArrayList<Integer> out = new ArrayList<>();

        for (int i = 0; i < given.size(); i++) {
            int temp = 1;
            for (int j = 0; j < given.size(); j++) {
                if (i!=j){
                    temp = temp * given.get(j);
                }
            }
            out.add(temp);
        }

        return out.toString();
    }
    private static ArrayList<Integer> ArrayRandomized(int size){
        ArrayList<Integer> out = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            out.add((int)(Math.random()*9)+1);
        }
        return out;
    }
}