package Study;

public class Test extends Task implements Autochecked{
    String[] answers;

    public Test() {
        super(taskNum, taskText);
        this.answers = new String[] {"a", "b", "c"};
    }
}
