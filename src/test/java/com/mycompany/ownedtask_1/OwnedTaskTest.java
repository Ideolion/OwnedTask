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
public class OwnedTaskTest {
    
    public OwnedTaskTest() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testOwnedTask() {
        System.out.println("OwnedTask");
       ArrayList<Object> objectsList = new ArrayList<Object>();
        objectsList.add(0, new Object(1,0));
        objectsList.add(1, new Object(2,0));
        objectsList.add(2, new Object(3,0));
        objectsList.add(3, new Object(4,0));
        objectsList.add(4, new Object(5,0));
        objectsList.add(5, new Object(6,0));
        objectsList.add(6, new Object(7,0));
        objectsList.add(7, new Object(8,0)); 
        
         ArrayList<Subject> subjectsList = new ArrayList<Subject>();
        subjectsList.add(0, new Subject(1,new int[]{2,3},false,false,false));
        subjectsList.add(1, new Subject(2,new int[]{2,4,5},false,false,false ));
        subjectsList.add(2, new Subject(3,new int[]{2},false,false,false));
        subjectsList.add(3, new Subject(2,new int[]{2,4,5},false,true,true));
        subjectsList.add(4, new Subject(4,new int[]{2,3},true,false,false));
        
        ArrayList<Object> expResult = objectsList;
        expResult.get(2).setSubjectName(2);
        expResult.get(3).setSubjectName(3);
        
        ArrayList<Object> result = OwnedTask.OwnedTask(objectsList, subjectsList);
         
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
