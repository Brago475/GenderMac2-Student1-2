import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Iterator;

public class Main  {
    public static void main(String[] args) throws FileNotFoundException  {
    	
    	Jmheap<Song> heap = new Jmheap<Song>();
    	
    	PrintWriter out = new PrintWriter("songList.txt"); 
    	
    	 //heap.addSong(new Song(3982025, "Dance", "1nonly", "4/4/2023"));
        System.out.println("Heap after adding 20 songs: " );
        
        // add the songs to the heap
        heap.addSong(new Song(3982025, "Dance", "1nonly", "4/4/2023"));
        heap.addSong(new Song(4869560, "New Gold", "Tame Impala", "4/4/2023"));
        heap.addSong(new Song(3535781, "Trance", "Travis Scott", "4/4/2023"));
        heap.addSong(new Song(4866049, "Astrothunder", "Travis Scott", "4/4/2023"));
        heap.addSong(new Song(4189997, "im so happy", "EKKSTACY", "4/4/2023"));
        heap.addSong(new Song(2498449, "Stay With Me", "1nonly", "4/4/2023"));
        heap.addSong(new Song(3141578, "GHOSTKILLA", "1nonly", "4/4/2023"));
        heap.addSong(new Song(9774302, "Notion", "The Rare Occasions", "4/4/2023"));
        heap.addSong(new Song(4029876, "505", "Artic Monkeys", "4/4/2023"));
        heap.addSong(new Song(9866974, "Stronger", "Kanye West", "4/4/2023"));
        heap.addSong(new Song(5436334, "its alright :)", "Kevin Walkman", "4/4/2023"));
        heap.addSong(new Song(9785834, "Get It Together", "Drake", "4/4/2023"));
        heap.addSong(new Song(6145413, "SPIT IN MY FACE", "ThxSoMch", "4/4/2023"));
        heap.addSong(new Song(7874479, "Moon and Stars", "1nonly", "4/4/2023"));
        heap.addSong(new Song(8377335, "Eventually", "Tame Impala", "4/4/2023"));
        heap.addSong(new Song(5810203, "MANIC MAN", "Curtis Waters", "4/4/2023"));
        heap.addSong(new Song(4531614, "Less Than Zero", "The Weeknd", "4/4/2023"));
        heap.addSong(new Song(4988194, "Moth To A Flame", "The Weeknd", "4/4/2023"));
        heap.addSong(new Song(2964931, "Talk", "Omar Apollo", "4/4/2023"));
        heap.addSong(new Song(5980192, "Highlight", "Omar Apollo", "4/4/2023"));
        //heap.addSong(new Song(4517278, "Miss You - Sped up", "southstar", "4/4/2023"));
        //heap.addSong(new Song(3904502, "Apartment", "Young the Giant", "4/4/2023"));
        //heap.addSong(new Song(3280806, "I'm Still Standing", "Elton John", "4/4/2023"));
        //heap.addSong(new Song(6618763, "luna llena", "Bumboi", "4/4/2023"));
        //System.out.println("20 songs added :  " + heap.toString());
     // print table header
        System.out.println("+--------+-----------------+---------------+------------+");
        System.out.println("| SongId |      Title      |     Album     | DateAdded  |");
        System.out.println("+--------+-----------------+---------------+------------+");

        // print each song as a row in the table
        Iterator<Song> iterator = heap.iterator();
        while (iterator.hasNext()) {
            Song song = iterator.next();
            System.out.printf("| %-6d | %-15s | %-13s | %-10s |\n", 
                              song.getSongId(), song.getTitle(), song.getAlbum(), song.getDateAdded());

        }

        // print table footer
        System.out.println("+--------+-----------------+---------------+------------+");

        System.out.println("Peek song: " + heap.peekSong());
        
        
        heap.removeSong();
        heap.removeSong();
        heap.removeSong();
        heap.removeSong();
        heap.removeSong();
        System.out.println("Heap after removing  5 songs: " + heap.toString ());

        System.out.println("Peek song: " + heap.peekSong());
        out.close();

    }
    }
