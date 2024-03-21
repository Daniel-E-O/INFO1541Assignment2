package EmployeeObjects;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HourlyEmployeeTest {

    @Test
    void increaseHoursTest() {
        HourlyEmployee emp = new HourlyEmployee("Tony", "Stark", 5749, "Service", "Lead Service Manager", 32.85);
        System.out.println(emp.getHoursWorked());

        emp.increaseHours(4);
        assertEquals(4, emp.getHoursWorked());

        emp.increaseHours(4);
        assertEquals(8, emp.getHoursWorked());
    }

    @Test
    void decreaseHoursTest() {
        HourlyEmployee emp = new HourlyEmployee("Tony", "Stark", 5749, "Service", "Lead Service Manager", 32.85);
        System.out.println(emp.getHoursWorked());

        emp.increaseHours(4);
        assertEquals(4, emp.getHoursWorked());

        emp.increaseHours(-4);
        assertEquals(4, emp.getHoursWorked());
    }

    @Test
    void zeroHoursTest() {
        HourlyEmployee emp = new HourlyEmployee("Tony", "Stark", 5749, "Service", "Lead Service Manager", 32.85);
        System.out.println(emp.getHoursWorked());

        emp.increaseHours(4);
        assertEquals(4, emp.getHoursWorked());

        emp.increaseHours(0);
        assertEquals(4, emp.getHoursWorked());
    }

    @Test
    void annualRaiseTest() {
        HourlyEmployee emp = new HourlyEmployee("Tony", "Stark", 5749, "Service", "Lead Service Manager", 32.85);

        System.out.println(emp.getWage());
        emp.annualRaise();
        assertEquals(34.49, emp.getWage());
    }

    @Test
    void calculateWeeklyPayTestOne() {
        HourlyEmployee emp = new HourlyEmployee("Tony", "Stark", 5749, "Service", "Lead Service Manager", 32.85);

        emp.increaseHours(35);
        assertEquals(1149.75, emp.calculateWeeklyPay());
    }

    @Test
    void calculateWeeklyPayTestTwo() {
        HourlyEmployee emp = new HourlyEmployee("Tony", "Stark", 5749, "Service", "Lead Service Manager", 32.85);

        emp.increaseHours(45);
        assertEquals(1560.38, emp.calculateWeeklyPay());
    }
}