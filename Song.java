package stack;

public class Song {
	private String title;
	private String singer;
	private String movie;
	private int bps;
	private int duration;
	public Object setTitletokens;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public String getMovie() {
		return movie;
	}
	public void setMovie(String movie) {
		this.movie = movie;
	}
	public int getBps() {
		return bps;
	}
	public void setBps(int bps) {
		this.bps = bps;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return " [title=" + title + ", singer=" + singer + ", movie=" + movie + ", bps=" + bps + ", duration="
				+ duration + "]";
	}
	public void Title(String[] tokens) {
		// TODO Auto-generated method stub
		
	}
	
}
