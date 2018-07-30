package home.assignment.office_manager;

import org.junit.jupiter.api.Test;

import home.assignment.office_manager.MonthlyStatistics;
import home.assignment.office_manager.OfficeManager;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class OfficeManagerTest {
	
	@Test
	public void testDevice() {
		MonthlyStatistics res = OfficeManager.calculateMonthlyStatistics("2018-01");
		assertNotNull(res);
		assertEquals(new Double(75500), res.getRevenue());
		assertEquals(new Integer(137), res.getFreeCapacity());
		
		res = OfficeManager.calculateMonthlyStatistics("2000-01");
		assertNotNull(res);
		assertEquals(new Double(0), res.getRevenue());
		assertEquals(new Integer(266), res.getFreeCapacity());
		
		res = OfficeManager.calculateMonthlyStatistics("2013-01");
		assertNotNull(res);
		assertEquals(new Double(8100), res.getRevenue());
		assertEquals(new Integer(254), res.getFreeCapacity());
		
		res = OfficeManager.calculateMonthlyStatistics("2013-06");
		assertNotNull(res);
		assertEquals(new Double(15150), res.getRevenue());
		assertEquals(new Integer(241), res.getFreeCapacity());
		
		res = OfficeManager.calculateMonthlyStatistics("2014-03");
		assertNotNull(res);
		assertEquals(new Double(37214.51612903226), res.getRevenue());
		assertEquals(new Integer(203), res.getFreeCapacity());
	}
}
