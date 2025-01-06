package AnyTwoAddEqualsGiven;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> given = new ArrayList<>();
        given.add(10);
        given.add(15);
        given.add(3);
        given.add(7);

        System.out.println("ifEquals from problem, for given [10, 15, 3, 7] and k of 17: " + ifEquals(given, 17));
        System.out.println("ifEquals randomised, with given size and k given: " + ifEqualsRandomized(4, 17));
        System.out.println("ifEquals randomised, with given size and k randomized: " + ifEqualsRandomized(4));

    }

    public static boolean ifEquals(ArrayList<Integer> given, int k) //gives true if any of two from given equals k
    {
        for (int i = 0; i < given.size(); i++){
            for (int j = i; j < given.size(); j++){
                if (given.get(i) + given.get(j) == k)
                    return true;
            }
        }
        return false;
    }
    public static boolean ifEqualsRandomized(int sizeOfGiven, int givenK) //randomized with given k
    {
        ArrayList<Integer> given = new ArrayList<>();
        for (int i = 0; i < sizeOfGiven; i++){
            given.add((int) (Math.random()*10));
        }

        for (int i = 0; i < given.size(); i++){
            for (int j = i; j < given.size(); j++){
                if (given.get(i) + given.get(j) == givenK)
                    return true;
            }
        }
        return false;
    }
    public static boolean ifEqualsRandomized(int sizeOfGiven) //fully randomized
    {
        ArrayList<Integer> given = new ArrayList<>();
        int givenK = (int)(Math.random()*20);

        for (int i = 0; i < sizeOfGiven; i++){
            given.add((int) (Math.random()*10));
        }

        for (int i = 0; i < given.size(); i++){
            for (int j = i; j < given.size(); j++){
                if (given.get(i) + given.get(j) == givenK)
                    return true;
            }
        }
        return false;
    }
}