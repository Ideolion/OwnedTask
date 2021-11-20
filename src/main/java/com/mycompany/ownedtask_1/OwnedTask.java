
package com.mycompany.ownedtask_1;

import java.util.ArrayList;

/**
 *
 * @author kiry
 */
class OwnedTask {
    
    public static ArrayList<Object> OwnedTask(ArrayList<Object> objectsList, ArrayList<Subject> subjectsList) {
        TaskService taskService = new TaskService();
        //распределяем субъeкты с нормальным приоритетом
        objectsList = taskService.AllocationNormPrioritySubjects(objectsList, subjectsList);
        // распределяем субъекты с низким приоритетом
        objectsList = taskService.AllocationLoPrioritySubjects(objectsList, subjectsList);
        //распределяем субъекты с признаком избегания владения
        objectsList = taskService.AllocationAvoidanceSubjects(objectsList, subjectsList);
        //распределяем субъекты с признаком удаления
        objectsList = taskService.AllocationDeletionSubjects(objectsList, subjectsList);
        //возвращаем список объектов с данными о субъектах
        return objectsList;
    }
    
}
