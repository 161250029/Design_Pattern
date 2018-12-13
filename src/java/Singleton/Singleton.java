package Singleton;
/*
最基本的单件
 */
public class Singleton {
    private static Singleton uniqueInstance;
    private  Singleton() {
    }

    public static synchronized Singleton getInstance() {           //增加synchronized关键字，使得每个线程在进入这个方法之前，必须等候已经在使用该方法的线程。即不存在两个同时使用该方法的线程
        if(uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
    //这里是其他方法
}
