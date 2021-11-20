/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ownedtask_1;

import java.util.ArrayList;

/**
 *
 * @author kiry
 */
public class TaskService implements InterfaceTaskService {

    @Override
    public ArrayList<Object> AllocationNormPrioritySubjects(ArrayList<Object> objectsList, ArrayList<Subject> subjectsList) {

        for (int i = 0; i < subjectsList.size(); i++) {
            if (!subjectsList.get(i).lowrtio && !subjectsList.get(i).markDeletion && !subjectsList.get(i).avoidance) {
                int subjectName = subjectsList.get(i).getSubjectName();
                int[] objectsOwned = subjectsList.get(i).getObjectsOwned();
                for (int j = 0; j < objectsOwned.length; j++) {
                    for (Object Object : objectsList) {
                        if (Object.getObjectName() == objectsOwned[j]) {
                            Object.setSubjectName(subjectName);
                        }
                    }
                }
            }
        }
        return objectsList;
    }

    @Override
    public ArrayList<Object> AllocationLoPrioritySubjects(ArrayList<Object> objectsList, ArrayList<Subject> subjectsList) {

        for (int i = 0; i < subjectsList.size(); i++) {
            if (subjectsList.get(i).lowrtio && !subjectsList.get(i).markDeletion && !subjectsList.get(i).avoidance && !subjectsList.get(i).markDeletion) {
                int subjectName = subjectsList.get(i).getSubjectName();
                int[] objectsOwned = subjectsList.get(i).getObjectsOwned();
                for (int j = 0; j < objectsOwned.length; j++) {
                    for (Object Object : objectsList) {
                        if (Object.getObjectName() == objectsOwned[j]) {
                            if (Object.getSubjectName() == 0) {
                                Object.setSubjectName(subjectName);
                            } else if (subjectsList.get(i).avoidance) {
                                Object.setSubjectName(subjectName);
                            }
                        }
                    }
                }
            }
        }
        return objectsList;
    }

    @Override
    public ArrayList<Object> AllocationAvoidanceSubjects(ArrayList<Object> objectsList, ArrayList<Subject> subjectsList) {
        for (int i = 0; i < subjectsList.size(); i++) {
            if (subjectsList.get(i).avoidance) {
                int subjectName = subjectsList.get(i).getSubjectName();
                int[] objectsOwned = subjectsList.get(i).getObjectsOwned();
                for (int j = 0; j < objectsOwned.length; j++) {
                    for (Object Object : objectsList) {
                        if (Object.getObjectName() == objectsOwned[j]) {
                            if (Object.getSubjectName() == 0) {
                                Object.setSubjectName(subjectName);
                            }
                        }
                    }
                }
            }
        }
       return objectsList;
    }

    @Override
    public ArrayList<Object> AllocationDeletionSubjects(ArrayList<Object> objectsList, ArrayList<Subject> subjectsList) {
    for (int i = 0; i < subjectsList.size(); i++) {
            if (subjectsList.get(i).markDeletion) {
                int subjectName = subjectsList.get(i).getSubjectName();
                int[] objectsOwned = subjectsList.get(i).getObjectsOwned();
                for (int j = 0; j < objectsOwned.length; j++) {
                    for (Object Object : objectsList) {
                        if (Object.getObjectName() == objectsOwned[j]) {
                            if (Object.getSubjectName() == subjectName) {
                                Object.setSubjectName(0);
                            }
                        }
                    }
                }
            }
        }
    return objectsList;
    }
}