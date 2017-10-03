package appleOrchard.tree;

import appleOrchard.apple.Apple;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class AppleTree
{
  protected int age;
  protected int ageLimit;
  protected int bearfruitAge;
  protected int heightLimit;
  protected int height;
  protected boolean isAlive;

  public boolean isAlive() {
    return isAlive;
  }

  protected int result;

  protected List<Apple> fruits = new ArrayList();

  public AppleTree() {
    age=0;
    isAlive=true;
    height=0;
  }

  public void grow() {
    height += 5;
  }

  public void produceFruit() {
    if(age > bearfruitAge) {
      Random r = new Random();
      int low = 2;
      int high = 6;
      result = r.nextInt(high-low) + low;

    }
  }

  public int getFruitCount() {
    return fruits.size();
  }


}
