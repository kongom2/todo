package co.yedam.todolist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import co.yedam.todolist.member.service.MemberService;
import co.yedam.todolist.member.service.MemberVO;
import co.yedam.todolist.member.serviceImpl.MemberServiceImpl;
import co.yedam.todolist.todo.TodoMenu;

public class LoginMenu {
	private Scanner sc = new Scanner(System.in);
	private MemberService dao = new MemberServiceImpl();
	TodoMenu tm = new TodoMenu();
	
	public void run() {
		boolean run = true;
		do {
			menuList();
			int input = sc.nextInt(); sc.nextLine();
			switch (input) {
			case 1:
				System.out.println("아이디입력");
				tm.run();
				break;
			case 2:
				System.out.println("회원가입");
				memberInsert();
				break;
			case 3:
				System.out.println("계정목록");
				memberList();
				break;
			case 9:
				System.out.println("계정삭제");
				memberDelete();
				break;
			case 0:
				run =false;
				System.out.println("프로그램이 종료됩니다.");
				
				break;
			}
		} while (run);
	}
	
	private void menuList() {
		System.out.println("┃ [로그인] 페이지 입니다.");
		System.out.println("┃ 1.로그인 ┃ 2.회원가입 ┃ 3.계정목록 ┃ 9.계정삭제 ┃");
		System.out.println("▼ 작업번호를 선택하세요.");
	}
	
	private void memberList() {
		List<MemberVO> memberArr = new ArrayList<MemberVO>();
		
		memberArr = dao.memberSelectList();
		for(MemberVO m : memberArr) {
			m.toString();
		}
		sc.nextLine();
		System.out.println("메뉴로 돌아가려면 아무키나 눌러주세요.");
		
	}
	private void memberInsert() {
		MemberVO vo = new MemberVO();
		System.out.println("아이디를 입력하세요.");
		vo.setMemberName(sc.nextLine());
		
		System.out.println("비밀번호를 입력하세요");
		vo.setMemberPassword(sc.nextLine());
		
		int n = dao.memberInsert(vo);
		
		if(n != 0) {
			System.out.println("회원 가입이 완료되었습니다.");
			System.out.println("로그인 하여 Todo List를 사용해 주세요.");
			System.out.println("───────────────────────────────");
		} else {
			System.out.println("==제품 등록이 실패 했다.");			
		}
	}
	private void memberDelete() {
		MemberVO vo = new MemberVO();
		System.out.println("삭제할 계정의 고유번호를 입력하세요.");
		vo.setMemberId(sc.nextInt());
		sc.nextLine();
		int n = dao.memberDelete(vo);
		System.out.println(n);
		if(n!=0) {
			System.out.println("정상적으로 삭제되었습니다.");
		} else {
			System.out.println("삭제 실패 되었습니다.");
		}
	}
}
