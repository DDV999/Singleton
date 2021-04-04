public final class SingletonTemp {
    private static SingletonTemp instanteName;
    public String value;

    private SingletonTemp(String value){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        this.value = value;
    }

    public static SingletonTemp getInstante(String value){
        if (instanteName == null) instanteName = new SingletonTemp(value);
        return instanteName;
    }
}
