package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public class LaunchProgram {

    public static void main()  {


        ReadSymptomDataFromFile symptomReader = new ReadSymptomDataFromFile("../Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application/Project02Eclipse/symptoms.txt");

        List<String> symptomsList = symptomReader.getSymptoms();

        AnalyticsCounter analyticsCounter = new AnalyticsCounter();

        Map<String, Long> symptomsMap = analyticsCounter.countStringOccurences(symptomsList);

        OutputFileWriter.writeInFile(symptomsMap);

    }
}
