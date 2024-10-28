package com.csc;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestFuzzyFinder {

  FuzzyFinder finder;
  FuzzyListGenerator generator;

  @BeforeEach
  void setUp() {
    finder = new FuzzyFinder();
    generator = new FuzzyListGenerator();
  }
/* 
  @Test
  void exampleFailingTestWithRandomizedFuzzies() {
    ArrayList<Fuzzy> fuzzies = generator.randomizedRainbowFuzzies();
    assertEquals("purple", fuzzies.getFirst().color);
  }

  @Test
  void exampleFailingTestWithSortedFuzzies() {
    ArrayList<Fuzzy> fuzzies = generator.sortedRainbowFuzzies();
    assertEquals("purple", fuzzies.getFirst().color);
  }*/

  @Test
  void testLinearSearchSorted() {
    ArrayList<Fuzzy> fuzzies = generator.sortedRainbowFuzzies();
    assertEquals(1000, finder.linearSearch(fuzzies));
  }

  @Test
  void testLinearSearchRandomized() {
    ArrayList<Fuzzy> fuzzies = generator.randomizedRainbowFuzzies();
    int i = -1;
    int index = 0;
    while(i == -1)
    {
      if(fuzzies.get(index).color.equals("gold"))
      {
        i = index;
      }
      index++;
    }
    assertEquals(i, finder.linearSearch(fuzzies));
  }

  @Test
  void testBinarySearchSorted() {
    ArrayList<Fuzzy> fuzzies = generator.sortedRainbowFuzzies();
    assertEquals(1000, finder.binarySearch(fuzzies));
  }

  @Test
  void testBinarySearchRandomized() {
    ArrayList<Fuzzy> fuzzies = generator.randomizedRainbowFuzzies();
    int i = -1;
    int index = 0;
    while(i == -1)
    {
      if(fuzzies.get(index).color.equals("gold"))
      {
        i = index;
      }
      index++;
    }
    assertEquals(i, finder.binarySearch(fuzzies));
  }
}
