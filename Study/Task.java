package Study;

abstract class Task {
    public int taskNum;
    public String taskText;

    public Task(int taskNum, String taskText) {
        this.taskNum = 0;
        this.taskText = "Описание задачи";
    }

    public void setTaskNum(int taskNum) {
        this.taskNum = taskNum;
    }

    public int getTaskNum(){
        return taskNum;
    }
}