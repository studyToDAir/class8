import java.sql.Date;

public class TodoDTO {

	int todo_id;
	String todo;
	Date create_date;
	Date modify_date;
	String done;
	
	

	public int getTodo_id() {
		return todo_id;
	}
	public void setTodo_id(int todo_id) {
		this.todo_id = todo_id;
	}
	public String getTodo() {
		return todo;
	}
	public void setTodo(String todo) {
		this.todo = todo;
	}
	public Date getCreate_date() {
		return create_date;
	}
	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}
	public Date getModify_date() {
		return modify_date;
	}
	public void setModify_date(Date modify_date) {
		this.modify_date = modify_date;
	}
	public String getDone() {
		return done;
	}
	public void setDone(String done) {
		this.done = done;
	}
	
	
	@Override
	public String toString() {
		return "TodoDTO [todo_id=" + todo_id + ", todo=" + todo + ", create_date=" + create_date + ", modify_date="
				+ modify_date + ", done=" + done + "]";
	}
}
