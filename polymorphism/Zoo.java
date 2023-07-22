package polymorphism;

public class Zoo {

  public static void main(String[] args) {
    Dog rocky = new Dog();
    rocky.fetch();
    rocky.makeSound();
    feed(rocky);

    Animal sasha = new Dog();

    if (sasha instanceof Dog sashaTheDog) {
      sashaTheDog.fetch();
    }

    if (sasha instanceof Dog) {
      Dog sashaTheDog = (Dog) sasha;
      sashaTheDog.fetch();
    }

    sasha = new Cat();
    sasha.makeSound();
    feed(sasha);
    ((Cat) sasha).scratch();

    boolean isDog = sasha instanceof Dog;
    boolean isAnimal = sasha instanceof Animal;
    boolean isCat = sasha instanceof Cat;
    System.out.println(isDog);
    System.out.println(isAnimal);
    System.out.println(isCat);

  }

  public static void feed(Animal animal) {
    if (animal instanceof Dog) {
      System.out.println("Here's your dog food");
    } else {
      System.out.println("Here's your cat food");
    }
  }
}
