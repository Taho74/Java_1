/**
* Java 1. HomeWork #1
*
*@author Nikita Seleznev
*@version 11.12.2021
*
*/
class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    
    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    
    static void checkSumSign() {
        int a = -100;
        int b = 20;
        System.out.println((a + b >=0) ? "Сумма положительная" : "Сумма отрицательная");
    }
    
    static void printColor() {
        int value = 100;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 1 && value <= 100){
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
    
    static void compareNumbers() {
        int a = 5;
        int b = 9;
        System.out.println((a >= b) ? "a>=b" : "a<b");
    }
}