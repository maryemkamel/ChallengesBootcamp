package Day7.Challenge1;

import Day7.Challenge1.AudioPlayer;

public class CDPlayer extends AudioPlayer {
    private int cdPathwaysNumber;

    public CDPlayer(int cdNumber) {
        this.cdPathwaysNumber = cdNumber;
    }

    @Override
    public void play() {
        System.out.println("Playing CD " + cdPathwaysNumber);
            }

    @Override
    public void pause() {
        System.out.println("Pausing CD " + cdPathwaysNumber);
    }

    @Override
    public void stop() {
        System.out.println("Stopping CD " + cdPathwaysNumber);
    }
}
