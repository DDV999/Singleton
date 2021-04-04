public final class SingletonSynchronizedAccessor {
    private static SingletonSynchronizedAccessor instance;
    public String value;

    private SingletonSynchronizedAccessor(String value) {
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        this.value = value;
    }

    public static synchronized SingletonSynchronizedAccessor getInstance(String value) {
        if (instance == null) instance = new SingletonSynchronizedAccessor(value);
        return instance;
    }
}
