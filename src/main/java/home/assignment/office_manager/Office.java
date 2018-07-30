package home.assignment.office_manager;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Objects;

public class Office {

	private Integer capacity;
	private Double monthlyPrice;
	private LocalDate startDate;
	private LocalDate endDate = null;

	Office(String capacity, String monthlyPrice, String startDate, String endDate) {
		this.capacity = Integer.parseInt(capacity);
		this.monthlyPrice = Double.parseDouble(monthlyPrice);
		this.startDate = LocalDate.parse(startDate.replaceAll("\\s+",""));
		if(Objects.nonNull(endDate))
			this.endDate = LocalDate.parse(endDate.replaceAll("\\s+",""));
	}

	public Boolean isOccupiedThisMonth(String stringMonthDate) {
		YearMonth monthDate = YearMonth.parse(stringMonthDate);
		if (startDate.isBefore(monthDate.atEndOfMonth()) && (Objects.isNull(endDate) || endDate.isAfter(monthDate.atDay(1))))
			return true;
		return false;
	}

	public Double calculateCostDuringMonth(String stringMonthDate) {
		Double cost = monthlyPrice;
		YearMonth monthDate = YearMonth.parse(stringMonthDate);
		Double lengthOfMonth = new Double(monthDate.lengthOfMonth());
		if (startDate.isAfter(monthDate.atDay(1))) 
			cost -= ((startDate.getDayOfMonth() - 1) / lengthOfMonth) * monthlyPrice; //substract begining of month, if not reserved
		if (Objects.nonNull(endDate) && endDate.isBefore(monthDate.atEndOfMonth()))
			cost -= ((lengthOfMonth - endDate.getDayOfMonth()) / lengthOfMonth) * monthlyPrice;  //substract end of month, if not reserved
		return cost;
	}

	public Integer getCapacity() {
		return capacity;
	}

}
