/*************************************************************************************
About: This program is written as part of the fulfilment for the ‘Data Structure and Algorithms’
Course - HND in CSD at Icon College, London.
Date : June 2016
By : Radu Ciuca. Student ID: 13448
*************************************************************************************/

import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {

        // Creating an instance of FileHandler which handles all the file stuff
        FileHandler fileHandler = new FileHandler();

        // Using the fileHandler to get the values from the unsorted file
        String[] quickSortArray = fileHandler.stringsFromFileToArray(Paths.get("unsorted.txt"));
        String[] bubbleSortArray = fileHandler.stringsFromFileToArray(Paths.get("unsorted.txt"));
        String[] insertionSortArray = fileHandler.stringsFromFileToArray(Paths.get("unsorted.txt"));

        // Create an instance of the Sorter class which handles all the sorting stuff
        Sorter sorter = new Sorter();

        // Using the quick sort method to quick sort the array
        sorter.quickSort(quickSortArray, 0, quickSortArray.length - 1);

        // Using bubble sort method to bubble sort the array
        sorter.bubbleSort(bubbleSortArray);

        // Using insertion sort method to insertion sort the array
        sorter.insertionSort(insertionSortArray);

        // Write the array values to the files
        fileHandler.stringArrayToFile(quickSortArray, Paths.get("quickSorted.txt"));
        fileHandler.stringArrayToFile(bubbleSortArray, Paths.get("bubbleSorted.txt"));
        fileHandler.stringArrayToFile(insertionSortArray, Paths.get("insertionSorted.txt"));
    }
}