package chapter02.item03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Main {

    public static void main(String[] args) {

        SingletonMethod instance01 = SingletonMethod.getInstance();
        System.out.println("instance01 : " + instance01.hashCode());

        try {
            Constructor<?> constructor = SingletonMethod.class.getDeclaredConstructors()[0];
            constructor.setAccessible(true);

            SingletonMethod instance02 = (SingletonMethod) constructor.newInstance();
            System.out.println("instance02 : " + instance02.hashCode());
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        SingletonMethod instance03 = SingletonMethod.getInstance();
        System.out.println("instance03 : " + instance03.hashCode());

        try {
            // serialization
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("connFactory.ser"));
            oos.writeObject(instance03);
            oos.close();

            // deserialization
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("connFactory.ser"));
            SingletonMethod instance04 = (SingletonMethod) ois.readObject();
            ois.close();
            System.out.println("instance04 : " + instance04.hashCode());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        SingletonEnum instance05 = SingletonEnum.INSTANCE;
        System.out.println("instance05 : " + instance05.hashCode());

        try {
            Constructor<?> constructor = SingletonEnum.class.getDeclaredConstructors()[0];
            constructor.setAccessible(true);
            SingletonEnum instance06 = (SingletonEnum) constructor.newInstance();
            System.out.println("instance06 : " + instance06.hashCode());
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        SingletonEnum instance07 = SingletonEnum.INSTANCE;
        System.out.println("instance07 : " + instance07.hashCode());

        try {
            // serialization
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("connFactory.ser"));
            oos.writeObject(instance01);
            oos.close();

            // deserialization
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("connFactory.ser"));
            SingletonEnum instance08 = (SingletonEnum) ois.readObject();
            ois.close();
            System.out.println("instance08 : " + instance08.hashCode());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
