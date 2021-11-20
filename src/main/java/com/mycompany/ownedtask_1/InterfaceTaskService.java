/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.ownedtask_1;

import java.util.ArrayList;

/**
 *интерфейс определяет методы, распределяющие различные типы субъектов
 * @author kiry
 */
public interface InterfaceTaskService {
    
    
    /**
* Метод производит размещение субъектов с нормальным приоритетом у которых:<br>
* - нет пометки на удаление<br>
* - нет признака того, что субъект уже был распределен ранее<br>
* @return возвращает массив объектов с внесенными данными о субъектах.
* @param objectsList массив объектов
* @param subjectsList масссив субъектов
*/
ArrayList<Object> AllocationNormPrioritySubjects(ArrayList<Object> objectsList, ArrayList<Subject> subjectsList);

/**
* Метод производит размещение субъектов с признаком loprio у которых:<br>
* - нет пометки на удаление<br>
* - нет признака того, что субъект уже был распределен ранее<br>
* @return возвращает массив объектов с внесенными данными о субъектах.
* @param objectsList массив объектов
* @param subjectsList масссив субъектов
*/
ArrayList<Object> AllocationLoPrioritySubjects(ArrayList<Object> objectsList, ArrayList<Subject> subjectsList); 
 
/**
* Метод производит размещение субъектов с признаком loprio у которых:<br>
* - нет пометки на удаление<br>
* - нет признака того, что субъект уже был распределен ранее<br>
* @return возвращает массив объектов с внесенными данными о субъектах.
* @param objectsList массив объектов
* @param subjectsList масссив субъектов
*/
ArrayList<Object> AllocationAvoidanceSubjects(ArrayList<Object> objectsList, ArrayList<Subject> subjectsList); 
/**
* Метод производит размещение субъектов с признаком markDeletion у которых:<br>
* - нет признака того, что субъект уже был распределен ранее<br>
* @return возвращает массив объектов с внесенными данными о субъектах.
* @param objectsList массив объектов
* @param subjectsList масссив субъектов
*/
ArrayList<Object> AllocationDeletionSubjects(ArrayList<Object> objectsList, ArrayList<Subject> subjectsList); 


}
