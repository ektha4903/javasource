package user2;

import java.util.List;
import java.util.Scanner;

public class ConsoleUtil {
	//회원 등록받기
	public UserVO addUser(Scanner sc) {
		System.out.println("\n회원 정보 등록 ");
		System.out.print("이름 : ");
		String username = sc.nextLine();
		System.out.print("출생년도 : ");
		int birthyear = Integer.parseInt(sc.nextLine());
		System.out.print("주소 : ");
		String addr = sc.nextLine();
		System.out.print("전화번호 : ");
		String mobile = sc.nextLine();
		
		UserVO vo = new UserVO();
		vo.setUsername(username);
		vo.setBirthyear(birthyear);
		vo.setAddr(addr);
		vo.setMobile(mobile);
		
		return vo;
	}
	//등록 성공 메세지
	public void printAddSuccessMessage() {
		System.out.println("회원 등록 성공");
	}
	//등록 실패 메세지
	public void printAddFailMessage() {
		System.out.println("회원 등록 실패");
	}
	
	//특정 회원 번호 입력 받기
	public int selectOne(Scanner sc) {
		System.out.println("\n특정 회원 조회");
		System.out.print("번호 입력 : ");
		int no = Integer.parseInt(sc.nextLine());
		
		return no;
	}
	
	//selectOne 성공 메세지
	public void printSelectOne(UserVO vo1) {
		System.out.println("\n번호\t이름\t출생년도\t주소\t전화번호");
		System.out.print(vo1.getNo()+"\t");
		System.out.print(vo1.getUsername()+"\t");
		System.out.print(vo1.getBirthyear()+"\t");
		System.out.print(vo1.getAddr()+"\t");
		System.out.print(vo1.getMobile()+"\n");
	}
	//selectOne 실패 메세지
	public void printSelectOneFailMessage(int no) {
		System.out.println(no+"번호를 확인하세요.");
	}
	
	//list 출력
	public void printListAll(List<UserVO> list) {
		for(UserVO vo2:list) {
			System.out.print(vo2.getNo()+"\t");
			System.out.print(vo2.getUsername()+"\t");
			System.out.print(vo2.getBirthyear()+"\t");
			System.out.print(vo2.getAddr()+"\t");
			System.out.print(vo2.getMobile()+"\n");
		}
	}
	
	//list 출력 실패
	public void printListFailMessage() {
		System.out.println("가져올 정보가 없습니다");
	}
	
	//수정할 회원 정보 입력받기
	public UserVO updateUser(Scanner sc) {
		System.out.println("\n회원 정보 수정");
		System.out.print("회원 번호 입력 : ");
		int no3 = Integer.parseInt(sc.nextLine());
		System.out.print("수정할 번호 입력 : ");
		String mobile1 = sc.nextLine();
		System.out.print("수정할 주소 입력 : ");
		String addr1 = sc.nextLine();
		
		UserVO vo3 = new UserVO();
		vo3.setNo(no3);
		vo3.setMobile(mobile1);
		vo3.setAddr(addr1);
		
		return vo3;
	}
	
	//수정 성공 메세지
	public void printUpdateSuccessMessage() {
		System.out.println("수정 성공");
	}
	//수정 실패 메세지
	public void printUpdateFailMessage() {
		System.out.println("수정 실패");
	}
	
	//삭제할 회원 정보받기
	public UserVO deleteUser(Scanner sc) {
		UserVO vo4 = new UserVO();
		System.out.println("\n회원 탈퇴");
		System.out.print("번호 입력 : ");
		vo4.setNo(Integer.parseInt(sc.nextLine()));
		
		return vo4;
	}
	//삭제 성공 메세지
	public void printDeleteSuccessMessage() {
		System.out.println("삭제 성공");
	}
	//삭제 실패 메세지
	public void printDeleteFailMessage() {
		System.out.println("삭제 실패");
	}
}
