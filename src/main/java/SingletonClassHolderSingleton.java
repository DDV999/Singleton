public class SingletonClassHolderSingleton {
    private static SingletonClassHolderSingleton instance;

    private SingletonClassHolderSingleton() {
    }

    public static class SingletonHolder{
        public static final SingletonClassHolderSingleton HOLDER_INSTANCE = new SingletonClassHolderSingleton();
    }

    public static SingletonClassHolderSingleton getInstance(){
        return SingletonHolder.HOLDER_INSTANCE;
    }
}
