package interfaces;

public interface MusicPlayer {
	void play();
	void pause();
	void stop();
}

class SpotifyPlayer implements MusicPlayer
{
	public void play() {
		System.out.println("Spotify Playing");
	}
	public void pause() {
		System.out.println("Music Paused");
	}
	public void stop() {
		System.out.println("Music Stopped");
	}
}

class YoutubeMusicPlayer implements MusicPlayer
{
	public void play() {
		System.out.println("Music Playing");
	}
	public void pause() {
		System.out.println("Music Paused");
	}
	public void stop() {
		System.out.println("Music Stopped");
	}
}