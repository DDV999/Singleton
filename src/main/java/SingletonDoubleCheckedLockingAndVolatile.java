public class SingletonDoubleCheckedLockingAndVolatile {
    private static volatile SingletonDoubleCheckedLockingAndVolatile instace;
    public String value;

    private SingletonDoubleCheckedLockingAndVolatile(String value) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        this.value = value;
    }

    public static SingletonDoubleCheckedLockingAndVolatile getInstance(String value){
        if (instace==null){
            synchronized (SingletonDoubleCheckedLockingAndVolatile.class){
                if (instace==null){
                    instace = new SingletonDoubleCheckedLockingAndVolatile(value);
                }
            }
        }
        return instace;
    }
}
