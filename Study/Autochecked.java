package Study;

public interface Autochecked {
    default void solveTask() {
        System.out.println("Задание выполнено");
    }
}
