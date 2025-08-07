package aPlayMusic;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.swing.JOptionPane;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

import javax.swing.JOptionPane;

public class Music {

	public static void main(String[] args) {
	
		playMusic("Music\\\\Trading Forex Trends with Heikin Ashi Candlestics-July 6 2016-Youtube.mp4");

	}
	public static void playMusic(String filepath)
{
	InputStream music;
	try
{
	music = new FileInputStream(new File(filepath));
	AudioStream audios = new AudioStream(music);
	((player) AudioPlayer.player).start(audios);
}
	catch(Exception e)
	{
		JOptionPane.showMessageDialog(null,"Error");
	}
}
}


