package home.assignment.office_manager;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class OfficeManager {
	
	public static MonthlyStatistics calculateMonthlyStatistics(String date) {
		List<Office> officesList = readFile("resources/data.csv");
		Integer freeCapacity = 0;
		Double revenue = 0D;
		for (Office office : officesList) {
			if (office.isOccupiedThisMonth(date))
				revenue += office.calculateCostDuringMonth(date);
			else
				freeCapacity += office.getCapacity();
		}
		return new MonthlyStatistics(revenue, freeCapacity);
	}

	private static List<Office> readFile(String fileName){
		List<Office> officesData = new ArrayList<Office>();
	    String line = null;
	    try (BufferedReader stream = new BufferedReader(new FileReader(fileName))){
	        stream.readLine();
	        while ((line = stream.readLine()) != null) {
	            String[] splitted = line.split(",");
	            officesData.add(new Office(splitted[0], splitted[1], splitted[2], splitted.length < 4 ? null : splitted[3]));
	        }
	    } catch (IOException e) {
			e.printStackTrace();
	    }
	    return officesData;
	}
}
