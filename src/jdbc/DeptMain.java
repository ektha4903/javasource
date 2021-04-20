package jdbc;

import java.util.List;
import java.util.Scanner;

public class DeptMain {

	public static void main(String[] args) {
		
		DeptDAO dao = new  DeptDAO();
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		
		while(run) {
			System.out.println("-------------------------------------------------");
			System.out.println("1.특정 부서 조회 |2.전체 부서 조회 |3.부서 입력 |4.종료");
			System.out.println("-------------------------------------------------");
			System.out.print("번호 입력 >> ");
			int menu = Integer.parseInt(sc.nextLine());
			
			switch (menu) {
			case 1:
				System.out.print("부서 번호 입력 >> ");
				int deptno = Integer.parseInt(sc.nextLine());
				DeptVO vo = dao.selctOne(deptno);
				System.out.println("deptno\t dname\t loc");
				System.out.print(vo.getDeptno()+"\t");
				System.out.print(vo.getDname()+"\t");
				System.out.print(vo.getLoc()+"\n");
				break;
			case 2:
				List<DeptVO> list = dao.deptSelect();
				for(DeptVO vo1:list) {
					System.out.print(vo1.getDeptno()+"\t");
					System.out.print(vo1.getDname()+"\t");
					System.out.print(vo1.getLoc()+"\n");
				}
				break;
			case 3:
				System.out.println("\n부서 정보 입력");
				System.out.print("부서 번호 >> ");
				deptno = Integer.parseInt(sc.nextLine());
				System.out.print("부서 명 >> ");
				String dname = sc.nextLine();
				System.out.print("부서 위치 >> ");
				String loc = sc.nextLine();
				
				
				if(dao.insert(deptno,dname,loc)) {
					System.out.println("입력 성공");
				} else {
					System.out.println("입력 실패");
				}
				break;
			case 4:
				run = false;
				break;

			default:
				break;
			}
		}
		

	}

}
