public final class SingletonDoubleCheckedLocking {
    private static SingletonDoubleCheckedLocking instance;
    public String value;

    private SingletonDoubleCheckedLocking(String value) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.value = value;
    }

    public static SingletonDoubleCheckedLocking getInstance(String value) {
        if (instance == null) {
            synchronized (SingletonDoubleCheckedLocking.class) {
                if (instance == null) {
                    instance = new SingletonDoubleCheckedLocking(value);
                }
            }
        }
        return instance;
    }
}
