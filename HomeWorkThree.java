/**
* Java 1. HomeWork #3
*
*@author Nikita Seleznev
*@version 16.12.2021
*
*/

import java.util.Arrays;

class HomeWorkThree {
    public static void main(String[] args) {
        changeElements();
        fillArray();
        fillArrayTwo();
        fillArrayDiagonal();
        System.out.println(Arrays.toString(toretArr(3, 3)));
    }
    
    static void changeElements(){
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    
    static void fillArray() {
        int[] array = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(array));
    }
    
    static void fillArrayTwo() {
        int[] array = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) array[i] = array[i] * 2;
        }
        System.out.println(Arrays.toString(array));
    }
    
    static void fillArrayDiagonal() {
        int counter = 1;
        int [][] table = new int [3][3];
        for (int i = 0; i < 3; i++) {
            table[i][i] = 1;
            table[i][table.length - i -1] = 1;
        }
        Arrays.stream(table).map(Arrays::toString).forEach(System.out::println);
    }
    
    static int[] toretArr(int len, int initialValue) {
        int[] arr = new int[len];
        for(int i=0; i < arr.length; i++){
            arr[i] = initialValue;
        }
        return arr;
    }
}
