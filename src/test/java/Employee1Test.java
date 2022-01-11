import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class Employee1Test {

    @Test
    public void testSize(){
        HashSet<Employee> emp = new HashSet<Employee>();
        Employee e1 = new Employee(20,"abc","pqr");
        Employee e2 = new Employee(21,"abc","pqr");
        emp.add(e1);
        emp.add(e2);

        assertEquals(2, emp.size());


    }
}