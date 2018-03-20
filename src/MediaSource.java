
public class MediaSource extends Items {

	public MediaSource(String name, double id, String genre, int year, boolean isAvaliable) {
		super(name, id, genre, year, isAvaliable);
	}
	private boolean hasaudioandvideofiles;

	public boolean hasaudioandvideofiles() {
		return hasaudioandvideofiles;
	}

	public void sethasaudioandvideofiles(boolean hasaudioandvideofiles) {
		this.hasaudioandvideofiles = hasaudioandvideofiles;
	}
}
