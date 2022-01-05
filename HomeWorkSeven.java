/**
* Java 1. HomeWork #7
*
*@author Nikita Seleznev
*@version 04.01.2022
*
*/


class HomeWorkSeven {
    public static void main(String[] args){
        Cat cat = new Cat("Boss", 6);
        Cat cat2 = new Cat("Balu", 9);
        Plate plate = new Plate(12);
        Cat[] cats = {cat, cat2};
        
        for(Cat a : cats) {
            System.out.println(a);
        }
        
        System.out.println(plate);
        System.out.println("Коты кушают");
        cat.eat(plate);
        cat2.eat(plate);
        System.out.println(plate);
        plate.addedFood(10);
        System.out.println(plate);
        
        for (Cat a : cats) {
            a.setHunger(false);
            a.eat(plate);
            System.out.println(a);
        }
        System.out.println(plate);
    }
}

class Cat {
    private String name;
    private int appetite;
    private boolean hunger;
    
    Cat(String name, int appetite){
        this.name = name;
        this.appetite = appetite;
        hunger = false;
    }
    
    void setHunger(boolean status) {
        hunger = status;
    }
    
    void eat(Plate plate) {
         if(!hunger) {
            hunger = plate.decreaseFood(appetite);
         }
    }
    
    @Override
    public String toString() {
        return "Cat: " + name + ", appetite: " + appetite + " hunger: " + hunger;
    }
    
    void eat(){
    }
}

class Plate {
    private int food;
    
    Plate(int food) {
        this.food = food;
    }

    boolean decreaseFood(int portion) {
        if (food < portion) {
            return false;
        }
        food -= portion;
        return true;
    }
    
    void addedFood(int food) {
        this.food += food;
    }

    @Override
    public String toString() {
        return "Food: " + food;
    }
    
    void info(){
        System.out.println("Food amount: " + food);
    }
}