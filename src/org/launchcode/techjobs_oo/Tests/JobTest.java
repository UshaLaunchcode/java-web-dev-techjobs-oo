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
        assertFalse(test_job3 == test_job4);
        }

}
