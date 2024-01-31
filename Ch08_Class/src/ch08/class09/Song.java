package ch08.class09;

public class Song {
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;

	public void setTitle(String _title) {
		title = _title;
	}

	public void setArtist(String _artist) {
		artist = _artist;
	}

	public void setAlbum(String _album) {
		album = _album;
	}

	public void setComposer(String _composer) {
		composer = _composer;
	}

	public void setYear(int _year) {
		if(_year < 0)
			return;
		year = _year;
	}

	public void setTrack(int _track) {
		if(_track < 0)
			return;
		track = _track;
	}

	public String getTitle() {
		return title;
	}

	public String getArtist() {
		return artist;
	}

	public String getAlbum() {
		return album;
	}

	public String getComposer() {
		return composer;
	}

	public int getYear() {
		return year;
	}

	public int getTrack() {
		return track;
	}
}
