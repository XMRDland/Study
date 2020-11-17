package Study;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Task[] tasks = new Task[30];
        Mentor mentor1 = new Mentor("Илья","Краснов",27);
        Mentor mentor2 = new Mentor("Ольга", "Никольская", 30);
        Student[] students = new Student[15];

         for (int i=0; i< tasks.length; i++) {
             switch ((new Random().nextInt(2))) {
                case 0:
                    tasks[i] = new Test();
                case 1:
                    tasks[i] = new DragAndDrop();
                case 2:
                    tasks[i] = new Code();
            }
        }

        for (int i = 0; i < 5; i++) {
            Mentor mentor = (i%2==0) ? mentor1 : mentor2;
            students[i] = new Student("Артемидий" + (i), "Епистахов", 25, 0, mentor, false);
        }

        for(Student student : students) {
            while (!student.allTasksPassed()) {
                int tasksCount = (int) (Math.random() * 30);
                System.out.printf(" %s начал решать %d задач\n", student.getName(), tasksCount);
                student.solveTasks(tasks);
            }
        }
    }

}
