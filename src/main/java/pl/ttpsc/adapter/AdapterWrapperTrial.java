package pl.ttpsc.adapter;

interface MediaPlayer {
    void play(String filename);
}

interface MediaPackage {
    void playFile(String filename);
}

public class AdapterWrapperTrial {
    public static void main(String args[]) {

        MediaPlayer mp4MediaPlayer = new FormatAdapter(new Mp4Player());
        MediaPlayer vlcMediaPlayer = new FormatAdapter(new VlcPlayer());
        MediaPlayer mp3MediaPlayer = new Mp3Player();

        mp4MediaPlayer.play("file.mp4");
        vlcMediaPlayer.play("file.vlc");
        mp3MediaPlayer.play("file.mp3");
    }
}

class Mp3Player implements MediaPlayer {
    public void play(String filename) {
        System.out.println("i am playing mp3 " + filename);
    }
}

class Mp4Player implements MediaPackage {
    public void playFile(String filename) {
        System.out.println("i a playing mp4 " + filename);
    }
}

class VlcPlayer implements MediaPackage {
    public void playFile(String filename) {
        System.out.println("i am playing vlc " + filename);
    }
}

class FormatAdapter implements MediaPlayer {

    private MediaPackage mediaPackage;

    public FormatAdapter(MediaPackage mediaPackage) {
        this.mediaPackage = mediaPackage;
    }

    @Override
    public void play(String filename) {
        mediaPackage.playFile(filename);
    }

}