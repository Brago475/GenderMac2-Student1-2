
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestJM {
    public static void main(String[] args) {
        Jmheap<Song> heap = new Jmheap<Song>();
        
        try {
            BufferedReader reader = new BufferedReader(new FileReader("songList.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split("\t");
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        while (!heap.isEmpty()) {
            Song song = heap.removeSong();
            System.out.println(song);
        }
    }
}