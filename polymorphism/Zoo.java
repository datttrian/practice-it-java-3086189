package polymorphism;

public class Zoo {

  public static void main(String[] args) {
    Dog rocky = new Dog();
    rocky.fetch();
    rocky.makeSound();

    Animal sasha = new Dog();
    sasha.makeSound();

    Dog sashaTheDog = (Dog) sasha;
    sashaTheDog.fetch();

    sasha = new Cat();
    sasha.makeSound();
    ((Cat) sasha).scratch();

  }
}
