package Day7.Challenge1;

import java.util.ArrayList;
import java.util.List;

public class MusicLibrary {
    private List<Playable> Pathways;

    public MusicLibrary() {
        this.Pathways = new ArrayList<>();
    }

    public void addPathways(Playable track) {
        Pathways.add(track);
    }

    public void playAll() {
        for (Playable track : Pathways) {
            track.play();
        }
    }

    public void pauseAll() {
        for (Playable track : Pathways) {
            track.pause();
        }
    }

    public void stopAll() {
        for (Playable track : Pathways) {
            track.stop();
        }
    }

    public static void main(String[] args) {
        MusicLibrary library = new MusicLibrary();

        MP3Player mp3Player = new MP3Player("GoodMorning.mp3");
        CDPlayer cdPlayer = new CDPlayer(1);

        library.addPathways(mp3Player);
        library.addPathways(cdPlayer);

        library.playAll();
    }
}
