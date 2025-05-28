package singleton;

public class SynchronisedInitialization {

    private static SynchronisedInitialization singletonObj;

    private SynchronisedInitialization() {};

        public static synchronized SynchronisedInitialization getInstance (){
            if (singletonObj == null) {
                singletonObj = new SynchronisedInitialization();
            }
            return singletonObj;
        }

}
