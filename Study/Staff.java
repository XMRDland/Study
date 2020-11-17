package Study;

public interface Staff {
    void supportStudent(Student student);

    default void shareInfo() {
        System.out.println("Полезная информация здесь: habr.com");
    }

}
