package lesson10.Student;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Aleksandra", 410102, 3, new int[]{1, 3, 2, 2}));
        students.add(new Student("Sonja", 410102, 2, new int[]{9, 9, 8, 8}));
        students.add(new Student("Timofey", 473902, 3, new int[]{1, 3, 2, 1}));
        students.add(new Student("Anya", 473902, 2, new int[]{8, 5, 6, 7}));
        students.add(new Student("Maya", 473902, 3, new int[]{8, 10, 2, 1}));

        System.out.println("Изначальная коллекция students:");
        printStudentsCollection(students);
        deleteBadStudents(students);

        System.out.println("\nКоллекция students после удаления студентов с баллом <3:");
        printStudentsCollection(students);

        System.out.println("Коллекция students на 3 курсе:");
        printStudents(students, 3);

    }

    public static void printStudentsCollection(List<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
    }

    public static void deleteBadStudents(List<Student> students) {

        for (int i = 0; i < students.size(); i++) {
            int sum = 0;
            int[] grades = students.get(i).getGrades();

            for (int j = 0; j < grades.length; j++) {
                sum = sum + grades[j];
            }
            double result = sum / (grades.length);
            if (result >= 3) {
                int nowCourse = students.get(i).getCourse();
                int nextCourse = nowCourse + 1;
                students.get(i).setCourse(nextCourse);
            } else {
                Student remStudent = students.remove(i);
                System.out.println(remStudent + " удален.");
                i--;
            }
        }

    }

    public static void printStudents(List<Student> students, int course) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getCourse() == course) {
                System.out.println(students.get(i) + " обучается на " + course + " курсе.");
            }
        }
    }
}
