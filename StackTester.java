package stack;

import java.util.ArrayList;

public class StackTester {
	public static void main(String args[])
	{
		Playlist playlist =new Playlist();
		ArrayList<Song> songs=playlist.getSongsFromFile();
		System.out.println(songs);
		
		
		
		
		/*Song song =new Song();
		song.setBps(90);
		song.setDuration(4);
		song.setSinger("Arijit Singh");
		song.setMovie("Genius");
		song.setTitle("terafitoor");*/
		
	}
}
