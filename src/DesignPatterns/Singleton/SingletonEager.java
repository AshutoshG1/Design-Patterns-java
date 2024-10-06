package DesignPatterns.Singleton;

public class SingletonEager {
    private static SingletonEager instance = new SingletonEager();

    private EagerSingleton() {
        // Optional: Initialization code here
    }

    public static SingletonEager getInstance(){
        return instance;
    }
}
