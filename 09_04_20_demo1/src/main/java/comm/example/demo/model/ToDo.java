package comm.example.demo.model;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class ToDo {

	public String getTodoID() {
		return todoID;
	}

	public void setTodoID(String todoID) {
		this.todoID = todoID;
	}

	public String getTodoName() {
		return todoName;
	}

	public void setTodoName(String todoName) {
		this.todoName = todoName;
	}

	private String todoID;
	private String todoName;

	public ToDo(String todoName)
	{
		this.todoID=UUID.randomUUID().toString();
		this.todoName=todoName;
	}
}
