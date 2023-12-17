package sdh.locator.myservice;

import org.springframework.beans.factory.annotation.Autowired;

public class MyServiceLocator {
    public static MyService getMyService() {
        return getInstance().myService;
    }

    // Singleton: http://stackoverflow.com/questions/11165852/java-singleton-and-synchronization

    private MyServiceLocator() {
    }

    public static MyServiceLocator getInstance() {
        return Loader.INSTANCE;
    }

    private static class Loader {
        static final MyServiceLocator INSTANCE = new MyServiceLocator();
    }

    @Autowired
    private MyService myService;
}
