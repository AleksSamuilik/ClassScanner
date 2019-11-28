package it.alex.lab12;

public class TestClass {
    public static void main(String[] args) {

        System.out.println("start Scanning");

        new ClassScanner().scanner(MusicPlayer.class);
        System.out.println();
        System.out.println("next class!");
        System.out.println();
        new ClassScanner().scanner(JazzMusic.class);
        System.out.println();
        System.out.println("next class!");
        System.out.println();
        new ClassScanner().scanner(ClassScanner.class);
    }
}
