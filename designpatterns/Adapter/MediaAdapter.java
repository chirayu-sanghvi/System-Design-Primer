package designpatterns.Adapter;

public class MediaAdapter implements MediaPlayer {

    AdvanceMediaAdapter advance;

    public MediaAdapter(String audioType) {
        if(audioType.equals("vlc")) {
            advance = new VLCPlayer();
        } else if (audioType.equals("mp4")) {
            advance = new MP4Player();
        }
    }


    @Override
    public void play(String audioType, String name) {
        if(audioType.equals("vlc")) {
            advance.playVLC(name);
        } else if (audioType.equals("mp4")){
            advance.playMP4(name);
        }
    }
    
}
