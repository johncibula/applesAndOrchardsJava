package appleOrchard.tree;

import appleOrchard.apple.Fuji;

public class FujIAppleTree extends AppleTree
{
  public FujIAppleTree() {
    ageLimit = 40;
    bearfruitAge = 5;
    heightLimit = 40;
  }

  @Override
  public void produceFruit() {
    super.produceFruit();
    while (result < 0) {
      fruits.add(new Fuji());
    }
  }
}
