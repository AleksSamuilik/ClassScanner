package it.alex.lab12;

import java.util.List;
import java.util.Random;

public class MusicPlayer extends MultimediaCenter implements Music {
    private List<String> musicList;


    public MusicPlayer(List<String> musicList) {
        this.musicList = musicList;
    }

    @Override
    public String playMusic() {
        Random random = new Random();
        int randomDigit = random.nextInt(musicList.size());

        return playSong(musicList.get(randomDigit));
    }


    @Override
    public List getSong() {
        return null;
    }


    private String playSong(String song) {
        return "Playing: " + song + "\nVolume: " + getVolume() + "\nName: " + getName();
    }
}
