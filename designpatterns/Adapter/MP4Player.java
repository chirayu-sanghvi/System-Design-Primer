package designpatterns.Adapter;

public class MP4Player implements AdvanceMediaAdapter{

    @Override
    public void playVLC(String file) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'playVLC'");
    }

    @Override
    public void playMP4(String file) {
        System.out.println("Playing" + file + "of audiotype MP4");
    }
    
}
