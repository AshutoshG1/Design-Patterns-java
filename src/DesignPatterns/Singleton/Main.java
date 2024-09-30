package DesignPatterns.Singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) throws Exception {
//        //lazy way of initilization
//        Singleton obj1 = Singleton.getInstance();
//        Singleton obj2 = Singleton.getInstance();
//        System.out.println(obj1.hashCode());
//        System.out.println(obj2.hashCode());
//
//        //Eager way
//
//        SingletonEager obj3 = SingletonEager.getInstance();
//        System.out.println(obj3.hashCode());
//        SingletonEager obj4 = SingletonEager.getInstance();
//        System.out.println(obj4.hashCode());

        /*
        Ways to break Singleton pattern
        1. Reflection API
            Solution 1:
         */

//        SingletonBreak s1 = SingletonBreak.getInstance();
//        System.out.println(s1.hashCode());
//
//        Constructor<SingletonBreak> constructor = SingletonBreak.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        SingletonBreak s2 = constructor.newInstance();
//        System.out.println(s2.hashCode());

//        SingletonBreakEnum s1 = SingletonBreakEnum.INSTANCE;
//        System.out.println(s1.hashCode());
//
////        Constructor<SingletonBreakEnum> constructor = SingletonBreakEnum.class.getDeclaredConstructor();
////        constructor.setAccessible(true);
////        SingletonBreakEnum s2 = constructor.newInstance();
//        SingletonBreakEnum s2 = SingletonBreakEnum.INSTANCE;
//        System.out.println(s2.hashCode());

//        SingletonBreakDeserialize s1 = SingletonBreakDeserialize.getInstance();
//        System.out.println(s1.hashCode());
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.ob"));
//        oos.writeObject(s1);
//
//        System.out.println("serialization is done");
//
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.ob"));
//        SingletonBreakDeserialize s2 = (SingletonBreakDeserialize) ois.readObject();
//        System.out.println(s2.hashCode());

        SingletonBreakCloning s1 = SingletonBreakCloning.getInstance();
        System.out.println(s1.hashCode());

        SingletonBreakCloning s2 = (SingletonBreakCloning)s1.clone();
        System.out.println(s2.hashCode());
    }
}