package it.alex.lab12;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ClassScanner {

    private void printModifiers(Class clazz) {
        int classModifiers = clazz.getModifiers();
        System.out.print("Class modifiers: ");
        if (Modifier.isAbstract(classModifiers)) {
            System.out.print("abstract ");
        }
        if (Modifier.isFinal(classModifiers)) {
            System.out.print("final ");
        }
        if (Modifier.isInterface(classModifiers)) {
            System.out.print("interface ");
        }
        if (Modifier.isNative(classModifiers)) {
            System.out.print("native ");
        }
        if (Modifier.isPrivate(classModifiers)) {
            System.out.print("private ");
        }
        if (Modifier.isProtected(classModifiers)) {
            System.out.print("protected ");
        }
        if (Modifier.isPublic(classModifiers)) {
            System.out.print("public ");
        }
        if (Modifier.isStatic(classModifiers)) {
            System.out.print("static ");
        }
        if (Modifier.isStrict(classModifiers)) {
            System.out.print("strict ");
        }
        if (Modifier.isSynchronized(classModifiers)) {
            System.out.print("synchronized");
        }
        if (Modifier.isTransient(classModifiers)) {
            System.out.print("transient ");
        }
        if (Modifier.isVolatile(classModifiers)) {
            System.out.print("volatile");
        }
        System.out.println();
    }

    private void printMethods(Class clazz) {
        System.out.println("Class methods: ");
        Method[] declaredMethod = clazz.getDeclaredMethods();
        if (declaredMethod.length == 0) {
            System.out.println("is empty.");
        }
        for (Method method : declaredMethod) {
            System.out.println(method);
        }
    }

    private void printInterfaces(Class clazz) {
        System.out.println("Class implements interfaces: ");
        Class[] interfaces = clazz.getInterfaces();
        if (interfaces.length == 0) {
            System.out.println("is empty.");
        }

        for (Class interfaces1 : interfaces) {
            System.out.println(interfaces1);
        }
    }

    private void printFields(Class clazz) {
        System.out.println("Class fields: ");
        Field[] fields = clazz.getDeclaredFields();
        if (fields.length == 0) {
            System.out.println("is empty.");
        }

        for (Field field : fields) {
            System.out.println(field);
        }
    }

    private void printSuperClass(Class clazz) {
        Class superclass = clazz.getSuperclass();
        System.out.println("Class extends class: ");
        if (superclass.equals(Object.class)) {
            System.out.println(superclass.getSimpleName());
        } else {
            System.out.println(superclass.getSimpleName());
           printFields(superclass);
           printMethods(superclass);
        }
    }


    public void scanner(Class clazz) {
        System.out.println("Name class - " + clazz.getSimpleName());
        printModifiers(clazz);
        printMethods(clazz);
        printFields(clazz);
        printInterfaces(clazz);
        printSuperClass(clazz);


//        System.out.println(clazz.getSimpleName());
//        Field [] fields = clazz.getDeclaredFields();
//        System.out.println("Fields: ");
//        for (Field field : fields) {
//            System.out.println(field.toString());
//
//        }
//
//        Constructor[] constructors = clazz.getConstructors();
//        for (Constructor constructor : constructors) {
//            Class[] paramTypes = constructor.getParameterTypes();
//            System.out.println("Parameters constructor: ");
//
//            for (Class paramType : paramTypes) {
//                System.out.println(paramType.getName() + " ");
//            }
//            System.out.println();
//        }

    }
}
