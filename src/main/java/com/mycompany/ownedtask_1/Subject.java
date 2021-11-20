package com.mycompany.ownedtask_1;

/**
 * Класс субъект,может быть способным владеть некоторым подмножеством из
 * объектов
 *
 * @autor Денис Уфилин
 */
public class Subject {

    /**
     * Поле имя субъекта
     */
    int subjectName;

    /**
     * Поле массив имен объектов, принадлежащих субъекту
     */
    int[] objectsOwned;

    /**
     * Поле Lowprio, если true - субъект становится владельцем, только<br>
     * в том случае, если нет владельца нормального приоритета и передает<br>
     * владение при появлении владельца нормального приоритета.
     */
    boolean lowrtio;
    /**
     * Поле avoidance, если true - субъект становится владельцем только в<br>
     * том случае, если нет других кандидатов (то есть субъект должен
     * избегать<br>
     * становиться владельцем).
     */
    boolean avoidance;
    
 
    /**
     * Поле markDeletion, необходимо, чтобы обозначить субъект, который
     * необходимо удалить. Если значение true - субъект необходимо удалить,<br>
     * тоесть очистить поле субъект у объекта.
     */
    boolean markDeletion;

    public Subject(int subjectName, int[] objectsOwned, boolean lowrtio, boolean avoidance, boolean markDeletion) {
        this.subjectName = subjectName;
        this.objectsOwned = objectsOwned;
        this.lowrtio = lowrtio;
        this.avoidance = avoidance;
        this.markDeletion = markDeletion;
    }

    public int getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(int subjectName) {
        this.subjectName = subjectName;
    }

    public int[] getObjectsOwned() {
        return objectsOwned;
    }

    public void setObjectsOwned(int[] objectsOwned) {
        this.objectsOwned = objectsOwned;
    }

    public boolean isLowrtio() {
        return lowrtio;
    }

    public void setLowrtio(boolean lowrtio) {
        this.lowrtio = lowrtio;
    }

    public boolean isAvoidance() {
        return avoidance;
    }

    public void setAvoidance(boolean avoidance) {
        this.avoidance = avoidance;
    }

    public boolean isMarkDeletion() {
        return markDeletion;
    }

    public void setMarkDeletion(boolean markDeletion) {
        this.markDeletion = markDeletion;
    }


}
