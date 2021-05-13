package za.ac.cput;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.HashSet;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;

class SubjectSetTest {
    Set<SubjectSet> subjectSet = new HashSet<>();
    SubjectSet details1 = new SubjectSet("ADP372S", "Applications Development Practice", "3rd Year");
    SubjectSet details2 = new SubjectSet("PRT362S", "Project 3", "3rd Year");
    SubjectSet details3 = new SubjectSet("ITS362S", "Information Systems 3", "3rd Year");

    //Adding objects to the set before each test is run - Set size = 3
    @BeforeEach
    void setUp(){
        subjectSet.add(details1);
        subjectSet.add(details2);
        subjectSet.add(details3);
    }

    //Adding a new object to the "BeforeEach" Set - Set size = 3 + 1
    @Test
    void setAddTest(){
        SubjectSet details4 = new SubjectSet("ADT372S", "Applications Development Theory 3", "3rd Year");
        subjectSet.add(details4);
        assertEquals(4, subjectSet.size());
    }

    //Removing an object from the "BeforeEach" Set - Set size = 3 - 1
    @Test
    void setRemoveTest(){
        subjectSet.remove(details1);
        assertEquals(2, subjectSet.size());
    }

    //finding details in the Set
    //True - this will pass as details1 is in the Set
    @Test
    void listFindTestTrue(){
        assertTrue(subjectSet.contains(details1));
    }

    //False - this will fail as details1 is in the Set
    @Test
    void listFindTestFalse(){
        assertFalse(subjectSet.contains(details1));
    }
}