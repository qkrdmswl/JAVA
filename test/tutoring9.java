package test;
import java.util.*;

public class tutoring9 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		Vector<Integer> v = new Vector<Integer>();
		Iterator<Integer> it = v.iterator();
		int sum=0, average=0;
		
		while(true){
			System.out.println("������ �Է� (0 �Է½� ����) : ");
			int rf = sc.nextInt();
			if(rf==0) {break;}
			v.add(rf);
			
			for(int i=0; i<v.size(); i++) {
				int n = it.next();
				System.out.println(n);
			}
			
//			System.out.println("���� ��� : ");
//			average = sum / v.size();		
		}
	}

}
