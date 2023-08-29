package co.yedam.todolist.todo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import co.yedam.todolist.todo.service.TodoService;
import co.yedam.todolist.todo.service.TodoVO;
import co.yedam.todolist.todo.serviceImpl.TodoServiceImpl;

public class TodoMenu {
	private Scanner sc = new Scanner(System.in);
	private TodoService dao = new TodoServiceImpl();
	
	public void run() {
		boolean run = true;
		do {
			menuList();
			int input = sc.nextInt(); sc.nextLine();
			switch (input) {
			case 1:
				System.out.println("Todo 등록");
				break;
			case 2:
				System.out.println("Todo 전체보기");
				todoList();
				break;
			case 3:
				System.out.println("Todo 수정");
				break;
			case 9:
				System.out.println("Todo 삭제");
				break;
			case 0:
//				lm.run();
				System.out.println("프로그램이 종료됩니다.");
				
				break;
			}
		} while (run);
	}
	
	private void menuList() {
		System.out.println("┃ [Todo 리스트] 페이지 입니다.");
		System.out.println("┃ 1.Todo 등록 ┃ 2.Todo 전체보기 ┃ 3.Todo 수정 ┃ 9.Todo 삭제 ┃");
		System.out.println("▼ 작업번호를 선택하세요.");
	}
	private void todoList() {
List<TodoVO> todoArr = new ArrayList<TodoVO>();
		
		todoArr = dao.todoSelectList();
		for(TodoVO todo : todoArr) {
			todo.toString();
		}
		sc.nextLine();
		System.out.println("메뉴로 돌아가려면 아무키나 눌러주세요.");
	}
}
