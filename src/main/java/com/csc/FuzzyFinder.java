package com.csc;

import java.util.ArrayList;

public class FuzzyFinder
{
  // Your code goes here!
  public static void main(String args[])
  {
    System.out.println("Test");
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

  public static int binarySearch(ArrayList<Fuzzy> inputList)
  {
    int low = 0;
    int high = inputList.size() - 1;

    while(low <= high)
    {
      int mid = (low + high) / 2;
      System.out.println(mid);
      if(inputList.get(mid).color.equals("gold"))
      {
        return mid;
      }
      else if(inputList.get(mid).color.compareTo("gold") < 0)
      {
        low = mid + 1;
      }
      else
      {
        high = mid - 1;
      }
    }
    return -1;
  }
}
