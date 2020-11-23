package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public class LaunchProgram {

    public static void main(String args[]) throws Exception {

        try {
            ReadSymptomDataFromFile symptomReader = new ReadSymptomDataFromFile("../Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application/Project02Eclipse/symptoms.txt");

            List<String> symptomsList = symptomReader.GetSymptoms();

            Map<String, Long> symptomsMap = AnalyticsCounter.CountStringOccurences(symptomsList);

            OutputFileWriter.WriteInFile(symptomsMap);
        }
        catch (Exception exception)
        {
            System.out.println("An error occurs, see details below : " + exception.getMessage());
        }
    }
}
