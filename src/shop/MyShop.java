package shop;

import java.util.Scanner;

public class MyShop implements IShop {
	
	private String title;
	
	Scanner sc = new Scanner(System.in);
	
	//장바구니
	Product[] carts = new Product[5];
	User[] users = new User[2];
	//제품 생성
	Product[] products = new Product[5];
	//선택된 user값 담기
	String selUser;
	
	@Override
	public void setTitle(String title) {
		this.title=title;
	}

	@Override
	public void genUser() {
		//user 2명 생성
		users[0] = new User("홍길동", PayType.CARD);
		users[1] = new User("고길동", PayType.CASH);
		
//		User user1 = new User("홍길동", PayType.CARD);
//		User user2 = new User("고길동", PayType.CASH);
//	
//		users[0] = user1;
//		users[0] = user2;
	}

	@Override
	public void genProduct() {
		
		products[0] = new CellPhone("갤럭시", 1000000, "SKT");
		products[1] = new CellPhone("아이폰", 1200000, "KT");
		products[2] = new CellPhone("LG폰", 800000, "LG");
		products[3] = new SmartTV("삼성티비", 1500000, "4K");
		products[4] = new SmartTV("엘지티비", 1300000, "4K");
		
		

	}

	@Override
	public void start() {
		System.out.println(title+" : 메인 화면 - 계정 선택");
		System.out.println("=============================");
		for(int i=0;i<users.length;i++) {
			System.out.printf("[%d] %s (%s)\n",i,users[i].getName(),users[i].getPayType());
		}
			System.out.println("[x] 종료");
			System.out.print("선택 : ");
			//user를 입력할 수 있도록 코드 작성
			String input=sc.nextLine();
			
			//사용자가 0,1번을 입력했다면
			
			switch (input) {
			case "0": case "1":
				System.out.println("## "+input+" 선택 ##");
				selUser = input;
				productList();
				break;
			case "x":
				System.out.println(title+" 을 종료합니다.");
				break;

			default:
				System.out.println("\n메뉴를 확인해주세요\n");
				start();
				break;
			}
			
			//사용자가 X를 입력하면 프로그램 종료
			//메뉴가 제시하는 값 외의 다른 값을 입력했다면
			//메뉴를 확인해주세요 메시지 출력 후 처음메뉴화면이 보여지도록 하기
	}
	void checkOut() {
		System.out.println(title+" : 체크아웃");
		System.out.println("============================");
		int sum = 0;
		for(int i=0;i<carts.length;i++) {
			if(carts[i]!=null) {
			System.out.printf("[%d] %s (%d)\n",i,carts[i].getPname(),carts[i].getPrice());
			sum += carts[i].getPrice();
		}
	}
		System.out.println("============================");
		System.out.printf("결제 방법 : %s\n",users[Integer.parseInt(selUser)].getPayType());
		System.out.printf("합계 : %d원 입니다\n",sum);
		System.out.println("[p]이전 , [q]결제 완료");
		System.out.print("선택 : ");
		String input = sc.nextLine();
		
		//input p => 이전화면 - 상품목록 보여주기
		//		q => 결제완료 되엇습니다. 메세지 출력한 후 종료
		//		다른 입력 : checkOut 호풀
		
		switch (input) {
		case "p":
			productList();
			break;
		case "q":
			System.out.println("결제완료 되었습니다.");
			break;

		default:
			checkOut();
			break;
		}
		
	}
	
	public void productList() {
		System.out.println(title+" 상품 목록 - 상품 선택");
		System.out.println("==============================");
		for(int i=0;i<products.length;i++) {
			System.out.printf("[%d]",i);
			products[i].printDetail();
		}
		System.out.println("[h] 메인 화면");
		System.out.println("[c] 체크 아웃");
		System.out.print("선택 : ");
		String input = sc.nextLine();
		
		switch (input) {
		case "h":
			start();
			break;
			
		case "c":
			checkOut();
			break;
		case "0": case "1": case "2": case "3": case "4":
			//선택된 상품을 장바구니에 담기
			for(int i=0;i<carts.length;i++) {
				if(carts[i]==null) {
					carts[i]=products[Integer.parseInt(input)];
					break;
				}
			}
			
			//제품리스트 보여주기
			productList();
			break;
			
		default:
			System.out.println("\n번호를 확인해 주세요\n");
			productList();
			break;
		}
	}
	

}
