package appleOrchard.orchard;

import appleOrchard.apple.Apple;
import appleOrchard.apple.AppleType;
import appleOrchard.tree.AppleTree;
import appleOrchard.tree.FujIAppleTree;
import appleOrchard.tree.GoldenAppleTree;
import appleOrchard.tree.RedDeliciousAppleTree;
import appleOrchard.tree.TreeType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Orchard
{
  private List<AppleTree> trees = new ArrayList<>();
  private Map<TreeType,Integer> treeLedger = new HashMap<>();

  public Orchard() {
    for (TreeType treeType : TreeType.values()) {
      treeLedger.put(treeType,0);
    }
  }

  public int treeCount() {
    return trees.size();
  }

  public int treeCount(TreeType tree) {
    return treeLedger.get(tree);
  }

  public int appleCount() {
    int count = 0;
    for (AppleTree tree : trees) {
      count += tree.getFruitCount();
    }
    return count;
  }

  public int appleCount(AppleType apple) {
    return treeLedger.get(apple);
  }

  public void plant(TreeType tree) {
    int previousValue = treeLedger.get(tree);
    treeLedger.put(tree, previousValue += 1);

    switch (tree) {
      case FUJITREE:
        trees.add(new FujIAppleTree());
        break;
      case REDDELICIOUSTREE:
        trees.add(new RedDeliciousAppleTree());
        break;
      case GOLDENTREE:
        trees.add(new GoldenAppleTree());
        break;
    }
  }

  public void bulldoze() {
    for (AppleTree tree : trees) {
      if(!tree.isAlive()) {
        trees.remove(tree);
        updateLedger(tree);
      }
    }
  }

  public void updateLedger(AppleTree tree) {
   int previousValue;
    if (tree instanceof FujIAppleTree) {
     previousValue = treeLedger.get(TreeType.FUJITREE);
     treeLedger.put(TreeType.FUJITREE,previousValue -= 1 );
    }
    else if(tree instanceof RedDeliciousAppleTree) {
      previousValue = treeLedger.get(TreeType.REDDELICIOUSTREE);
      treeLedger.put(TreeType.REDDELICIOUSTREE,previousValue -= 1 );
    }
    else if(tree instanceof GoldenAppleTree) {
      previousValue = treeLedger.get(TreeType.GOLDENTREE);
      treeLedger.put(TreeType.GOLDENTREE,previousValue -= 1 );
    }
  }
}
