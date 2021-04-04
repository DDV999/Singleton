public final class SingletonTemp3 {
    private static SingletonTemp3 instance;

    private SingletonTemp3() {
    }
    public static SingletonTemp3 getInstance(){
        if (instance == null) instance = new SingletonTemp3();
        return instance;
    }
}
