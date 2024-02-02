package ch08.class09.answer04;

public class Song {
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;

	public void setSongInfo(String title, String artist, String album, String composer, int year, int track) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}

	public void show() {
		String strInfo ="제목 : " + title + 
		"가수 : " + artist + 
		"앨범제목 : " + album +
		"작곡가 : " + composer +
		"발표 연도 : " + year + 
		"트랙 번호 : " + track ;
	}

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
		if (_year < 0)
			return;
		year = _year;
	}

	public void setTrack(int _track) {
		if (_track < 0)
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
