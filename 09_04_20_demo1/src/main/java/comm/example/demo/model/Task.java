package comm.example.demo.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;


public class Task {

	private String taskID;
	private List<ToDo> todos;
	
	{
		taskID=UUID.randomUUID().toString();
		todos=new ArrayList<ToDo>();
	}
	
	public List<ToDo> getAllTodo()
	{
		return todos;
	}

	public void craeteToDo(ToDo todo) {
		todos.add(todo);
		System.out.println("todo added successfully.!");
	}
	
	public void delete(String name)
	{
		Iterator<ToDo> itr = todos.iterator();
		while(itr.hasNext())
		{
			ToDo obj = itr.next();
			if(obj.getTodoName().equals(name))
			{
				todos.remove(obj);
				System.out.println(name+" removed successfully");
				return;
			}
		}
		System.out.println(name+" not present in the list");
	}
	public void update(String oldname,String newName)
	{
		Iterator<ToDo> itr = todos.iterator();
		while(itr.hasNext())
		{
			ToDo obj = itr.next();
			if(obj.getTodoName().equals(oldname))
			{
				obj.setTodoName(newName);
				System.out.println(newName+" updated successfully");
			}
		}
		System.out.println(newName+" not present in the list");
	}
	

}
