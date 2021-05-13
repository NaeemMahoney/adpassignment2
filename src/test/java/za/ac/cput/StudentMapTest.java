package za.ac.cput;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

class StudentMapTest {
    Map<Integer, StudentMap> studentMap = new HashMap<>();
    StudentMap student1 = new StudentMap(23040, "Will", "Smith", "AppDev");
    StudentMap student2 = new StudentMap(21820, "Steve", "Jobs", "CommNet");
    StudentMap student3 = new StudentMap(20950, "Bill", "Gates", "MultiMedia");

    //Adding Objects to the Map before each test is run - Map Size = 3
    @BeforeEach
    void mapSetUp(){
        studentMap.put(01, student1);
        studentMap.put(02, student1);
        studentMap.put(03, student1);
    }

    //Adding a new object to the "Before Each" Map  - Map Size = 3 + 1
    @Test
    void mapAddTest(){
        StudentMap student4 = new StudentMap(20020, "Tom", "Hardy", "MultiMedia");
        studentMap.put(04, student4);
        assertEquals(4, studentMap.size());
    }

    //Removing an object from the "Before Each" Map using only its key - Map Size = 3 - 1
    @Test
    void mapRemoveTest(){
        studentMap.remove(01);
        assertEquals(2, studentMap.size());
    }

    //Removing an object from the "Before Each" Map using its key and instance - Map Size = 3 - 1
    @Test
    void mapRemoveTest2(){
        studentMap.remove(01, student1);
        assertEquals(2, studentMap.size());
    }

    //Fining an object in a map
    //This test will pass as a object with the key "01" exists in the map
    @Test
    void mapFindTest(){
        assertTrue(studentMap.containsKey(01));
    }

    //This test will fail as a object with the key "05" does not exist in the map
    @Test
    void mapFindTest2(){
        assertTrue(studentMap.containsKey(05));
    }
}