import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Albus McShay", "AB123456C", 500.50, "sales");
    }

    @Test
    public void hasName() {
        Assert.assertEquals("Albus McShay", manager.getName());
    }

    @Test
    public void hasNationalInsuranceNum() {
        Assert.assertEquals("AB123456C", manager.getNationalInsuranceNum());
    }

    @Test
    public void hasSalary() {
        Assert.assertEquals(500.50, manager.getSalary(), 0);
    }

    @Test
    public void hasDeptName() {
        Assert.assertEquals("sales", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(600.00);
        Assert.assertEquals(600.00, manager.getSalary(), 0);
    }

    @Test
    public void canPayBonus() {
        Assert.assertEquals(5.005, manager.payBonus(), 0);
    }
}
