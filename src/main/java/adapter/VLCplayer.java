package adapter;

/**
 * Created by schiduvasile on 10/25/17.
 */
public class VLCplayer implements AdvancedMediaPlayer {

    @Override
    public void playVLC(String fileName) {
        System.out.println("Played VLC format: " + fileName);
    }

    @Override
    public void playMP4(String fileName) { }
}
