/*************************************************************************************
About: This program is written as part of the fulfilment for the ‘Data Structure and Algorithms’
Course - HND in CSD at Icon College, London.
Date : June 2016
By : Radu Ciuca. Student ID: 13448
*************************************************************************************/

// Class to handle all the sorting business
public class Sorter {

    public void quickSort(String[] stringArray, int low, int high) {
        int i = low, j = high;

        // Get the pivot element
        int pivot = low + (high - low) / 2;
        String value = stringArray[pivot];

        // Divide into two lists
        while (i <= j) {

            while (stringArray[i].compareTo(value) < 0) {
                i++;
            }

            while (stringArray[j].compareTo(value) > 0) {
                j--;
            }

            if (i <= j) {
                exchange(stringArray, i, j);
                i++;
                j--;
            }
        }

        // Recursion
        if (low < j) {
            quickSort(stringArray, low, j);
        }
        if (i < high) {
            quickSort(stringArray, i, high);
        }
    }

    public void bubbleSort(String[] stringArray) {
        String temp;
        for (int x = 1; x < stringArray.length; x++) {
            for (int y = 0; y < stringArray.length - x; y++) {
                if (stringArray[y].compareTo(stringArray[y + 1]) > 0) {
                    temp = stringArray[y];
                    stringArray[y] = stringArray[y + 1];
                    stringArray[y + 1] = temp;

                }
            }
        }
    }

    public void insertionSort(String[] stringArray)
    {
        String temp;
        for(int i = 1; i < stringArray.length; i++) // ar[i] is element to insert
        {
            temp = stringArray[i];
            int j = 0;
            for(j = i; j > 0; j--)
                if(temp.compareTo(stringArray[j - 1]) < 0)
                    stringArray[j] = stringArray[j - 1];
                else
                    break;
            stringArray[j] = temp;
        }
    }

    private void exchange(String[] stringArray, int i, int j) {
        String temp = stringArray[i];
        stringArray[i] = stringArray[j];
        stringArray[j] = temp;
    }
}
