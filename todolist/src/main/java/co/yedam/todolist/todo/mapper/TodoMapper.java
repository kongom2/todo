package co.yedam.todolist.todo.mapper;

import java.util.List;

import co.yedam.todolist.todo.service.TodoVO;

public interface TodoMapper {
	List<TodoVO> todoSelectList(); 
	TodoVO todoSelect(TodoVO vo); 
	int todoInsert(TodoVO vo); 
	int todoDelete(TodoVO vo); 
	int todoUpdate(TodoVO vo); 
}
