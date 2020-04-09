package comm.example.demo.dao;

import java.util.Iterator;
import java.util.List;

import comm.example.demo.model.Task;
import comm.example.demo.model.ToDo;

public class ToDoDaoImpl implements ToDoDao {
	private Task task;
	
	{
		task=new Task();
	}

	public void createTask(ToDo todo) {
		task.craeteToDo(todo);

		
	}

	public List<ToDo> getAllToDo() {
		
		return task.getAllTodo();
	}
	
	public void delete(String name) {
		task.delete(name);
	}

	public void update(String oldname,String newName) {

		task.update(oldname, newName);
	}
	
	
}
