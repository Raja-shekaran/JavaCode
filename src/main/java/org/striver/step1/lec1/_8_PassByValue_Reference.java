package org.striver.step1.lec1;


public class _8_PassByValue_Reference {
    public static class Dog{
        String name;
    }

    //Java is strictly pass by value
    public static void main(String[] args) {
        int x = 20;
        modify(x);
        System.out.println(x);

        //Pass by referenceLike
        Dog d = new Dog();
        d.name = "jacky";
        rename(d);
        System.out.println(d.name);

        //Pass by reassigning reference
        Dog dog = new Dog();
        dog.name = "jacky";
        reassign(dog);
        System.out.println(dog.name);

    }

    public static void reassign(Dog d){
        d = new Dog();
        d.name="mookey";
    }

    public static void rename(Dog d){
        d.name = "mookey";
    }

    public static void modify(int x){
        x = 10;
    }
}
