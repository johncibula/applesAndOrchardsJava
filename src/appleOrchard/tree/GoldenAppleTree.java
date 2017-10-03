package appleOrchard.tree;

import appleOrchard.apple.Golden;

public class GoldenAppleTree extends AppleTree
{
  public GoldenAppleTree() {
    super();
    ageLimit = 60;
    bearfruitAge = 20;
    heightLimit = 60;
  }

  @Override
  public void produceFruit() {
    super.produceFruit();
    while (result < 0) {
      fruits.add(new Golden());
    }
  }
}
