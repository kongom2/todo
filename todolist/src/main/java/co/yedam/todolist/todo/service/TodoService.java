package co.yedam.todolist.todo.service;

import java.util.List;

public interface TodoService {
	List<TodoVO> todoSelectList(); 
	TodoVO todoSelect(TodoVO vo); 
	int todoInsert(TodoVO vo); 
	int todoDelete(TodoVO vo); 
	int todoUpdate(TodoVO vo); 
}
