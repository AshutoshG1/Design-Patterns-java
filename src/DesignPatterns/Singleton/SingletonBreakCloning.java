package DesignPatterns.Singleton;

public class SingletonBreakCloning implements Cloneable{
    private static SingletonBreakCloning instance;

    private SingletonBreakCloning(){

    }


    public static SingletonBreakCloning getInstance(){
        synchronized (Singleton.class){
            if (instance == null){
                instance = new SingletonBreakCloning();
            }
        }
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //return super.clone();
        return instance;
    }
}
