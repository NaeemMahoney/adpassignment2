package za.ac.cput;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Collection;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeCollectionTest {
    //Creating a Collection using the HashSet
    Collection<EmployeeCollection> employeeCollection = new HashSet<>();
    EmployeeCollection employee1 = new EmployeeCollection(112, "Tony", "Stark");
    EmployeeCollection employee2 = new EmployeeCollection(113, "Peter", "Parker");
    EmployeeCollection employee3 = new EmployeeCollection(114, "Steve", "Rogers");

    //Adding Objects to the Collection before each test is run - Collection Size = 3
    @BeforeEach
    void mapSetUp(){
        employeeCollection.add(employee1);
        employeeCollection.add(employee2);
        employeeCollection.add(employee3);
    }

    //Adding a new object to the "Before Each" Collection  - Collection Size = 3 + 1
    @Test
    void mapAddTest(){
        EmployeeCollection employee4 = new EmployeeCollection(114, "John", "Wick");
        employeeCollection.add(employee4);
        assertEquals(4, employeeCollection.size());
    }

    //Removing an object from the "Before Each" Collection - Collection Size = 3 - 1
    @Test
    void mapRemoveTest(){
        employeeCollection.remove(employee1);
        assertEquals(2, employeeCollection.size());
    }

    //Fining an object the Collection
    //This test will pass as a object name employee1 exists in the Collection
    @Test
    void mapFindTest(){
        assertTrue(employeeCollection.contains(employee1));
    }

}