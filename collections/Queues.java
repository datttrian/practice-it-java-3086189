package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
  public static void main(String[] args) {
    Queue fruits = new LinkedList();
    fruits.add("apple");
    fruits.add("lemon");
    fruits.add("banana");
    fruits.add("orange");
    fruits.add("lemon");
    System.out.println(fruits);
    var removed = fruits.remove();
    System.out.println("Removed: " + removed);
    System.out.println("Head of queue: " + fruits.peek());
  }
}
