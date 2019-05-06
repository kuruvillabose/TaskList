package co.grandcircus;

public class Task {
	private String name,taskDesc;
	private String dueDate;
	private boolean done;

	public Task(String pname,String ptask,String pdate) {
		name=pname;
		taskDesc=ptask;
		dueDate=pdate;
		done=false;
	}
	public Task() {
		super();
	}
	
	public boolean getDone() {
		return done;
	}
	public void setDone(boolean done) {
		this.done = done;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTaskDesc() {
		return taskDesc;
	}

	public void setTaskDesc(String taskDesc) {
		this.taskDesc = taskDesc;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	
	
	public String toString() {
		return "   "+done +"        "+dueDate+"                    "+name +"                   "+taskDesc;
    }
}
	
	

