package stack;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Playlist {
	private static final String FILE_LOCATION;
	static 
	{
		FILE_LOCATION="C:\\Users\\c-jagjit.singh\\Desktop\\song.txt";
	}
	
	private ArrayList<Song> songs = new ArrayList<Song>();
	public ArrayList<Song> getSongsFromFile() {
	 File file=new File(FILE_LOCATION);
	BufferedReader reader = null;
	try {
		reader = new BufferedReader(new FileReader(file));
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	String line = null;
	try {
		while((line=reader.readLine())!= null) {
			String[] tokens =line.trim().split("#");
			Song song = new Song();
			song.setTitle(tokens[0].trim());
			song.setSinger(tokens[1].trim());
			song.setMovie(tokens[2].trim());
			song.setBps(Integer.parseInt(tokens[3].trim()));
			song.setDuration(Integer.parseInt(tokens[4].trim()));
			
			songs.add(song);
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return songs;
 }
}