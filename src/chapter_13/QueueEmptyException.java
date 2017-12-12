package chapter_13;

public class QueueEmptyException extends Exception {
    public String toString() {
        return "\nОчередь пуста";
    }
}