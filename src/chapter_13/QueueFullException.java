package chapter_13;

public class QueueFullException extends Exception {
    private int size;

    QueueFullException(int s) { size = s; }

    public String toString() {
        return "\nОчередь заполнена. Максимальный размер очереди: " +
                size;
    }
}