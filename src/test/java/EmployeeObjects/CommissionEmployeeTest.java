package EmployeeObjects;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommissionEmployeeTest {

    @Test
    void increaseSalesTest(){
        CommissionEmployee emp = new CommissionEmployee("Clint", "Barton", 6847, "Sales", "Customer Representative", .0265);

        System.out.println(emp.getSales());

        emp.increaseSales(100);
        assertEquals(100, emp.getSales());

        emp.increaseSales(100);
        assertEquals(200, emp.getSales());
    }

    @Test
    void decreaseSalesTest(){
        CommissionEmployee emp = new CommissionEmployee("Clint", "Barton", 6847, "Sales", "Customer Representative", .0265);

        System.out.println(emp.getSales());

        emp.increaseSales(100);
        assertEquals(100, emp.getSales());

        emp.increaseSales(-100);
        assertEquals(100, emp.getSales());
    }

    @Test
    void zeroSalesTest(){
        CommissionEmployee emp = new CommissionEmployee("Clint", "Barton", 6847, "Sales", "Customer Representative", .0265);

        System.out.println(emp.getSales());

        emp.increaseSales(100);
        assertEquals(100, emp.getSales());

        emp.increaseSales(0);
        assertEquals(100, emp.getSales());
    }

    @Test
    void holidayBonusTest(){
        CommissionEmployee emp = new CommissionEmployee("Clint", "Barton", 6847, "Sales", "Customer Representative", .0265);

        assertEquals(0, emp.holidayBonus());
    }

    @Test
    void annualRaiseTest(){
        CommissionEmployee emp = new CommissionEmployee("Clint", "Barton", 6847, "Sales", "Customer Representative", .0265);

        System.out.println(emp.getRate());

        emp.annualRaise();
        emp.annualRaise();
        assertEquals(0.0305, emp.getRate());
    }
}