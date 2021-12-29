class HomeWorkSix {
    public static void main(String[] args){
        Cat cat = new Cat("Boss", 100, 0);
        Dog dog = new Dog("Thor", 120, 250);
        IAnimal[] animals = {cat, dog};
        for (IAnimal a : animals) {
            System.out.println(a);
            System.out.println(a.run(100));
            System.out.println(a.run(250));
            System.out.println(a.swim(6));
            System.out.println(a.swim(100));
        }
    }
}

class Cat extends Animal {
    Cat(String name, int limitRun, int limitSwim) {
        super(name, limitRun, limitSwim);
    }
    
    Cat(String name, int limitRun) {
        super(name, limitRun, 0);
    }
    
    @Override
    public String swim(int dist) {
        return name + " Кот не умеет плавать";
    }
}

class Dog extends Animal {
    Dog(String name, int limitRun, int limitSwim) {
        super(name, limitRun, limitSwim);
    }
}

interface IAnimal {
    String run(int dist);
    String swim(int dist);
}

abstract class Animal implements IAnimal{
    protected String name;
    protected int limitRun;
    protected int limitSwim;

    
    Animal (String name, int limitRun, int limitSwim) {
        this.name = name;
        this.limitRun = limitRun;
        this.limitSwim = limitSwim;
    }
    
    @Override
    public String run(int dist) {
        if (dist > limitRun) {
            return name + " невозможно пробежать дистанцию " + dist;
        } else {
            return name + " пробежал дистанцию " + dist;
        }
    }
    
    @Override
    public String swim(int dist){
        if(dist > limitSwim) {
            return name + " невозможно проплыть дистанцию " + dist;
        } else {
            return name + " проплыл дистанцию " + dist;
        }
    }
    
    @Override
    public String toString() {
        return name + " лимит бега " + limitRun + " лимит плавания " + limitSwim;
    }
}