package com.csc;

import java.util.ArrayList;

public class FuzzyFinder
{
  // Your code goes here!
  public static void main(String args[])
  {
    System.out.println("In addition to your search functions, you can write a main function if you wish!");
  }

  public static int linearSearch(ArrayList<Fuzzy> inputList)
  {
    for(int i = 0; i < inputList.size(); i++)
    {
      if(inputList.get(i).color.equals("gold"))
      {
        return i;
      }
    }

    return -1;
  }
}
