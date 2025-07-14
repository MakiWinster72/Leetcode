package Interview.T380;

import java.util.*;

public class RandomizedSet {
  List<Integer> list;
  Map<Integer, Integer> map;
  Random rand;

  public RandomizedSet() {
    list = new ArrayList<>();
    map = new HashMap<>();
    rand = new Random();
  }

  public boolean insert(int val) {
    if (map.containsKey(val)) return false;
    list.add(val);
    map.put(val, list.size() - 1);
    return true;
  }

  public boolean remove(int val) {
    if (!map.containsKey(val)) return false;

    int index = map.get(val);
    int lastVal = list.get(list.size() - 1);

    list.set(index, lastVal);
    map.put(lastVal, index);

    list.remove(list.size() - 1);
    map.remove(val);

    return true;
  }

  public int getRandom() {
    return list.get(rand.nextInt(list.size()));
  }
}
