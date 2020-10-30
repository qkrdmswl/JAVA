package test;
import java.util.*;

public class tutoring9 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		Vector<Integer> v = new Vector<Integer>();
		Iterator<Integer> it = v.iterator();
		int sum=0, average=0;
		
		while(true){
			System.out.println("강수량 입력 (0 입력시 종료) : ");
			int rf = sc.nextInt();
			if(rf==0) {break;}
			v.add(rf);
			
			for(int i=0; i<v.size(); i++) {
				int n = it.next();
				System.out.println(n);
			}
			
//			System.out.println("현재 평균 : ");
//			average = sum / v.size();		
		}
	}

}
