package co.yedam.todolist.member.service;

import lombok.Data;

@Data
public class MemberVO {
	private int memberId;
	private String memberName;
	private String memberPassword;
	
	public String toString() {
		System.out.println("고유번호 : 아이디 : 비밀번호");
		System.out.print(memberId + " : ");
		System.out.print(memberName + " : ");
		System.out.print(memberPassword);
		System.out.println();
		return null;
	}
}
