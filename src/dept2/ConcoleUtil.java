package dept2;

import java.util.List;
import java.util.Scanner;


public class ConcoleUtil {
	public int deptGet(Scanner sc) {
		System.out.print("부서 번호 입력 >> ");
		return Integer.parseInt(sc.nextLine());
	}
	//vo 내용을 출력하는 메세지
	public void printGetMessage(DeptVO vo) {
		System.out.println("deptno\t dname\t loc");
		System.out.print(vo.getDeptno()+"\t");
		System.out.print(vo.getDname()+"\t");
		System.out.print(vo.getLoc()+"\n");
	}
	//vo가 null일 때 출력하는 메소드
	public void printGetFailMessage(int deptno) {
		System.out.println(deptno+"부서 번호를 확인해주세요.");
	}
	
	//list 비어있을 때 출력
	public void printListFailMessage() {
		System.out.println("조회할 내용이 없음");
	}
	//list 내용이 있을 때
	public void printListSuccessMessage(List<DeptVO> list) {
		for(DeptVO vo:list) {
			System.out.print(vo.getDeptno()+"\t");
			System.out.print(vo.getDname()+"\t");
			System.out.print(vo.getLoc()+"\n");
		}
	}
	
	//추가할 부서 입력받기
	public DeptVO addDept(Scanner sc) {
		System.out.println("\n부서 정보 입력");
		System.out.print("부서 번호 >> ");
		int deptno = Integer.parseInt(sc.nextLine());
		System.out.print("부서 명 >> ");
		String dname = sc.nextLine();
		System.out.print("부서 위치 >> ");
		String loc = sc.nextLine();
		
		DeptVO vo1 = new DeptVO();
		vo1.setDeptno(deptno);
		vo1.setDname(dname);
		vo1.setLoc(loc);
		
		//=>이렇게 코드를 간소화 가능
//		DeptVO vo1 = new DeptVO();
//		System.out.println("\n부서 정보 입력");
//		System.out.print("부서 번호 >> ");
//		vo1.setDeptno(Integer.parseInt(sc.nextLine()));
//		System.out.print("부서 명 >> ");
//		vo1.setDname(sc.nextLine());
//		System.out.print("부서 위치 >> ");
//		vo1.setLoc(sc.nextLine());
		
		return vo1;
	}
	
	//insert성공 출력문
	public void printInsertSuccessMessage() {
		System.out.println("부서 정보 입력 성공");
	}
	//insert실패 출력문
	public void printInsertFailMessage() {
		System.out.println("부서 정보 입력 실패");
	}
	
	//수정할 부서 정보 받기
	public DeptVO updateDept(Scanner sc) {
		System.out.println("\n부서 정보 수정");
		System.out.print("수정할 부서 번호 입력 >> ");
		int deptno = Integer.parseInt(sc.nextLine());
		System.out.print("수정할 지역명 입력 >> ");
		String loc = sc.nextLine();
		//객체를 생성하지 않으면 리턴을 해줄 수 없음
		DeptVO vo2 = new DeptVO();
		vo2.setDeptno(deptno);
		vo2.setLoc(loc);
		
		return vo2;
	}
	
	//수정 성공 출력문
	public void printUpdateSuccessMessage() {
		System.out.println("수정 성공");
	}
	//수정 실패 출력문
	public void printUpdateFailMessage() {
		System.out.println("수정 실패");
	}
	
	//삭제할 부서 정보 입력받기
	public DeptVO deleteDept(Scanner sc) {
		DeptVO vo3 = new DeptVO();
		System.out.println("\n부서 정보 삭제");
		System.out.print("삭제할 부서 번호 입력 >> ");
		vo3.setDeptno(Integer.parseInt(sc.nextLine()));
		
		return vo3;
	}
	//삭제 성공 출력문
	public void printDeleteSuccessMessage() {
		System.out.println("삭제 성공");
	}
	//삭제 실패 출력문
	public void printDeleteFailMessage() {
		System.out.println("삭제 실패");
	}
}
