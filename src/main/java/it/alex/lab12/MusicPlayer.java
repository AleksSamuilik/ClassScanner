package it.alex.lab12;

import java.util.List;
import java.util.Random;

public class MusicPlayer  extends MultimediaCenter implements Music{
    private List<String> musicList;



    public MusicPlayer(List<String> musicList) {
        this.musicList = musicList;
        setName("Jazz");
        setVolume(50);
    }

    @Override
    public String playMusic() {
        Random random = new Random();
        int randomDigit = random.nextInt(musicList.size());
        return "Playing: "+ musicList.get(randomDigit)+"\nVolume: "+getVolume()+"\nName: "+getName();
    }


    @Override
    public List getSong() {
        return null;
    }
}
