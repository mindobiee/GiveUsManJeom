package softwareE;


import java.util.Scanner;
import java.util.Vector;


class item{
	int day;
	String name;
	int price;

public item(int day, String name, int price){
	this.day = day;
	this.name = name;
	this.price = price;

}	
	
public item() {
	// TODO Auto-generated constructor stub
}

public void setday(int day){
	this.day = day;
}
public void setname(String name){
	this.name = name;
}
public void setprice(int price){
	this.price = price;
}
public int getday(){
	return this.day;
}
public String getname(){
	return this.name;
}
public int getprice(){
	return this.price;
}


}
/*
public void print(int n){
	System.out.println("   ��¥          ��ǰ�̸�         ����");
	for(int j=0;j<n;j++)
		System.out.println(day + "  "+ name + "  " + price);
}*/



public class accounting {
	
	public static int i=0;
	//private static Object Vector;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int number=1;
		Vector<item> v = new Vector<item>();
		while(number!=4){
		//purchaselist[] item= new purchaselist[i];
		System.out.println("========= <Purchase List> ========");
		System.out.println("  ��ȣ    ���Գ�¥      ��ǰ��      ��ǰ����   ");
		for(int i=0;i<v.size();i++){
			System.out.println(" ["+i+"] " + v.get(i).getday()
					+ "\t"+v.get(i).getname()+"\t"+v.get(i).getprice());
		}
		System.out.println("=================================\n");
		System.out.println("========== <����� ���� �޴�> ==========\n");           
		System.out.println("1. ����� �ۼ�\n2. ����� ������Ʈ\n3. ���� ���� ����\n4. �ڷΰ���\n");
		System.out.println("=================================\n");
		System.out.println("�޴� ��ȣ �Է�:");
		number = scan.nextInt();
		switch(number){
		case 1:
			addaccount(v);
			break;
		case 2:
			updateaccount(v);
			break;
		case 3:
			deleteaccount(v);
			break;
		case 4:
			return;//�ڷΰ���
		default:
			System.out.println("1-4 ���̿��� �Է����ּ���");
			break;
		}
		
		}
	}
	private static void deleteaccount(Vector<item> v) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("������ ���Գ����� ��ȣ�� �Է��ϼ���. ");
		int num = scan.nextInt();
		System.out.println("  ��ȣ    ���Գ�¥      ��ǰ��      ��ǰ����   ");
		System.out.println(" ["+num+"] " + v.get(num).getday()+"\t"+v.get(num).getname()+"\t"+v.get(num).getprice());
		System.out.println("���� �����Ͻðڽ��ϱ�?(Y/N)");
		String ans = scan.next();
		if(ans.equals("Y"))
			v.remove(num);
		else
			return;
	}
	private static void updateaccount(Vector<item> v) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("������ ���Գ����� ��ȣ�� �Է��ϼ���. ");
		int day, price;
		String name;
		int num = scan.nextInt();
		System.out.println("  ��ȣ    ���Գ�¥      ��ǰ��      ��ǰ����   ");
		System.out.println(" ["+num+"] " + v.get(num).getday()+"  "+v.get(num).getname()+"   "+v.get(num).getprice());
		System.out.println("������ �׸��� ��ȣ�� �Է��ϼ���.");
		System.out.println("1.���Գ�¥\n2.��ǰ��\n3.��ǰ����");
		int cas = scan.nextInt();
		switch(cas){
		case 1:
			System.out.println("���Գ�¥:");
			day = scan.nextInt();
			v.get(num).setday(day);
			break;
		case 2:
			System.out.println("��ǰ��:");
			name = scan.next();
			v.get(num).setname(name);
			break;
		case 3:
			System.out.println("��ǰ����:");
			price = scan.nextInt();
			v.get(num).setprice(price);
		default:
			break;
		}
		return;
		
		
	}
	public static void addaccount(Vector<item> v){
		Scanner scan = new Scanner(System.in);
		System.out.println("���Գ����� ������ �Է��ϼ���.");
		int day, price;
		String name;
		System.out.println("���Գ�¥:");
		day = scan.nextInt();
		System.out.println("��ǰ��:");
		name = scan.next();
		System.out.println("��ǰ����:");
		price = scan.nextInt();
		item i1 = new item(day,name,price);
		v.add(i1);
		return;
		

	}

}
