package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;
import java.util.stream.Collectors;


public class AnalyticsCounter {

	/**
	 * If no data is available, return an empty Map
	 *
	 * @return a map containing
	 * 	as key : each different string in List used in parameter
	 *  as value : number of occurs in the List of the string key
	 */

	public static Map<String,Long> CountStringOccurences(List<String> listStrings)
	{
		Map<String,Long> mapResult = new HashMap<>();

		if (listStrings!=null)
		{
			//browse the list of strings, grouping by string and counting the number of occurrences in the list
			mapResult = listStrings.stream().collect(Collectors.groupingBy(str -> str, Collectors.counting()));
		}
		 return  mapResult;
	}
}
