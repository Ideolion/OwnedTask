/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.ownedtask_1;

import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author kiry
 */
public class TaskServiceTest {

    public TaskServiceTest() {
    }

    @BeforeEach
    public void setUp() {

    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testAllocationNormPrioritySubjects() {
        System.out.println("AllocationNormPrioritySubjects");

        ArrayList<Object> objectsList = new ArrayList<Object>();
        objectsList.add(0, new Object(1, 0));
        objectsList.add(1, new Object(2, 0));
        objectsList.add(2, new Object(3, 0));
        objectsList.add(3, new Object(4, 0));
        objectsList.add(4, new Object(5, 0));
        objectsList.add(5, new Object(6, 0));
        objectsList.add(6, new Object(7, 0));
        objectsList.add(7, new Object(8, 0));

        ArrayList<Subject> subjectsList = new ArrayList<Subject>();
        subjectsList.add(0, new Subject(1, new int[]{2, 3}, false, false, false));
        subjectsList.add(1, new Subject(2, new int[]{2, 4, 5}, false, false, false));
        subjectsList.add(2, new Subject(3, new int[]{2}, false, false, false));
        subjectsList.add(3, new Subject(4, new int[]{7, 8}, false, true, false));
        subjectsList.add(4, new Subject(5, new int[]{2, 8}, true, false, false));
        subjectsList.add(5, new Subject(2, new int[]{2, 4, 5}, false, false, true));

        TaskService instance = new TaskService();

        ArrayList<Object> expResult = new ArrayList<Object>();
        expResult.add(0, new Object(1, 0));
        expResult.add(1, new Object(2, 3));
        expResult.add(2, new Object(3, 1));
        expResult.add(3, new Object(4, 2));
        expResult.add(4, new Object(5, 2));
        expResult.add(5, new Object(6, 0));
        expResult.add(6, new Object(7, 0));
        expResult.add(7, new Object(8, 0));
    
        ArrayList<Object> result = instance.AllocationNormPrioritySubjects(objectsList, subjectsList);
        for (int i = 0; i < expResult.size(); i++) {
            assertEquals(expResult.get(i).subjectName, result.get(i).subjectName);
        }
        System.out.println("expResult: ");
        for (int i = 0; i < expResult.size(); i++) {
            System.out.print(expResult.get(i).objectName + " " + expResult.get(i).subjectName + " | ");
        }
        System.out.println("");
        System.out.println("result: ");
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i).objectName + " " + result.get(i).subjectName + " | ");
        }
        System.out.println("");
        //fail("The test case is a prototype.");
    }

    @Test
    public void testAllocationLoPrioritySubjects() {
        System.out.println("AllocationLoPrioritySubjects");
        ArrayList<Object> objectsList = new ArrayList<Object>();
        objectsList.add(0, new Object(1, 0));
        objectsList.add(1, new Object(2, 3));
        objectsList.add(2, new Object(3, 1));
        objectsList.add(3, new Object(4, 2));
        objectsList.add(4, new Object(5, 2));
        objectsList.add(5, new Object(6, 0));
        objectsList.add(6, new Object(7, 0));
        objectsList.add(7, new Object(8, 0));

        ArrayList<Subject> subjectsList = new ArrayList<Subject>();
        subjectsList.add(0, new Subject(1, new int[]{2, 3}, false, false, false));
        subjectsList.add(1, new Subject(2, new int[]{2, 4, 5}, false, false, false));
        subjectsList.add(2, new Subject(3, new int[]{2}, false, false, false));
        subjectsList.add(3, new Subject(4, new int[]{7, 8}, false, true, false));
        subjectsList.add(4, new Subject(5, new int[]{2, 8}, true, false, false));
        subjectsList.add(5, new Subject(2, new int[]{2, 4, 5}, false, false, true));

        TaskService instance = new TaskService();

        ArrayList<Object> expResult = new ArrayList<Object>();
        expResult.add(0, new Object(1, 0));
        expResult.add(1, new Object(2, 3));
        expResult.add(2, new Object(3, 1));
        expResult.add(3, new Object(4, 2));
        expResult.add(4, new Object(5, 2));
        expResult.add(5, new Object(6, 0));
        expResult.add(6, new Object(7, 0));
        expResult.add(7, new Object(8, 5));

        ArrayList<Object> result = instance.AllocationLoPrioritySubjects(objectsList, subjectsList);

        for (int i = 0; i < expResult.size(); i++) {
            assertEquals(expResult.get(i).subjectName, result.get(i).subjectName);
        }
      
        System.out.println("expResult: ");
        for (int i = 0; i < expResult.size(); i++) {
            System.out.print(expResult.get(i).objectName + " " + expResult.get(i).subjectName + " | ");
        }
        System.out.println("");
        System.out.println("result: ");
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i).objectName + " " + result.get(i).subjectName + " | ");
        }
        System.out.println("");
    }

    @Test
    public void testAllocationAvoidanceSubjects() {
        System.out.println("AllocationAvoidanceSubjects");
        ArrayList<Object> objectsList = new ArrayList<Object>();
        objectsList.add(0, new Object(1, 0));
        objectsList.add(1, new Object(2, 3));
        objectsList.add(2, new Object(3, 1));
        objectsList.add(3, new Object(4, 2));
        objectsList.add(4, new Object(5, 2));
        objectsList.add(5, new Object(6, 0));
        objectsList.add(6, new Object(7, 0));
        objectsList.add(7, new Object(8, 5));

        ArrayList<Subject> subjectsList = new ArrayList<Subject>();
        subjectsList.add(0, new Subject(1, new int[]{2, 3}, false, false, false));
        subjectsList.add(1, new Subject(2, new int[]{2, 4, 5}, false, false, false));
        subjectsList.add(2, new Subject(3, new int[]{2}, false, false, false));
        subjectsList.add(3, new Subject(4, new int[]{7, 8}, false, true, false));
        subjectsList.add(4, new Subject(5, new int[]{2, 8}, true, false, false));
        subjectsList.add(5, new Subject(2, new int[]{2, 4, 5}, false, false, true));

        TaskService instance = new TaskService();

        ArrayList<Object> expResult = new ArrayList<Object>();
        expResult.add(0, new Object(1, 0));
        expResult.add(1, new Object(2, 3));
        expResult.add(2, new Object(3, 1));
        expResult.add(3, new Object(4, 2));
        expResult.add(4, new Object(5, 2));
        expResult.add(5, new Object(6, 0));
        expResult.add(6, new Object(7, 4));
        expResult.add(7, new Object(8, 5));

        ArrayList<Object> result = instance.AllocationAvoidanceSubjects(objectsList, subjectsList);

        for (int i = 0; i < expResult.size(); i++) {
            assertEquals(expResult.get(i).subjectName, result.get(i).subjectName);
        }
        System.out.println("expResult: ");
        for (int i = 0; i < expResult.size(); i++) {
            System.out.print(expResult.get(i).objectName + " " + expResult.get(i).subjectName + " | ");
        }
        System.out.println("");
        System.out.println("result: ");
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i).objectName + " " + result.get(i).subjectName + " | ");
        }
        System.out.println("");
    }

    @Test
    public void testAllocationDeletionSubjects() {
        System.out.println("AllocationDeletionSubjects");
        ArrayList<Object> objectsList = new ArrayList<Object>();
        objectsList.add(0, new Object(1, 0));
        objectsList.add(1, new Object(2, 3));
        objectsList.add(2, new Object(3, 1));
        objectsList.add(3, new Object(4, 2));
        objectsList.add(4, new Object(5, 2));
        objectsList.add(5, new Object(6, 0));
        objectsList.add(6, new Object(7, 4));
        objectsList.add(7, new Object(8, 5));

        ArrayList<Subject> subjectsList = new ArrayList<Subject>();
        subjectsList.add(0, new Subject(1, new int[]{2, 3}, false, false, false));
        subjectsList.add(1, new Subject(2, new int[]{2, 4, 5}, false, false, false));
        subjectsList.add(2, new Subject(3, new int[]{2}, false, false, false));
        subjectsList.add(3, new Subject(4, new int[]{7, 8}, false, true, false));
        subjectsList.add(4, new Subject(5, new int[]{2, 8}, true, false, false));
        subjectsList.add(5, new Subject(2, new int[]{2, 4, 5}, false, false, true));

        TaskService instance = new TaskService();

         ArrayList<Object> expResult = new ArrayList<Object>();
        expResult.add(0, new Object(1, 0));
        expResult.add(1, new Object(2, 3));
        expResult.add(2, new Object(3, 1));
        expResult.add(3, new Object(4, 0));
        expResult.add(4, new Object(5, 0));
        expResult.add(5, new Object(6, 0));
        expResult.add(6, new Object(7, 4));
        expResult.add(7, new Object(8, 5));

        ArrayList<Object> result = instance.AllocationDeletionSubjects(objectsList, subjectsList);

        for (int i = 0; i < expResult.size(); i++) {
            assertEquals(expResult.get(i).subjectName, result.get(i).subjectName);
        }
        System.out.println("expResult: ");
        for (int i = 0; i < expResult.size(); i++) {
            System.out.print(expResult.get(i).objectName + " " + expResult.get(i).subjectName + " | ");
        }
        System.out.println("");
        System.out.println("result: ");
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i).objectName + " " + result.get(i).subjectName + " | ");
        }
        System.out.println("");
    }

}
