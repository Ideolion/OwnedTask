
package com.mycompany.ownedtask_1;

import java.util.ArrayList;

/** 
 * Класс TaskService переопределяет методы распределения, исходя из свойств субъектов
 * @author Денис Уфилин
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
