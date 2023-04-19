import part1.MyClass;

public  class Song  extends MyClass implements Comparable<Song> {
 
    private int SongId;
    private String Title;
    private String album;
    private String DateAdded;


 
    
    public Song(int SongID, String Title, String Album, String DateAdded) {
    	this.SongId = SongID;
    	this.Title = Title;
    	this.album = Album;
    	this.DateAdded = DateAdded;
    	
	}



	public Song() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return String.format("| %-8d | %-25s | %-20s | %-10s |", SongId, Title, album, DateAdded);
	}


	public int getSongId() {
		return SongId;
	}


	public void setSongId(int songId) {
		SongId = songId;
	}


	public String getTitle() {
		return Title;
	}


	public void setTitle(String title) {
		Title = title;
	}


	public String getAlbum() {
		return album;
	}


	public void setAlbum(String album) {
		this.album = album;
	}


	public String getDateAdded() {
		return DateAdded;
	}


	public void setDateAdded(String dateAdded) {
		DateAdded = dateAdded;
	}


	@Override
	public int compareTo(Song o) {
		// TODO Auto-generated method stub
		return 0;
	}
}

