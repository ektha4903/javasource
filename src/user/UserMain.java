package user;

import java.util.List;

import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {
		boolean isStop = true;
		Scanner sc = new Scanner(System.in);
		
		while(isStop) {
			System.out.println("==========회원 관리 프로 그램===========");
			System.out.println("1. 회원 등록");
			System.out.println("2. 특정 회원 조회");
			System.out.println("3. 전체 회원 조회");
			System.out.println("4. 회원 정보 수정");
			System.out.println("5. 회원 탈퇴");
			System.out.println("6. 프로그램 종료");
			System.out.print("메뉴 번호 : ");
			int menu = Integer.parseInt(sc.nextLine());
			
			switch (menu) {
			case 1:
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
				
				UserAddService addService = new UserAddService();
				boolean isAdd = addService.add(vo);
				System.out.println(isAdd?"입력 성공":"입력 실패");
				
				break;
			case 2:
				System.out.println("\n특정 회원 조회");
				System.out.print("번호 입력 : ");
				int no = Integer.parseInt(sc.nextLine());
				
				UserSelectOneService selectOneService = new UserSelectOneService();
				UserVO vo1 = selectOneService.getUser(no);
				System.out.println("\n번호\t이름\t출생년도\t주소\t전화번호");
				System.out.print(vo1.getNo()+"\t");
				System.out.print(vo1.getUsername()+"\t");
				System.out.print(vo1.getBirthyear()+"\t");
				System.out.print(vo1.getAddr()+"\t");
				System.out.print(vo1.getMobile()+"\n");
				
				break;
			case 3:
				System.out.println("\n전체 회원 조회");
				UserSelectAllService selectAllService = new UserSelectAllService();
				List<UserVO> list = selectAllService.listAll();
				for(UserVO vo2:list) {
					System.out.print(vo2.getNo()+"\t");
					System.out.print(vo2.getUsername()+"\t");
					System.out.print(vo2.getBirthyear()+"\t");
					System.out.print(vo2.getAddr()+"\t");
					System.out.print(vo2.getMobile()+"\n");
				}
				
				break;
			case 4:
				System.out.println("\n회원 정보 수정");
				System.out.print("회원 번호 입력 : ");
				int no3 = Integer.parseInt(sc.nextLine());
				System.out.print("수정할 번호 입력 : ");
				String mobile1 = sc.nextLine();
				System.out.print("수정할 주소 입력 : ");
				String addr1 = sc.nextLine();
				
				UserUpdateService updateService = new UserUpdateService();
				boolean isUpdate = updateService.getUpdate(mobile1, addr1, no3);
				System.out.println(isUpdate?"수정 성공":"수정 실패");
				break;
			case 5:
				System.out.println("\n회원 탈퇴");
				System.out.print("번호 입력 : ");
				int no1 = Integer.parseInt(sc.nextLine());
				
				UserDeleteService deleteService = new UserDeleteService();
				boolean isDelete = deleteService.deleteUser(no1);
				System.out.println(isDelete?"탈퇴 성공":"탈퇴 실패");
				
				break;
			case 6:
				System.out.println("프로그램 종료");
				isStop = false;
				
			}
			
			
		}

	}

}
