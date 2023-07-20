package _01_02;

public class Main {
  public static void main(String[] args) {
    Tree myFavoriteOakTree = new Tree(120, 12, TreeType.OAK);
    myFavoriteOakTree.announceTallTree();
    Tree myFavoriteMapleTree = new Tree(90, 30, TreeType.MAPLE);
    myFavoriteMapleTree.announceTallTree();

    System.out.println(Tree.TRUNK_COLOR);
    Tree.announceTree();
  }
}
