package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class OutputFileWriter {

    /**
     * Write a Map into an output File with sorted elements by natural order (alphabetical)
     * @param mapToWrite map to Write, can have unsorted elements
     */
    public static void writeInFile(Map<String,Long> mapToWrite) {

        try {
            FileWriter writer = new FileWriter("result.out");

            // TreeMap is used to order elements by natural order (alphabetical)
            TreeMap<String, Long> sorted = new TreeMap<>(mapToWrite);

            // Loop on each element in the TreeMap and write the key value elements in file
            sorted.forEach((key,value) -> {
                        try {
                            writer.write(key + ": " + value.toString() + "\n");
                        } catch (IOException ioException) {
                            System.out.println("An error occurs when writing in output file. Error Message : " + ioException.getMessage());
                        }
                    });

            writer.close();
        } catch (IOException ioWriteException) {
            System.out.println("An error occurs during output file creation. Error Message : " + ioWriteException.getMessage());
        }
    }
}
