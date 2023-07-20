package _01_05;

import java.awt.Color;

public class Main {
  public static void main(String[] args) {
    // Color myTrunkColor = Tree.TRUNK_COLOR;
    // Color myDefaultWhite = Color.WHITE;

    Color myDefaultBlue = Color.BLUE;
    Color brighterBlue = myDefaultBlue.brighter();
    System.out.println(brighterBlue);

    Color randomColor = new Color(122, 57, 10);
    System.out.println(randomColor.brighter());
  }
}
