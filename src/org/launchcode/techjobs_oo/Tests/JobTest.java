package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import java.util.Objects;

import static org.junit.Assert.*;

public class JobTest {
    Job test_job1;
    Job test_job2;
    Job test_job3;
    Job test_job4;


    @Before
    public void createJobObject(){
        test_job1 = new Job(){};
        test_job2 = new Job(){};
        test_job3 = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
         test_job4 = new Job("Product tester",
                 new Employer("ACME"),
                 new Location("Desert"),
                 new PositionType("Quality control"),
                 new CoreCompetency("Persistence"));


    }

    @Test
    public void testSettingJobId(){
        assertEquals(1,test_job2.getId()-test_job1.getId());
        assertFalse(test_job1.getId() == (test_job2.getId()));
    }


    @Test
    public void testJobConstructorSetsAllFields() {
        assertEquals("Product tester", test_job3.getName());
        assertEquals("ACME", test_job3.getEmployer().toString());
        assertEquals("Desert", test_job3.getLocation().toString());
        assertEquals("Quality control", test_job3.getPositionType().toString());
        assertEquals("Persistence", test_job3.getCoreCompetency().toString());
        assertTrue(test_job3 instanceof Job);
        assertTrue(test_job3.getEmployer() instanceof Employer);
        assertTrue(test_job3.getLocation() instanceof Location);
        assertTrue(test_job3.getPositionType() instanceof PositionType);
        assertTrue(test_job3.getCoreCompetency() instanceof CoreCompetency);
    }
    @Test
     public void testJobsForEquality(){
        assertFalse(test_job3.equals(test_job4));

        }

        @Test
        public void testBlankLineBeforeAndAfter() {
        assertEquals('\n',test_job3.toString().charAt(0));
            assertEquals('\n',test_job3.toString().charAt(test_job3.toString().length()-1));

        }

     @Test
    public void testJobsForToString(){

        String expectedResult = "\n" + "ID: "+ test_job3.getId()+
                "\n" + "Name: " + test_job3.getName() +
                "\n" + "Employer: " + test_job3.getEmployer()+
                "\n" + "Location: " + test_job3.getLocation()+
                "\n" + "Position Type: " + test_job3.getPositionType()+
                "\n" + "Core Competency: " + test_job3.getCoreCompetency()+
                "\n"; //String.format

        assertEquals(expectedResult, test_job3.toString());
         //System.out.println(expectedResult);
         }

         @Test
         public void testIsFieldEmpty(){

             test_job3.getEmployer().setValue("");
             test_job3.setName("");
             test_job3.getLocation().setValue("");
             test_job3.getPositionType().setValue("");
             test_job3.getCoreCompetency().setValue("");

             //assertEquals("Employer: Data not available", "Employer: "+test_job3.getEmployer().toString());
             assertEquals(true,test_job3.toString().contains("Employer: Data not available"));
             assertEquals(true, test_job3.toString().contains("Name: Data not available"));
             assertEquals(true,test_job3.toString().contains("Location: Data not available"));
             assertEquals(true,test_job3.toString().contains("Position Type: Data not available"));
             assertEquals(true,test_job3.toString().contains("Core Competency: Data not available"));

             }


         }





