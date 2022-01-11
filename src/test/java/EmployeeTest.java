import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
   public void testEquals() {

        Set<Employee> emp = new HashSet<Employee>();

        Employee e1 = new Employee();
        Employee e2 = new Employee();
        e1.setId(1);
        e1.setFirstName("Ria");
        emp.add(e1);

        System.out.println(emp);

        e2.setFirstName("Ria");
        emp.add(e2);
        System.out.println(emp.size());
        System.out.println(emp);

    }

    @Test
    void testHashCode() {
    }
}