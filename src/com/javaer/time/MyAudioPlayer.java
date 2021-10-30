package com.javaer.time;
import java.io.InputStream;
import java.net.URL;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
public class MyAudioPlayer {
    private URL url = null;// 音乐文件的URl
    private AudioStream as = null;// 播放器
    public MyAudioPlayer() {
        try {
            //url = MyAudioPlayer.class.getResource("/yinxiao.mp3");// 获取音乐文件的url（改成你自己的音乐文件）
            url = new URL("file:/Users/ge/ge/web/java/time/yinxiao.wav");
            //System.out.println("XX:" + MyAudioPlayer.class.getResource("/"));
            InputStream is = url.openStream();// 获得音乐文件的输入流
            as = new AudioStream(is);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // 播放音乐
    public void play() {
        AudioPlayer.player.start(as);// 用AudioPlayer静态成员player.start播放音乐
    }
    public static void main(String[] args) {

        System.out.println("sleep 45 minutes");
      try {
          Thread.sleep(45*60*1000);
      }catch(Exception ex){}
        new MyAudioPlayer().play();
    }
}


