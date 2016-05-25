import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by norvag on 23.05.2016.
 * Построить модель программной системы.
 * Система Факультатив.
 * Преподаватель объявляет запись на Курс.
 * Студент записывается на Курс, обучается и по окончании Преподаватель выставляет Оценку,
 * которая сохраняется в Архиве. Студентов, Преподавателей и Курсов при обучении может быть несколько.
 */
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> outputList;
        Faculty faculty = new Faculty();

        System.out.print("Ваша фамилия: ");
        String surname = reader.readLine();
        System.out.print("Ваше имя: ");
        String name = reader.readLine();

        Student student = new Student(surname, name);
        System.out.println("\nДобро пожаловать на запись на курс, " + student.getSurname()+ " " + student.getName() + "!");

        System.out.println("\nВыберите курс: ");
        outputList = faculty.getListOfCourse();
        for (int i = 0; i < outputList.size(); i++) {
            System.out.println((i+1) + ") " + outputList.get(i));
        }

        int switchCourse = Integer.parseInt(reader.readLine());
        System.out.println("Вы выбрали " + outputList.get(switchCourse-1));

        System.out.println("\nВыберите преподавателя: ");
        outputList = faculty.getListOfTeacher();
        for (int i = 0; i < outputList.size(); i++) {
            System.out.println((i+1) + ") " + outputList.get(i));
        }

        int switchTeacher = Integer.parseInt(reader.readLine());
        System.out.println("Вы выбрали " + outputList.get(switchTeacher-1));

        System.out.println("\nКурс закончился.");
        Thread.sleep(2000);
        System.out.println("Теперь преподаватель поставит вам оценку.");
        Thread.sleep(2000);
        int mark = (int) (Math.random()*11);
        if (mark < 4) {
            System.out.println("К сожалению вы не закончили курс. Ваша оценка: " + mark);
        }  else {
            System.out.println("Поздравляем, вы закончили курс. Ваша оценка: " + mark);
        }

        Thread.sleep(4000);

        System.out.println("\nСписок сокурсников: ");
        outputList = faculty.getListOfStudent();
        outputList.add(student.getSurname() + " " + student.getName() + " " + mark);
        for (int i = 0; i < outputList.size()-1; i++) {
            mark = (int) (Math.random()*11);
            System.out.println((i+1) + ") " + outputList.get(i) + " " + mark);
        }
        System.out.print("6) " + outputList.get(5));
    }
}