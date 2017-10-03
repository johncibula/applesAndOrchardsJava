package appleOrchard.tree;

import appleOrchard.apple.RedDelicious;

public class RedDeliciousAppleTree extends AppleTree
{
  public RedDeliciousAppleTree() {
    super();
    ageLimit = 50;
    bearfruitAge = 10;
    heightLimit = 50;
  }

  @Override
  public void produceFruit() {
    super.produceFruit();
    while (result < 0) {
      fruits.add(new RedDelicious());
    }
  }
}
