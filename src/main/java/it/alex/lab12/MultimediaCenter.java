package it.alex.lab12;

public class MultimediaCenter {
    private String name;
    private int volume;

    public MultimediaCenter() {
        System.out.println("Welcome to our multimedia center.");
        this.name = "default";
        this.volume = 10;
    }

    private void printData(){
        System.out.println("Name "+name+",volume "+volume);
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
