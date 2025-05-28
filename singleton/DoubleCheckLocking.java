package singleton;

public class DoubleCheckLocking {

    private static volatile DoubleCheckLocking singletonObj ;

    private DoubleCheckLocking(){}

    public static DoubleCheckLocking getInstance(){
        if (singletonObj == null){
            synchronized (DoubleCheckLocking.class){
                if (singletonObj == null){
                    singletonObj = new DoubleCheckLocking();
                }
            }
        }
        return singletonObj;
    }
}
