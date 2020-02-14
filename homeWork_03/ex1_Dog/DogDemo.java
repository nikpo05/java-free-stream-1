package lv.javaguru.lesson3;


public class DogDemo {
    public static void main(String[] args) {
        Dog newDog = new Dog();
        newDog.age = 5;
        newDog.color = "black";
        newDog.name = "Bark";
        newDog.voice();
        newDog.eat();
        newDog.sleep();
    }


}
