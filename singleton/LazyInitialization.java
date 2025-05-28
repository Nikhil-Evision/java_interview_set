package singleton;

public class LazyInitialization {

    private static LazyInitialization singletonObj;

    private LazyInitialization() {
    }

    public static LazyInitialization getInstance() {
        if (singletonObj == null) {
            singletonObj = new LazyInitialization();
        }
        return singletonObj;
    }
}
