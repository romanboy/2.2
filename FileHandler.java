/*************************************************************************************
About: This program is written as part of the fulfilment for the ‘Data Structure and Algorithms’
Course - HND in CSD at Icon College, London.
Date : June 2016
By : Radu Ciuca. Student ID: 13448
*************************************************************************************/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

// Class to handle all the file operations
public class FileHandler {
    // Method to convert a file of strings to an array
    public String[] stringsFromFileToArray(Path path) {
        // BufferedReader to read file contents
        BufferedReader bufferedReader;
        // An ArrayList to hold the strings read from the file
        List<String> stringList = new ArrayList<>();
        try {
            // Create a BufferedReader to read from the file at the specified path
            bufferedReader = Files.newBufferedReader(path);

            // Must be initialized with null before we can use it in the loop
            String line = null;
            // We read one line from the file, if it is not null we will continue to read more lines
            while ((line = bufferedReader.readLine()) != null) {
                // Add the file to the ArrayList
                stringList.add(line);
            }
            // Close the file reader
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Convert the ArrayList to an array for sorting
        return stringList.toArray(new String[0]);
    }

    public void stringArrayToFile(String[] stringArray, Path path) {
        BufferedWriter bufferedWriter;
        try {
            // Create a BufferedWriter to write to the file at the specified path
            bufferedWriter = Files.newBufferedWriter(path);
            // Add every string to the file, the \n at the end means new line
            for (String string : stringArray) {
                bufferedWriter.write(string + "\n");
            }
            // Flush everything to the file
            bufferedWriter.flush();
            // Close the bufferedWriter
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
