package org.example;

import java.util.HashMap;
import java.util.Map;

public class AnagramChecker {
  public boolean areAnagrams(String firstString, String secondString) {
    AnagramCheckingStrategy anagramCheckingStrategy = new MapStrategy();
    return anagramCheckingStrategy.checkIfAnagrams(firstString, secondString);
  }
}

class MapStrategy implements AnagramCheckingStrategy {
  @Override
  public boolean checkIfAnagrams(String firstString, String secondString) {
    Map<Character, Integer> map = new HashMap<>();
    for (char c : firstString.toCharArray()) {
      map.put(c, map.getOrDefault(c, 0) + 1);
    }
    for (char c : secondString.toCharArray()) {
      map.put(c, map.getOrDefault(c, 0) - 1);
    }
    for (Map.Entry<Character, Integer> pair : map.entrySet()) {
      if (pair.getValue() != 0) return false;
    }
    return true;
  }
}
