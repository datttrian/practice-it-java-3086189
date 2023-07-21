package arrays;

public class Main {

  public static void main(String[] args) {
    String[] players = { "Bob", "Luke", "Chad" };

    for (int i = 0; i < players.length; i++) {
      if (players[i].equals("Chad")) {
        System.out.println(i);
      }
    }

    calculateSum(new int[] { 1, 2, 3, 4, 4, 4 });
  }

  public static void calculateSum(int... a) {
    int sum = 0;
    for (int i = 0; i < a.length; i++) {
      sum = sum + a[i];
    }
    System.out.println(sum);
  }
}
