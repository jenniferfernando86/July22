package aug12.abstdemo;

public class Maindemo {
    public static void main(String[] args) {


        MediaPlayer audioMediaPlayer = new AudioMediaPlayer();
        audioMediaPlayer.pause();
        audioMediaPlayer.play();
        audioMediaPlayer.stop();

        MediaPlayer videoMediaPlayer = new VideoMediaPlayer();

        videoMediaPlayer.play();
        videoMediaPlayer.pause();
        videoMediaPlayer.stop();
        //videoMediaPlayer.test();


    }
}
