package co.yedam.todolist.todo.serviceImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.yedam.todolist.common.DataSource;
import co.yedam.todolist.todo.mapper.TodoMapper;
import co.yedam.todolist.todo.service.TodoService;
import co.yedam.todolist.todo.service.TodoVO;

public class TodoServiceImpl implements TodoService {
	private SqlSession sqlSession = DataSource.getInstance().openSession(true); // true는 오토커밋을 하기 위함
	private TodoMapper map = sqlSession.getMapper(TodoMapper.class);
	@Override
	public List<TodoVO> todoSelectList() {
		// TODO Auto-generated method stub
		return map.todoSelectList();
	}

	@Override
	public TodoVO todoSelect(TodoVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int todoInsert(TodoVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int todoDelete(TodoVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int todoUpdate(TodoVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

}
