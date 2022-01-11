import java.util.Set;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTreeTest {

    void testTree() {

    //4. Above Employee pojo in a treeset
    Set<Employee> empTree = new TreeSet<>(new FirstNameCompare());

    //  Set<Employee> empTree = new TreeSet<Employee>();
        empTree.add(new Employee(101,"Rahul","Jadhav"));
        empTree.add(new Employee(102,"Shruti","Patil"));

        // Printing the TreeSet elements . define default sorting
        for(Employee e: empTree)
        {
            System.out.print(e.getId()+" "+e.getFirstName()+ " "+e.getLastName());
            System.out.println();
        }
        //2. define custom sorting based on firstname only
        System.out.println("Sort Based on First Name");
        for(Employee ele : empTree)
        {
            System.out.print(ele.getFirstName() +" "+ ele.getLastName());
            System.out.println();
        }
    }
}