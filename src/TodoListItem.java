public class TodoListItem {
	public String description;
	public int priority;
	public boolean done;
	
	public TodoListItem (String description, int priority) {
		this.description = description;
		this.priority = priority;
		this.done = false;
	}
	
	public String getDescription () {
		return this.description;
				
	}

	public Object getPriority() {
		return this.priority;
		
	}

	public boolean isDone() {
		return done;
	}

	public void markDone() {
		done = true;
	}
}
		
	

