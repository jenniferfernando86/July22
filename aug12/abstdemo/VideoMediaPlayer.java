package aug12.abstdemo;

public class VideoMediaPlayer extends MediaPlayer{
    @Override
    public void play() {
        System.out.println("Video is playing");
    }
    @Override
    public void pause(){
        System.out.println("Pause video");
    }

    @Override
    public void stop(){
        System.out.println("stop video");
    }

}
