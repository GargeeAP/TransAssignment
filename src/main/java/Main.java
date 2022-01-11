//import java.io.FileOutputStream;
//import java.util.*;
//import java.util.stream.Collectors;
//
public class Main {
//
    public static void main(String[] args) {
//
//        //4. Above Employee pojo in a treeset
//        Set<Employee> empTree = new TreeSet<>(new FirstNameCompare());
//
//      //  Set<Employee> empTree = new TreeSet<Employee>();
//        empTree.add(new Employee(101,"Rahul", "Jadhav"));
//        empTree.add(new Employee(102,"Ahruti","Patil"));
//
//
//
//        //5. Given a list of numbers find square of each number using streams
//        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
//
//        List<Integer> squareList = numbers.stream().map( i -> i*i).
//                collect(Collectors.toList());
//        System.out.println("Squares List: " + squareList);
//
//        //6. Given a list of numbers find square of all even numbers using streams
//        List<Integer> evenNoSquareList = numbers.stream()
//                .filter(i -> i%2 == 0)
//                .map(i -> i*2)
//                .collect(Collectors.toList());
//        System.out.println("Even No. Squares List: " + evenNoSquareList);
//
//        //7. Try with resource, check if the resource has closed after execution
//        try(FileOutputStream fileOutputStream=
//                        new FileOutputStream("D://Union.txt")){
//            // code to write data into file
//            String msg = "Welcome to TransUnion!";
//            byte byteArray[] = msg.getBytes();  // Converting string into byte array
//            fileOutputStream.write(byteArray);  // Writing  data into file
//            System.out.println("Data written successfully!");
//
//        }catch(Exception exception){
//            System.out.println(exception);
//        }
//        finally{
//
//            System.out.println("Finally executes after closing of declared resources.");
//        }
//
//        //2.There are 5 threads, T1,T2,T3,T4,T5
//        //T5 should begin processing only after all the remaining threads finish processing
//        List<Thread> threads = new ArrayList<>();
//        Thread t1= new Thread("t1");
//        Thread t2 = new Thread("t2");
//        Thread t3 = new Thread("t3");
//        Thread t4 = new Thread("t4");
//        Thread t5 = new Thread("t5");
//        threads.add(t1);
//        threads.add(t2);
//        threads.add(t3);
//        threads.add(t4);
//        threads.add(t5);
//
//        try {
//            for (Thread t : threads) {
//                System.out.println(t);
//                t.join();
//            }
//        }
//        catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        //Write multiple junits to study the behaviour when 2 employees with same details are added to hashset
//        Set<Employee> emp = new HashSet<Employee>();
//
//        Employee e1 = new Employee(1, "Gargee", "Patil");
//        Employee e2 = new Employee(1, "Gargee", "Patil");
//
//        emp.add(e1);
//        emp.add(e2);
//        for(Employee e : emp){
//            System.out.println(e.getId() + e.getFirstName() + e.getLastName());
//        }
    }
}
