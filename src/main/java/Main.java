import java.io.FileOutputStream;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        //4. Above Employee pojo in a treeset
        Set<Employee> empTree = new TreeSet<>(new FirstNameCompare());

      //  Set<Employee> empTree = new TreeSet<Employee>();
        empTree.add(new Employee(101,"Rahul", "Jadhav"));
        empTree.add(new Employee(102,"Shruti","Patil"));

        // Printing the TreeSet elements -1. define default sorting
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

        //5. Given a list of numbers find square of each number using streams
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

        List<Integer> squareList = numbers.stream().map( i -> i*i).
                collect(Collectors.toList());
        System.out.println("Squares List: " + squareList);

        //6. Given a list of numbers find square of all even numbers using streams
        List<Integer> evenNoSquareList = numbers.stream()
                .filter(i -> i%2 == 0)
                .map(i -> i*2)
                .collect(Collectors.toList());
        System.out.println("Even No. Squares List: " + evenNoSquareList);

        //7. Try with resource, check if the resource has closed after execution
        try(FileOutputStream fileOutputStream=
                        new FileOutputStream("D://Union.txt")){
            // code to write data into file
            String msg = "Welcome to TransUnion!";
            byte byteArray[] = msg.getBytes();  // Converting string into byte array
            fileOutputStream.write(byteArray);  // Writing  data into file
            System.out.println("Data written successfully!");
        }catch(Exception exception){
            System.out.println(exception);
        }
        finally{
            System.out.println("Finally executes after closing of declared resources.");
        }

    }
}
