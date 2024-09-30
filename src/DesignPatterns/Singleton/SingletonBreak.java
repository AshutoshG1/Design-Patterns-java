package DesignPatterns.Singleton;

public class SingletonBreak {
    private static SingletonBreak instance;

//    private SingletonBreak(){
//
//    }
    private SingletonBreak(){
        if (instance != null){
            throw new RuntimeException("You are trying to break singleton");
        }
    }

    public static SingletonBreak getInstance(){
        synchronized (Singleton.class){
            if (instance == null){
                instance = new SingletonBreak();
            }
        }
        return instance;
    }
}
