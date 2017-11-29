import java.util.Scanner;

public class MainProgram {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.printf("========= MENU =========%n"
				+ "1. Memo manager (메모관리)%n"
				+ "2. Calculator (계산기)%n"
				+ "3. Account book (가계부)%n"
				+ "4. Exit (종료)%n"
				+ "========================%n");
		System.out.printf("메뉴 번호 입력: ");
		int sel = scan.nextInt();	// 번호 입력
		
		if (sel==1) ;// 메모관리 메뉴 호출
		else if (sel==2) ;// 계산기 메뉴 호출
		else if (sel==3) ;// 가계부 메뉴 호출	
		else if (sel==4) { // 종료
			while(scan.hasNextLine()) scan.nextLine();
			while(scan.hasNextInt()) scan.nextInt();
		} 
		else {
			System.out.printf("다시 입력하세요. ");
			sel = scan.nextInt(); //재입력
		}
		scan.close();
	}
}
