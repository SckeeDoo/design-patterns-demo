package adapter;

/**
 * Created by schiduvasile on 10/25/17.
 */
public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String typeName) {

        switch (typeName) {
            case "VLC" :
                advancedMediaPlayer = new VLCplayer();
                break;
            case "MP4" :
                advancedMediaPlayer = new MP4player();
                break;

        }
    }


    @Override
    public void play(String fileName, String typeName) {
        switch (typeName) {
            case "VLC" :
                advancedMediaPlayer.playVLC(fileName);
                break;
            case "MP4" :
                advancedMediaPlayer.playMP4(fileName);
                break;

        }
    }
}
