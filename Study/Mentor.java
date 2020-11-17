package Study;

import java.util.Random;

public class Mentor extends Person implements Staff{
    public boolean mood;
    public Random random;

    public Mentor(String name, String surname, int age) {
        super(name, surname, age);
        this.mood = true;
    }

    public void supportStudent(Student student) {
        System.out.println(student.name + ", Вы у цели!");
    }

    public boolean checkCode(Task task) {
        random = new Random();
        int i = random.nextInt();
        if (i > 1000) {
            System.out.format("Задача номер %d не принята", task.taskNum);
            return false;
        } else {
            System.out.println("Задача принята");
            return true;
        }
    }
}
