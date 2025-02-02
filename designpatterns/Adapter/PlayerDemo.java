package designpatterns.Adapter;

public class PlayerDemo {
    public static void main(String[] args) {
        AudioPlayer audio = new AudioPlayer();
        audio.play("mp3", "Paradise");
        audio.play("vlc", "Dancing with your ghost");
        audio.play("mp4", "Thank you");
        audio.play("xyz", "Random song");
    }
}
