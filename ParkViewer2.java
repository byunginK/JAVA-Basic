package miniProject.copy;

import java.util.Scanner;

public class ParkViewer2 {

	private static final int SIZE = 5;
	private ParkController2 controller = new ParkController2();
	private Scanner scanner = new Scanner(System.in);
	
	private void showInfo() {
		while(true) {
			System.out.println("========주차 관리 프로그램========");
			System.out.println("1. 입차   2. 출차   3. 종료");
			System.out.println(">");
			int choice = scanner.nextInt();
			scanner.nextLine();
			if(choice == 1) {
				//입차 메소드
			}
			else if(choice ==2) {
				//출차 메소드
			}
			else if(choice ==3) {
				System.out.println("이용해 주셔서 감사합니다.");
				break;
			}
			else {
				System.out.println("잘못 입력 하셨습니다.");
			}
		}
		scanner.close();
	}
	
	private void inSertPark() {
		if(controller.size()<SIZE) {
			ParkVO p = new ParkVO();
			p.setNumber(number);
			p.setInTime(inTime);
			controller.add(p);
		}
		else {
			System.out.println("만차 입니다.");
		}
	}
	
	private String setInsertNumber() {
		ParkVO p = new ParkVO();
		System.out.println("주차할 차량의 번호를 입력해주세요");
		System.out.print(">");
		p.setNumber(scanner.nextLine());
		while(controller.contains(p)) {
			System.out.println("이미 등록되어있는 차량 입니다.");
			System.out.println("주차할 차량의 번호를 입력해주세요");
			System.out.print(">");
			p.setNumber(scanner.nextLine());
		}
		return p.getNumber();
	}
}
