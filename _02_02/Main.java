package _02_02;

import java.awt.Color;

public class Main {
  Tree myFavoriteMapleTree = new Tree(90, 30, TreeType.MAPLE);

  public static void main(String[] args) {
    Tree myFavoriteMapleTree = new Tree(90, 30, TreeType.MAPLE);
    System.out.println(myFavoriteMapleTree.getTreeType());
    System.out.println(myFavoriteMapleTree.getHeightFt());
    System.out.println(myFavoriteMapleTree.getTrunkDiameterInches());

    // myFavoriteMapleTree.setHeightFt(180);
    myFavoriteMapleTree.grow();
    System.out.println(myFavoriteMapleTree.getHeightFt());

    myFavoriteMapleTree.setHeightFt(50);
    System.out.println(myFavoriteMapleTree.getHeightFt());
  }
}
