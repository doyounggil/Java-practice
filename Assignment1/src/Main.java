import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		
		DepartmentLinkedList attendance_list = new DepartmentLinkedList();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true)
		{
			try
			{
				StringTokenizer st = new StringTokenizer(br.readLine());
				String option = st.nextToken();
				option = option.toUpperCase();
				
				if(option.equals("Q"))
				{
					break;
				}
				else if(option.equals("P"))
				{
					attendance_list.PrintAll();
				}
				else if(option.equals("I"))
				{
					String department = st.nextToken();
					String student_name = st.nextToken();
					String student_id = st.nextToken();
					attendance_list.insertOrdered(department, student_name, student_id);
				}
				else if(option.equals("D"))
				{
					String department = st.nextToken();
					String student_id = st.nextToken();
					attendance_list.delete(department, student_id);
				}
			}
			catch (Exception e)
			{
				System.out.println("잘못된 입력입니다. I,D,P,Q 네가지 옵션 중 하나를 선택하고, 올바른 인자를 입력하세요. 오류 : " + e.toString());
			}
		}
	}
}


class DepartmentLinkedList{
	static class DeptNode{
		String dept;
		StudentLinkedList students = new StudentLinkedList();
		DeptNode next;
		
		public DeptNode(String department) {
			this.dept = department;
		}
	}
	
	DeptNode head;
	
	
	public void insertOrdered(String department, String student_name, String student_id){
		
		DeptNode temp = head;
		int targetId = Integer.parseInt(student_id);
		while(temp!=null) {
			StudentLinkedList.Node cur = temp.students.head;
			while(cur != null) {
				if(cur.id == targetId) {
					return;
				}
				cur = cur.next;
			}
			temp = temp.next;
		}
		
		DeptNode prevNode = null;
		DeptNode curNode = head;
		
		while(curNode != null && curNode.dept.compareTo(department) < 0) {
			prevNode = curNode;
			curNode = curNode.next;
		}
		
		DeptNode targetDept;
		
		if(curNode == null || !curNode.dept.equals(department)) {
			targetDept = new DeptNode(department);
			if(prevNode == null) {
				targetDept.next = head;
				head = targetDept;
			}
			else {
				targetDept.next = curNode;
				prevNode.next = targetDept;
			}
		}
		else {
			targetDept = curNode;
		}
		targetDept.students.insertOrdered(student_name, student_id);
	}
	
	public void delete(String department, String student_id){
		
		DeptNode curNode = head;
		DeptNode prevNode = null;
		
		while(curNode != null && !curNode.dept.equals(department)) {
				prevNode = curNode;
				curNode = curNode.next;
		}
		if(curNode == null) {
			return;
		}
		curNode.students.delete(student_id);
		
		if(curNode.students.head == null) {
			if(prevNode == null) {
				head = curNode.next;
			}
			else {
				prevNode.next = curNode.next;
			}
		}
	}
	
	public void PrintAll(){
		
		if (head == null) {
			System.out.println("Empty!");
			return;
		}
		
		DeptNode temp = head;
		
		while(temp != null) {
			temp.students.PrintAll(temp.dept);
			temp = temp.next;
		}
		System.out.println("End!");
	}
}


class StudentLinkedList{
	static class Node{
		String name;
		int id;
		Node next;

		public Node(String name, String id) {
			this.name = name;
			this.id = Integer.parseInt(id);
		}
	}
	
	Node head;
	
	public void insertOrdered(String student_name, String student_id) {
		
		Node newStudent = new Node(student_name, student_id);
		if (head == null) {
	        head = newStudent;
	        return;
	    }
		if (head.id == newStudent.id) {
			return;
		}
		if (newStudent.id < head.id) {
			newStudent.next = head;
			head = newStudent;
			return;
		}
		
		Node curNode = head;
		
		while(curNode.next != null && curNode.next.id < newStudent.id) {
			curNode = curNode.next;
		}
		
		if  (curNode.next != null && curNode.next.id == newStudent.id) {
			return;
		}	
		
		newStudent.next = curNode.next;
		curNode.next = newStudent;
	}
		
	public void delete(String student_id){
		
		if (head == null) {
			return; 
		}
		
		int target = Integer.parseInt(student_id);
		
		if(head.id == target) {
			head = head.next;
			return;
		}
		
		Node prevNode = head;
		Node curNode = head.next;
		
		while(curNode != null) {
			if(curNode.id == target){
				prevNode.next = curNode.next;
				return;
			}
			prevNode = curNode;
			curNode = curNode.next;
		}
	}

	public void PrintAll(String department) {
		
		Node temp = head;
		
		while(temp != null) {
			System.out.printf("(%s, %s, %d)\n", department, temp.name, temp.id);
			temp = temp.next;
		}
	}
}

