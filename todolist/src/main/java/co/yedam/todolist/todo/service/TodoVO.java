package co.yedam.todolist.todo.service;

import java.util.Date;

import lombok.Data;

@Data
public class TodoVO {
	private int postId;
	private int memberId;
	private String userName;
	private String title;
	private String content;
	private int complete;
	private Date createdAt;
	private Date updatedAt;
	
	public String toString() {
		System.out.print(postId + " : ");
		System.out.print(memberId + " : ");
		System.out.print(userName + " : ");
		System.out.print(title + " : ");
		System.out.print(content + " : ");
		System.out.print(complete + " : ");
		System.out.print(createdAt + " : ");
		System.out.print(updatedAt);
		return null;
	}
}
