package designpatterns.Adapter;

public class VLCPlayer implements AdvanceMediaAdapter {

    @Override
    public void playVLC(String file) {
        System.out.println("Playing" + file + "of audiotype VLC");
    }

    @Override
    public void playMP4(String file) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'playMP4'");
    }
    
}
