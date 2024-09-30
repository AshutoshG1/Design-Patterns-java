package DesignPatterns.Singleton;

public class Singleton {
    private static Singleton instance;
    private Singleton(){

    }
    //Lazy initiliazation
    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    //if thread safety is concern
//    public synchronized static Singleton getInstance(){
//        if (instance == null){
//            instance = new Singleton();
//        }
//        return instance;
//    }

//    public static Singleton getInstance(){
//        synchronized (Singleton.class){
//            if (instance == null){
//                instance = new Singleton();
//            }
//        }
//        return instance;
//    }
}
