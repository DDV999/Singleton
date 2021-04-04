public class DemoSingleThread {
    public static void main(String[] args) {
//        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
//                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
//                "RESULT:" + "\n");
//        Singleton singleton = Singleton.getInstance("FOO");
//        Singleton anotherSingleton = Singleton.getInstance("BAR");
//        System.out.println(singleton.value);
//        System.out.println(anotherSingleton.value);

//        System.out.println("blsblabla");
//        SingletonTemp singletonTemp = SingletonTemp.getInstante("Ex1");
//        SingletonTemp an = SingletonTemp.getInstante("Ex2");
//        System.out.println(singletonTemp.value);
//        System.out.println(an.value);

//        SingletonTemp2 sT2 = SingletonTemp2.getInstance("Ups...");
//        SingletonTemp2 sTT2 = SingletonTemp2.getInstance("Ups1");
//        System.out.println(sT2.value);
//        System.out.println(sTT2.value);

//        SingletonSynchronizedAccessor temp1 = SingletonSynchronizedAccessor.getInstance("Mr...");
//        SingletonSynchronizedAccessor temp2 = SingletonSynchronizedAccessor.getInstance("Mr2...");
//        System.out.println(temp1.value);
//        System.out.println(temp2.value);

//        SingletonDoubleCheckedLocking temp1 = SingletonDoubleCheckedLocking.getInstance("Mr...");
//        SingletonDoubleCheckedLocking temp2 = SingletonDoubleCheckedLocking.getInstance("Mr2...");
//        System.out.println(temp1.value);
//        System.out.println(temp2.value);

        SingletonDoubleCheckedLockingAndVolatile temp1 = SingletonDoubleCheckedLockingAndVolatile.getInstance("Mr...");
        SingletonDoubleCheckedLockingAndVolatile temp2 = SingletonDoubleCheckedLockingAndVolatile.getInstance("Mr2...");
        System.out.println(temp1.value);
        System.out.println(temp2.value);
    }
}