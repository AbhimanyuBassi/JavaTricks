package work.singleton;

public class Singleton {

    private static Singleton singleton;

    private Singleton() {
    }

    //Thread Safe
    public static synchronized Singleton getInstance() {
        if (singleton == null)
            singleton = new Singleton();
        return singleton;
    }

    //To protect from Deserialization
    protected Object readResolve() {
        return singleton;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

}
