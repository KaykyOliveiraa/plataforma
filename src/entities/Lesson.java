package entities;

public abstract class Lesson {
	
	private String title;

	public abstract int duration();

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}	
	
}
