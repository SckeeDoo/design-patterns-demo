package adapter;

/**
 * Created by schiduvasile on 10/26/17.
 */
public class AdapterPatternDemo {


    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("Sun", "MP3");
        audioPlayer.play("Moon", "VLC");
        audioPlayer.play("Jupiter", "MP4");
        audioPlayer.play("Sun", "FLAC");


    }

}
