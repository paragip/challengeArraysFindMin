package pal.paragi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int count = readInteger();
        int[] arrayRead = readElements(count);

        int min = findMin(arrayRead);
        System.out.println("Minimum element of the array = " + min);
    }

    public static int readInteger(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type an integer: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        return count;
    }

    public static int[] readElements(int count) {

        Scanner scanner = new Scanner(System.in);

        int[]arrayOriginal = new int[count];
        System.out.println("Type " + count + " integers:");

        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt) {
            for (int i = 0; i < count; i++) {
                arrayOriginal[i] = scanner.nextInt();
                scanner.nextLine();
            }
        }
        return arrayOriginal;
    }


    public static int findMin(int[]array){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
