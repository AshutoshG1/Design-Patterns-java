package DesignPatterns.Singleton;

import java.io.Serializable;

public class SingletonBreakDeserialize implements Serializable {
    private static SingletonBreakDeserialize instance;

    private SingletonBreakDeserialize(){

    }


    public static SingletonBreakDeserialize getInstance(){
        synchronized (Singleton.class){
            if (instance == null){
                instance = new SingletonBreakDeserialize();
            }
        }
        return instance;
    }

    public Object readResolve(){
        return instance;
    }
}
