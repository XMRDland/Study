package Study;

public class Student extends Person {
    private int passedTasksCount; //Количество решенных задач
    private Mentor mentor;
    private boolean allTasksPassed; //Флаг, что студент решил все задания
    private static int allStudentsPassedTasksCount; //Количество решенных задач всеми студентами

    public Student(String name, String surname, int age, int passedTasksCount, Mentor mentor, boolean allTasksPassed) {
        super(name, surname, age);
        this.passedTasksCount = 0;
        this.mentor = mentor;
        this.allTasksPassed = false;
    }

    public int getPassedTasksCount() {
        return passedTasksCount;
    }

    public void setPassedTasksCount(int passedTasksCount) {
        this.passedTasksCount = passedTasksCount;
    }

    public Mentor getMentor() {
        return mentor;
    }

    public void setMentor(Mentor mentor) {
        this.mentor = mentor;
    }

    public static int getAllStudentsPassedTasksCount() {
        return allStudentsPassedTasksCount;
    }

    public static void setAllPassedTasksCount(int allStudentsPassedTasksCount) {
        Student.allStudentsPassedTasksCount = allStudentsPassedTasksCount;
    }

    public boolean allTasksPassed() {
        return allTasksPassed;
    }

    public void setAllTasksPassed(boolean allTasksPassed) {
        this.allTasksPassed = allTasksPassed;
    }

    public void solveTasks (Task [] tasksList){
        //Если студент решил все задачи из массива,
        //то напечатать об этом сообщение и выставить true в соответствующее поле.
        //Иначе - напечатать сообщение о том, что не все задачи решены и вернуть false
        for (int i = this.passedTasksCount; i < tasksList.length; i++) {
            this.solveTask(tasksList[i]);
        }
        if (tasksList.length == passedTasksCount) {
            this.allTasksPassed = true;
            System.out.printf(" %s %s выполнил все задания\n", this.getName(), this.getSurname());
        }
        else {
            System.out.println("Не все задания выполнены");
        }
    }

    private void solveTask (Task task){
        boolean check;
        if (!(task instanceof Autochecked)){
            do {
                check = this.mentor.checkCode(task);
            }
            while (!check);
        }
        System.out.printf("Задание № %d решено\n", task.taskNum);
        this.passedTasksCount ++;
        if (this.passedTasksCount > allStudentsPassedTasksCount) {
            allStudentsPassedTasksCount = this.passedTasksCount;
        }
    }
}





