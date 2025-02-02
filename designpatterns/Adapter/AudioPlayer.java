package designpatterns.Adapter;

public class AudioPlayer implements MediaPlayer {

    MediaAdapter media;
    @Override
    public void play(String audioType, String name) {
        if (audioType.equals("mp3")) {
            System.out.println("Playing" + name + "song of audioType mp3");
        } else if (audioType.equals("vlc") || audioType.equals("mp4")) {
            media = new MediaAdapter(audioType);
            media.play(audioType, name);
        } else {
            System.out.println("Unsupported media type");
        }
    }
}
