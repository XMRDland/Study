package Study;

public class DragAndDrop extends Task implements Autochecked {
    String[][] answerVariants;

    public DragAndDrop() {
        super(taskNum, taskText);
        this.answerVariants = new String[][] {{"a", "b"}, {"c", "d"}};
    }

/*    public DragAndDrop(int taskNum, String taskText,String[][] answerVariants) {
        super(taskNum, taskText);
        this.answerVariants = answerVariants;
    }*/
}
