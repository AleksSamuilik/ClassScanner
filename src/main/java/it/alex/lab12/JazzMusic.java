package it.alex.lab12;

import java.util.ArrayList;
import java.util.List;

public class JazzMusic implements Music {
   private List<String> listMusic;

    public JazzMusic() {
        this.listMusic = new ArrayList<>();
        loadDefaultSong();
    }

    private void loadDefaultSong() {
        listMusic.add("Blue Monk");
        listMusic.add("Fly me to the Moon");
        listMusic.add("Sing Sing Sing");
    }

    @Override
    public List<String> getSong() {
        return listMusic;
    }

    public void addSong(String songName) {
        listMusic.add(songName);
    }
}