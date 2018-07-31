package home.assignment.office_manager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class App {
	public static void main(String[] args) {
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new InputStreamReader(System.in));
			while (true) {
				System.out.println("Please enter a month to analyze (in YYYY-MM format):");
				String date = reader.readLine();
				MonthlyStatistics monthlyStatistics = new OfficeManager().calculateMonthlyStatistics(date);
				System.out.println(date + ": expected revenue: $"
						+ new DecimalFormat("#,###.00").format(monthlyStatistics.getRevenue())
						+ ", expected total capacity of the unreserved offices: " + monthlyStatistics.getFreeCapacity()
						+ "\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
