package it.alex.lab12;

public class MultimediaCenter {
    private String name;
    private int volume;

    public MultimediaCenter() {
        System.out.println("Welcome to our multimedia center.");
    }

    public String playMusic() {
        return "default.";
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
