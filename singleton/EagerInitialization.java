package singleton;

public class EagerInitialization {

    private static EagerInitialization singletonObj = new EagerInitialization();

    private EagerInitialization(){};

    public static EagerInitialization getInstance(){
        return singletonObj;
    }
}
