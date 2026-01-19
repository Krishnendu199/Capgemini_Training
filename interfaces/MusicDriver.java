package interfaces;

public class MusicDriver {
	MusicPlayer mp;
	public static void main(String[] args) {
		MusicDriver d = new MusicDriver();
		d.mp = new SpotifyPlayer();
		d.mp.play();
		d.mp.pause();
		d.mp.stop();
	}
}
