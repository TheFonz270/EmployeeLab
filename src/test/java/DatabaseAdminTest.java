import Staff.Management.Manager;
import Staff.TechStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

        DatabaseAdmin databaseAdmin;

        @Before
        public void before() {
            databaseAdmin = new DatabaseAdmin("Bob", "SC111N12", 25000.00);

        }

        @Test
        public void adminExists() {
            assertEquals("Bob", databaseAdmin.getName());
            assertEquals("SC111N12", databaseAdmin.getNI());
            assertEquals(25000.00, databaseAdmin.getSalary(), 0.0);
        }

        @Test
        public void canRaiseSalary() {
            databaseAdmin.raiseSalary(1.02);
            assertEquals(25500.00, databaseAdmin.getSalary(), 0.0);
        }

        @Test
        public void canPayBonus() {
            assertEquals(250.00, databaseAdmin.payBonus(), 0.0);
        }

    }

