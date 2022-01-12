import Staff.Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director("Jeff", "SC999N12", 100000.00, "EMT", 4000000.00);

    }

    @Test
    public void directorExists() {
        assertEquals("Jeff", director.getName());
        assertEquals("SC999N12", director.getNI());
        assertEquals(100000.00, director.getSalary(), 0.0);
        assertEquals("EMT", director.getDeptName());
        assertEquals(4000000.00, director.getBudget(), 0.0);
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(1.02);
        assertEquals(102000.00, director.getSalary(), 0.0);
    }

    @Test
    public void canPayBonus() {
        assertEquals(2000.00, director.payBonus(), 0.0);
    }

    @Test
    public void CantDecreaseSalary(){
        director.raiseSalary(0.90);
        assertEquals(100000.00, director.getSalary(), 0.0);
    }

    @Test
    public void CanChangeName(){
        director.setName("Bill");
        assertEquals("Bill", director.getName());
    }

    @Test
    public void cantChangeNameToNull(){
        director.setName("");
        assertEquals("Jeff", director.getName());
    }

}
