package Day7.Challenge1;

import Day7.Challenge1.AudioPlayer;

public class MP3Player extends AudioPlayer {
    private String mp3Name;

    public MP3Player(String mp3Name) {
        super();
        this.mp3Name = mp3Name;
    }

    @Override
    public void play() {
        System.out.println("Playing MP3: " + mp3Name);
    }

    @Override
    public void pause() {
        System.out.println(mp3Name+  "is paused " );

    }

    @Override
    public void stop() {
        System.out.println(mp3Name+  "is stoped " );
    }
}
