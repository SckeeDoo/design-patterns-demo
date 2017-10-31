package adapter;

/**
 * Created by schiduvasile on 10/25/17.
 */
public class AudioPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter;

    @Override
    public void play(String fileName, String audioType) {

        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing MP3 format: " + fileName);

        } else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(fileName, audioType);

        } else {
            System.out.println("Invalid file: " + fileName + " of format " + audioType);
        }
    }
}
