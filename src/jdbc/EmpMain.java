package jdbc;

import java.util.List;
import java.util.Scanner;

public class EmpMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		EmpDAO dao = new EmpDAO();
		
		while(run) {
			System.out.println("------------------------------------------");
			System.out.println("1.특정 사원 조회 |2.전체 사원 조회 |3.종료");
			System.out.println("------------------------------------------");
			System.out.print("번호 입력 >> ");
			int menu = Integer.parseInt(sc.nextLine());
			
			switch (menu) {
			case 1:
				System.out.print("사원 번호를 입력하세요 : ");
				int empno = Integer.parseInt(sc.nextLine());
				
				//System.out.println(dao.selectOne(empno));
				EmpVO vo = dao.selectOne(empno);
				if(vo!=null) {
				System.out.println("empno : "+vo.getEmpno());
				System.out.println("ename : "+vo.getEname());
				System.out.println("job : "+vo.getJob());
				System.out.println("mgr : "+vo.getMgr());
				System.out.println("hiredate : "+vo.getHiredate());
				System.out.println("comm : "+vo.getComm());
				System.out.println("deptno : "+vo.getDeptno());
				}else {
					System.out.println("사원번호를 확인해주세요");
				}
				break;
			case 2:
				List<EmpVO> list =  dao.select();
				
				for(EmpVO vo1:list) {
					System.out.print("empno : "+vo1.getEmpno()+"\t");
					System.out.print("ename : "+vo1.getEname()+"\t");
					System.out.print("job : "+vo1.getJob()+"\t");
					System.out.print("mgr : "+vo1.getMgr()+"\t");
					System.out.print("hiredate : "+vo1.getHiredate()+"\t");
					System.out.print("comm : "+vo1.getComm()+"\t");
					System.out.println("deptno : "+vo1.getDeptno()+"\t");
				}
				break;
			case 3:
				run=false;
				break;
			default:
				System.out.println("번호를 확인해주세요");
				break;
			}
		}

	}

}
