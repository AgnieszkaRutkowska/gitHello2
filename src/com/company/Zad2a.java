package com.company;

public class Zad2a {

    /*
      max
      A[P]+A[Q]+(Q-P)

      max((A[P]-P) + (A[Q] +Q))
        max(((A[P]-P)) + max (A[Q]+Q)

      int solution (int[] array) {
      }
     */
    int solution(int[] array) {
        int maxA = array[0];
        int maxB = array[0];

        for (int i = 0; i < array.length; i++) {
            if ((array[i] - i) > maxA) {
                maxA = array[i] - i;
            }
            if (array[i] + i > maxB) {
                maxB = array[i] + i;
            }
        }
        return maxA + maxB;
    }

    public static void main(String[] args) {
        Zad2a zad2 = new Zad2a();
        System.out.println (zad2.solution(new int[]{1,3,-3}));
    }
}
