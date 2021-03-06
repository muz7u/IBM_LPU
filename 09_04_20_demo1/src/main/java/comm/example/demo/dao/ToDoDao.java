package comm.example.demo.dao;

import java.util.List;

import comm.example.demo.model.ToDo;

public interface ToDoDao {
	
	public void createTask(ToDo todo);
	public List<ToDo> getAllToDo();
	public void delete(String todoName);
	public void update(String oldTodoName,String newTodoName);

}
