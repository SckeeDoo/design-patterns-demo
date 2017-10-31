package adapter;

/**
 * Created by schiduvasile on 10/25/17.
 */
public class MP4player implements AdvancedMediaPlayer {

    @Override
    public void playMP4(String fileName) {
        System.out.println("Played MP4 format: " + fileName);
    }

    @Override
    public void playVLC(String fileName) { }

}
