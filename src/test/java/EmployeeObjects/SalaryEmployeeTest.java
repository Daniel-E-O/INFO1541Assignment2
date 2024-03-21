package EmployeeObjects;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryEmployeeTest {

    @Test
    void calculateWeekleyPayTest() {
        SalaryEmployee emp = new SalaryEmployee("Steve", "Rodgers", 3781, "Sales", "Manager", 64325);
        assertEquals(1237.02, emp.calculateWeeklyPay());
    }

    @Test
    void holidayBonusTest() {
        SalaryEmployee emp = new SalaryEmployee("Steve", "Rodgers", 3781, "Sales", "Manager", 64325);
        assertEquals(2164.54, emp.holidayBonus());
    }
}