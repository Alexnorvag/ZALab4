import java.util.ArrayList;

/**
 * Created by norvag on 23.05.2016.
 * Построить модель программной системы.
 * Система Факультатив.
 * Преподаватель объявляет запись на Курс.
 * Студент записывается на Курс,
 * обучается и по окончании Преподаватель выставляет Оценку,
 * которая сохраняется в Архиве. Студентов, Преподавателей и Курсов при обучении может быть несколько.
 */
public class Faculty {
    private ArrayList<String> listOfCourse;
    private ArrayList<String> listOfTeacher;
    private ArrayList<String> listOfStudent;

    public Faculty() {
        init();
    }

    public void init() {
        listOfCourse = new ArrayList<String>();
        listOfTeacher = new ArrayList<String>();
        listOfStudent = new ArrayList<String>();

        for (int i = 0; i < 5; i++) {
            listOfCourse.add("Название_Курса " + (i+1));
            listOfTeacher.add("Имя_Преподавателя " + (i+1));
            listOfStudent.add("Имя_Студента " + (i+1));
        }
    }

    public ArrayList<String> getListOfTeacher() {
        return listOfTeacher;
    }

    public ArrayList<String> getListOfCourse() {
        return listOfCourse;
    }

    public ArrayList<String> getListOfStudent() {
        return listOfStudent;
    }
}
