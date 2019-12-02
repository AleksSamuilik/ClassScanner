package it.alex.lab12;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionTest {
    public static void main(String[] args) {

        //reflection class
        MultimediaCenter center=null;
        try {
            Class clazz = Class.forName(MultimediaCenter.class.getName());
            center = (MultimediaCenter) clazz.newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }

        //reflection field
        Field[] field = center.getClass().getDeclaredFields();
        for (Field field1 : field) {
            System.out.println(field1);
        }

        String name = null;
        int volume = 0;
        System.out.println(name);
        System.out.println(volume);


        try {
            for (int i = 0; i < field.length; i++) {
                field[i].setAccessible(true);
            }

            name = (String) field[0].get(center);
            volume = (int) field[1].get(center);


            System.out.println(name);
            System.out.println(volume);

            field[0].set(center, "Rock & Roll");
            field[1].set(center, 100);

            name = (String) field[0].get(center);
            volume = (int) field[1].get(center);

            System.out.println(name);
            System.out.println(volume);

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        //reflection method
        printData(center);
    }

    public static void printData(Object myClass) {
        try {
            Method method = myClass.getClass().getDeclaredMethod("printData");
            method.setAccessible(true);
            method.invoke(myClass);
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}