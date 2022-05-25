package com.premiumminds.internship.screenlocking;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by aamado on 05-05-2022.
 */
class ScreenLockinPattern implements IScreenLockinPattern {

  ExecutorService executorService = Executors.newSingleThreadExecutor();

  /**
   * Method to count patterns from firstPoint with the length
   * 
   * @param firstPoint initial matrix position
   * @param length     the number of points used in pattern
   * @return number of patterns
   */
  public Future<Integer> countPatternsFrom(final int firstPoint, final int length) {
    // Get all the numbers that the algorithm uses
    final List<Integer> allNumbersList = getAllNumbersList();

    // Get the size of all the possible patterns combinations
    final int finalAnswer = getAllValidCombinations(firstPoint, length, allNumbersList).size();

    // Return answer
    return executorService.submit(new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        return finalAnswer;
      }
    });
  }

  private List<List<Integer>> getAllValidCombinations(
      final int firstPoint,
      final int length,
      final List<Integer> allNumbersList) {
    // Instantiates a pattern list to store all combinations possible
    List<List<Integer>> allPatternsList = new ArrayList<>();

    // Instantiates a first combination list with the firstPoint chosen and add it
    // to the all patterns list
    List<Integer> firstCombinationList = new ArrayList<>();
    firstCombinationList.add(firstPoint);
    allPatternsList.add(firstCombinationList);

    // While the first element isn't the same length of the chosen length, fill the 
    // allPatternsList with valid combinations 
    while (allPatternsList.get(0).size() != length) {
      // Remove and get the first element to repopulate with the possible combinations
      firstCombinationList = allPatternsList.remove(0);

      // Get the list of the valid numbers to use from the first combination of the list
      List<Integer> availableNumbersList = getValidListOfNumbers(allNumbersList, firstCombinationList);

      // Add new valid combinations to the allPatternsList 
      for (Integer availableNumber : availableNumbersList) {
        List<Integer> validCombination = new ArrayList<>(firstCombinationList);
        validCombination.add(availableNumber);
        allPatternsList.add(validCombination);
      }
    }
    // Return the list with all the possible combinations needed for the problem
    return allPatternsList;
  }

  private List<Integer> getValidListOfNumbers(final List<Integer> allNumbersList, List<Integer> firstCombinationList) {
    // Get a copy of the all possible numbers to filter them, starting with the 
    // already chosen numbers 
    List<Integer> availableNumbersList = new ArrayList<>(allNumbersList);
    availableNumbersList.removeAll(firstCombinationList);

    // Filter and return the list by each case of the last element of the combination
    switch (firstCombinationList.get(firstCombinationList.size() - 1)) {
      case 1:
        return filterToNode1(firstCombinationList, availableNumbersList);
      case 2:
        return filterToNode2(firstCombinationList, availableNumbersList);
      case 3:
        return filterToNode3(firstCombinationList, availableNumbersList);
      case 4:
        return filterToNode4(firstCombinationList, availableNumbersList);
      case 6:
        return filterToNode6(firstCombinationList, availableNumbersList);
      case 7:
        return filterToNode7(firstCombinationList, availableNumbersList);
      case 8:
        return filterToNode8(firstCombinationList, availableNumbersList);
      case 9:
        return filterToNode9(firstCombinationList, availableNumbersList);
      case 5:
      default:
        return availableNumbersList;
    }
  }

  
  /**
   * A function where it returns a list of numbers from 1 to 9, inclusive and in a
   * sequential order
   * 
   * @return an ordered list of numbers from 1~9
   */
  private List<Integer> getAllNumbersList() {
    List<Integer> listToReturn = new ArrayList<>(9);
    listToReturn.add(1);
    listToReturn.add(2);
    listToReturn.add(3);
    listToReturn.add(4);
    listToReturn.add(5);
    listToReturn.add(6);
    listToReturn.add(7);
    listToReturn.add(8);
    listToReturn.add(9);
    return new ArrayList<>(listToReturn);
  }

  private List<Integer> filterToNode9(List<Integer> combinationList, List<Integer> availableNumbersList) {
    if (!combinationList.contains(6) && availableNumbersList.contains(3)) {
      availableNumbersList.remove((Integer) 3);
    }
    if (!combinationList.contains(5) && availableNumbersList.contains(1)) {
      availableNumbersList.remove((Integer) 1);
    }
    if (!combinationList.contains(8) && availableNumbersList.contains(7)) {
      availableNumbersList.remove((Integer) 7);
    }
    return availableNumbersList;
  }

  private List<Integer> filterToNode8(List<Integer> combinationList, List<Integer> availableNumbersList) {
    if (!combinationList.contains(5) && availableNumbersList.contains(2)) {
      availableNumbersList.remove((Integer) 2);
    }
    return availableNumbersList;
  }

  private List<Integer> filterToNode7(List<Integer> combinationList, List<Integer> availableNumbersList) {
    if (!combinationList.contains(4) && availableNumbersList.contains(1)) {
      availableNumbersList.remove((Integer) 1);
    }
    if (!combinationList.contains(5) && availableNumbersList.contains(3)) {
      availableNumbersList.remove((Integer) 3);
    }
    if (!combinationList.contains(8) && availableNumbersList.contains(9)) {
      availableNumbersList.remove((Integer) 9);
    }
    return availableNumbersList;
  }

  private List<Integer> filterToNode6(List<Integer> combinationList, List<Integer> availableNumbersList) {
    if (!combinationList.contains(5) && availableNumbersList.contains(4)) {
      availableNumbersList.remove((Integer) 4);
    }
    return availableNumbersList;
  }

  private List<Integer> filterToNode4(List<Integer> combinationList, List<Integer> availableNumbersList) {
    if (!combinationList.contains(5) && availableNumbersList.contains(6)) {
      availableNumbersList.remove((Integer) 6);
    }
    return availableNumbersList;
  }

  private List<Integer> filterToNode3(List<Integer> combinationList, List<Integer> availableNumbersList) {
    if (!combinationList.contains(2) && availableNumbersList.contains(1)) {
      availableNumbersList.remove((Integer) 1);
    }
    if (!combinationList.contains(5) && availableNumbersList.contains(7)) {
      availableNumbersList.remove((Integer) 7);
    }
    if (!combinationList.contains(6) && availableNumbersList.contains(9)) {
      availableNumbersList.remove((Integer) 9);
    }
    return availableNumbersList;
  }

  private List<Integer> filterToNode2(List<Integer> combinationList, List<Integer> availableNumbersList) {
    if (!combinationList.contains(5) && availableNumbersList.contains(8)) {
      availableNumbersList.remove((Integer) 8);
    }
    return availableNumbersList;
  }

  private List<Integer> filterToNode1(List<Integer> combinationList, List<Integer> availableNumbersList) {
    if (!combinationList.contains(2) && availableNumbersList.contains(3)) {
      availableNumbersList.remove((Integer) 3);
    }
    if (!combinationList.contains(5) && availableNumbersList.contains(9)) {
      availableNumbersList.remove((Integer) 9);
    }
    if (!combinationList.contains(4) && availableNumbersList.contains(7)) {
      availableNumbersList.remove((Integer) 7);
    }
    return availableNumbersList;
  }
}
