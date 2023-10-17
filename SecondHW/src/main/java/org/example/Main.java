package org.example;

public class Main {
    public static void main(String[] args) {
        int[] numArray = new int[] {1, 2, 3, 0, 0, 4, 5, 6, 7};
        System.out.println(countEvens(numArray));
        System.out.println(differenceMaxAndMin(numArray));
        System.out.println(checkTwoZero(numArray));
    }

     static int countEvens(int[] numArray) {
        int count = 0;
        for (int item: numArray) {
            if (item % 2 == 0 && item != 0) count++;
        }
        return count;
    }

    static int differenceMaxAndMin(int[] numArray) {
        int maxNum = numArray[0];
        int minNum = numArray[0];
        for (int item: numArray) {
            if (maxNum < item) maxNum = item;
            if (minNum > item) minNum = item;
        }
        return maxNum - minNum;
    }

    static boolean checkTwoZero(int[] numArray) {
        try {
            for (int i = 0; i < numArray.length; i ++) {
                if (numArray[i] == 0 && numArray[i + 1] == 0) return true;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            return false;
        }
        return false;
    }
}
