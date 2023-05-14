package by.sterlikov.classwork.lesson13List;

public class KeyStorage<T> {
    private T key;

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    public KeyStorage(T key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "KeyStorage{" +
                "key=" + key +
                '}';
    }
}
