public interface JMQueue<T> { // the interface for the files
	
	public void addSong(T song);
	
	public void deleteAll();
	
	public boolean isEmpty();
	
	public T peekSong();
	
	public void pushSong(T song);
	
	public T removeSong();
	
	public int size();

}
