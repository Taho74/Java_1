/**
* Java 1. HomeWork #2
*
*@author Nikita Seleznev
*@version 13.12.2021
*
*/

class HomeWorkTwo {
    public static void main (String[] args) {
        System.out.println(checkSum(15, 1));
        checkSumSign();
        System.out.println(checSumSignTwo(-2));
        printWords("word",5);
    }
    
    static boolean checkSum(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }
    
    static void checkSumSign() {
        int a = -1;
        System.out.println((a >= 0) ? "Положительное число" : "Отрицательное число");
    }
    
    static boolean checSumSignTwo(int a) {
        return a >= 0;
    }
    
    static void printWords(String word, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(word);
        }
    }
}
