import java.util.Scanner;
import java.util.Vector;

class MemoManager {//메모관리기능 
	public static void start(Vector v) {
		 while (true) {
	          System.out.println("\n===<Memo List>===");
	          
	          if (v.size() == 0) {
	             System.out.println("-저장된 메모 없음-");
	          }
	          
	          for (int i = 0; i < v.size(); i++) {
	          Object obj = v.get(i);
	          String str = (String)obj;
	          System.out.print((i+1));
	          System.out.println(": " + str);
	          }
	          System.out.println("=================");
	          System.out.println("==<메모 관리 메뉴>==");
	          System.out.println("1.메모 생성");
	          System.out.println("2.메모 업데이트");
	          System.out.println("3.메모 삭제");
	          System.out.println("4.뒤로가기");
	          System.out.println("==============");
	          System.out.print("입력: ");
	          
	          Scanner sc = new Scanner(System.in);
	          int selection = sc.nextInt();
	       
	          if (selection == 1) {
	        	  MemoManager ob1 = new MemoManager();
	        	  ob1.addmemo(v);
	          }
	          
	          else if (selection == 2) {
	        	  MemoManager ob2 = new MemoManager();
	        	  ob2.updatememo(v); 

	          }
	       
	          else if (selection == 3) {
	        	  MemoManager ob3 = new MemoManager();
	        	  ob3.deletememo(v);
	          
	          }
	          
	          else if (selection == 4) {
	        	  System.out.println("메인화면으로 돌아갑니다.");
	        	  break;
	          }
	    
	          else {
	          System.out.println("다시 입력하세요.");
	          }
		 }//while
	}
	
	public void addmemo(Vector v) {
		 System.out.println("추가할 메모내용을 입력하세요.");
         System.out.print("입력: ");
		 Scanner sc1 = new Scanner(System.in);
         String memo = sc1.nextLine();
         //String memo1=sc1.ne
         v.add(memo);
		
	}
	
	public static void updatememo(Vector v) {
		int number;
		
		while(true) {
			if (v.size() == 0) {
				 System.out.println("저장된 메모가 없어 메모 수정 기능을 수행할 수 없습니다.\n메모관리 메뉴화면으로 돌아갑니다.");
				 break;
			 } 
        	 
			System.out.println("수정할 메모 번호를 입력하세요.");
			System.out.print("입력: ");
			Scanner sc2 = new Scanner(System.in);
			number = sc2.nextInt();
        
			if (number > v.size() || number == 0 || number < 0) {
				System.out.println("수정할 해당 메모가 없습니다.\n<MemoList>에 있는 메모번호를 입력하세요.");
			}
			
			else {
				Object obj = v.get(number-1);
				String str = (String)obj;
				System.out.print(number);
				System.out.println(": " + str);
				v.remove(number-1);
				System.out.println("원하는 내용으로 메모를 수정하세요.");
				System.out.print("입력: ");
				Scanner sc2_1 = new Scanner(System.in);
				String memo = sc2_1.nextLine();
				v.add(number-1, memo);
				break;
			}
		}
	}
	
	public static void deletememo(Vector v) {
		int number;
		String YesOrNo;
		while (true) {
			if (v.size() == 0) {
				System.out.println("저장된 메모가 없어  메모 삭제 기능을 수행할 수 없습니다.\n메모관리 메뉴화면으로 돌아갑니다.");
 				break;
 			} 
          
			System.out.println("삭제를 원하는 해당 메모의 번호를 입력하세요.");
			Scanner sc3 = new Scanner(System.in);
			number = sc3.nextInt();
          
			if (number > v.size() || number == 0 || number < 0) {
				System.out.println("해당 메모가 없습니다. 유효한 메모 번호 다시 입력하세요.");
				//break;//
			}
			
			else {
				while (true) {
				
				System.out.print("정말 해당 메모를 삭제하시겠습니까?(Y/N): ");
				Scanner sc4 = new Scanner(System.in);
				YesOrNo = sc4.nextLine();
				if (true == !(YesOrNo.equals("Y") || YesOrNo.equals("y") || YesOrNo.equals("N") || YesOrNo.equals("n")))
					System.out.println("'Y' 또는'N'으로 제대로 다시 입력하세요.");
				else
					break;
				}
				
				if (YesOrNo.equals("Y") || YesOrNo.equals("y")) {
	
					v.remove(number-1);
					System.out.println("해당 메모를 삭제하였습니다.");
					System.out.println("메모관리 메뉴화면으로 돌아갑니다.");
				}
				
				else if (YesOrNo.equals("N") || YesOrNo.equals("n")) {
					System.out.println("해당 메모를 삭제하지 않았습니다.");
					System.out.println("메모관리 메뉴화면으로 돌아갑니다.");
				}
				
			break;
			}
        }//while
	} 
}

public class MainProgram {//메인메뉴

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		Vector v = new Vector();
		while (true) {
		System.out.printf("========= MENU =========%n"
				+ "1. Memo manager (메모관리)%n"
				+ "2. Calculator (계산기)%n"
				+ "3. Account book (가계부)%n"
				+ "4. Exit (종료)%n"
				+ "========================%n");
		System.out.printf("메뉴 번호 입력: ");
		int sel = scan.nextInt();	// 번호 입력
		
		if (sel==1) {
			MemoManager menu1 = new MemoManager();
			menu1.start(v);
		}// 메모관리 메뉴 호출
		else if (sel==2) ;// 계산기 메뉴 호출
		else if (sel==3) ;// 가계부 메뉴 호출	
		else if (sel==4) { // 종료
			break;
		} 
		else {
			System.out.println("다시 입력하세요. ");
		}
		}
	}
}


