public final class SingletonTemp2 {
    private static SingletonTemp2 instace2;
    public String value;

    private SingletonTemp2(String value) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.value = value;
    }

    public static SingletonTemp2 getInstance(String value) {
        if (instace2 == null) {
            instace2 = new SingletonTemp2(value);
        }
        return instace2;
    }
}
