package entities;

public class Task extends Lesson{
	
	private String description;
	private int quenstionCount;
	
	public Task() {
	}

	public Task(String description, int quenstionCount) {
		super();
		this.description = description;
		this.quenstionCount = quenstionCount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuenstionCount() {
		return quenstionCount;
	}

	public void setQuenstionCount(int quenstionCount) {
		this.quenstionCount = quenstionCount;
	}
	
	@Override
	public int duration() {
		return quenstionCount * 5 * 60;
	}
	
	
	
	
	
	
	

}
