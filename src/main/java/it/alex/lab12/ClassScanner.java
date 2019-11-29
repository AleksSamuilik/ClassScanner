package it.alex.lab12;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ClassScanner {

    private String getModifiers(int classModifiers) {
        StringBuilder builder = new StringBuilder();
        if (Modifier.isAbstract(classModifiers)) {
            builder.append("abstract ");
        }
        if (Modifier.isFinal(classModifiers)) {
            builder.append("final ");
        }
        if (Modifier.isInterface(classModifiers)) {
            builder.append("interface ");
        }
        if (Modifier.isNative(classModifiers)) {
            builder.append("native ");
        }
        if (Modifier.isPrivate(classModifiers)) {
            builder.append("private ");
        }
        if (Modifier.isProtected(classModifiers)) {
            builder.append("protected ");
        }
        if (Modifier.isPublic(classModifiers)) {
            builder.append("public ");
        }
        if (Modifier.isStatic(classModifiers)) {
            builder.append("static ");
        }
        if (Modifier.isStrict(classModifiers)) {
            builder.append("strict ");
        }
        if (Modifier.isSynchronized(classModifiers)) {
            builder.append("synchronized");
        }
        if (Modifier.isTransient(classModifiers)) {
            builder.append("transient ");
        }
        if (Modifier.isVolatile(classModifiers)) {
            builder.append("volatile");
        }
        builder.append("\n");
        return builder.toString();
    }

    private String getMethods(Class clazz) {
        StringBuilder builder = new StringBuilder();
        Method[] declaredMethod = clazz.getDeclaredMethods();
        if (declaredMethod.length == 0) {
            return "is empty.";
        }
        for (Method method : declaredMethod) {
            builder.append(""+method + "\n");

        }
        return builder.toString();
    }

    private void printInterfaces(Class clazz) {
        System.out.println("Class implements interfaces: ");
        StringBuilder builder = new StringBuilder();
        Class[] interfaces = clazz.getInterfaces();
        if (interfaces.length == 0) {
            System.out.println("is empty.");
        }
        for (Class interf : interfaces) {
            builder.append(interf + "\n");
            printBaseClass(interf);
        }
    }

    private String getFields(Class clazz) {
        StringBuilder builder = new StringBuilder();
        Field[] fields = clazz.getDeclaredFields();
        if (fields.length == 0) {
            return "is empty.";
        }
        for (Field field : fields) {
            builder.append(field + "\n");
        }
        return builder.toString();
    }

    private void printSuperClass(Class clazz) {
        System.out.println("Class extends class: ");
        Class superclass = clazz.getSuperclass();
        if (superclass.equals(Object.class)) {
            System.out.println("extends Object.");
        } else {
            printBaseClass(superclass);
        }
    }

    private void printBaseClass(Class clazz) {
        System.out.println("Name class: ");
        System.out.println(clazz.getSimpleName() + "\n");

        System.out.println("Class modifiers: ");
        System.out.println(getModifiers(clazz.getModifiers()));

        System.out.println("Class methods: ");
        System.out.println(getMethods(clazz));

        System.out.println("Class fields: ");
        System.out.println(getFields(clazz));

    }

    public void scanner(Class clazz) {

        printBaseClass(clazz);

        printConstructors(clazz);

        printSuperClass(clazz);

        printInterfaces(clazz);

    }

    private void printConstructors(Class clazz) {
        System.out.println("Class constructor: ");
        Constructor[] constructors = clazz.getConstructors();
        for (Constructor constructor: constructors){
            System.out.println(constructor);
        }
        System.out.println();
    }
}
