package org.example;

/** Hello world! */
public class App {
  public static void main(String[] args) {
    AnagramChecker anagramChecker = new AnagramChecker();
    String firstString = "listen";
    String secondString = "silent";
    boolean areAnagrams = anagramChecker.areAnagrams(firstString, secondString);
    System.out.println("Given Strings are anagrams :: " + areAnagrams);
  }
}
