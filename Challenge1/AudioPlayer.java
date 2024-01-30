package Day7.Challenge1;

public abstract class AudioPlayer implements Playable {
    private int volume;

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public AudioPlayer() {
        this.volume = volume;
    }
}
