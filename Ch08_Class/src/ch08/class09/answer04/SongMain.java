package ch08.class09.answer04;

public class SongMain {

	public static void Show(Song song) {
		System.out.println("제목 : " + song.getTitle());
		System.out.println("가수 : " + song.getArtist());
		System.out.println("앨범제목 : " + song.getAlbum());
		System.out.println("작곡가 : " + song.getComposer());
		System.out.println("발표 연도 : " + song.getYear());
		System.out.println("트랙 번호 : " + song.getTrack());

	}

	public static void setSongInfo(Song song) {
		song.setTitle("Dancing Queen");
		song.setArtist("ABBA");
		song.setAlbum("Arrival");
		song.setComposer(" Benny Andersson, Björn Ulvaeus, Stig Anderson");
		song.setYear(1976);
		song.setTrack(3);
	}

	public static void main(String[] args) {
		Song song = new Song();

		setSongInfo(song);
		Show(song);

	}
}
