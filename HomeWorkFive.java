/**
* Java 1. HomeWork #3
*
*@author Nikita Seleznev
*@version 23-24.12.2021
*
*/


class HomeWorkFive {
    public static void main(String[] args){
        //Person person = new Person("Nik Nik Nik", "Manager", "7926@mail.ru", "79262345555", 300000, 30);
        //System.out.println(person);
        //System.out.println(person.getAge());
        Person[] persArray = new Person[5];
            persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 28);
            persArray[1] = new Person("Sidorov Nikita", "Manager", "ivivan@mailbox.com", "892312312", 50000, 25);
            persArray[2] = new Person("Petrov Maksim", "Accountant", "ivivan@mailbox.com", "892312312", 40000, 42);
            persArray[3] = new Person("Korolev Aleksey", "Developer", "ivivan@mailbox.com", "892312312", 80000, 34);
            persArray[4] = new Person("Eremin Vladimir", "QA", "ivivan@mailbox.com", "892312312", 60000, 32);
        for(Person person : persArray) {
            if(person.getAge() > 40) {
                System.out.println(person);
            }
        }
    }
}

class Person {
    private String full_name;
    private String post;
    private String email;
    private String phone;
    private int pay;
    private int age;
    
    Person (String full_name, String post, String email, String phone, int pay, int age) {
        this.full_name = full_name;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.pay = pay;
        this.age = age;
    }
    
    public int getAge () {
        return age;
    }
    
    @Override
    public String toString (){
        return full_name + ", " + post + ", " + email + ", " + phone + ", " + pay + ", " + age;
    }

}
