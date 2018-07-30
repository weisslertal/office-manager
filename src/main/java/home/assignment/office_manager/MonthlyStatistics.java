package home.assignment.office_manager;

public class MonthlyStatistics {
	Double revenue;
	Integer freeCapacity;
	
	public MonthlyStatistics(Double revenue, Integer freeCapacity) {
		this.revenue = revenue;
		this.freeCapacity = freeCapacity;
	}
	
	public Double getRevenue() {
		return revenue;
	}
	public Integer getFreeCapacity() {
		return freeCapacity;
	}
}
