package wa_lab.stepL;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class RestaurantManage {
	Scanner s = new Scanner(System.in);
	ArrayList<RestaurantList> r = new ArrayList<RestaurantList>();
	SimpleDateFormat f1 = new SimpleDateFormat("YYYY년 MM월 dd일 hh:mm", Locale.KOREA);
	int numbering=1;
	int people;
	
	RestaurantManage(){
		
	}
	public void order() {
		// TODO Auto-generated method stub
		int m1,m2,m3;
		String member;
		String time;
		int total;
		System.out.print("손님 수를 입력하세요 : ");
		people = s.nextInt();
		System.out.print("스테이크, 스파게티, 파스타의 개수를 입력하세요 : ");;
		m1 = s.nextInt();
		m2 = s.nextInt();
		m3 = s.nextInt();
		System.out.print("멤버쉽 카드가 있습니까??");
		member = s.next();
		time = f1.format(new Date());
		System.out.println("들어오신 시간은 "+time);
		total = cal(m1,m2,m3,member);
		System.out.printf("총 금액은 %d 원 입니다.\n\n",total);
		r.add(new RestaurantList(numbering,people,m1,m2,m3,member,time,total));
		numbering++;
	}
	
	private int cal(int m1,int m2, int m3, String mem) {
		int fare;
		fare=m1*25000+m2*15000+m3*17000;
		if(mem.equalsIgnoreCase("y"))
			fare = fare-(int)(fare*0.1);
		if(fare<100000)
			fare = fare+(int)(fare*0.07);
		else
			fare = fare+(int)(fare*0.1);
		
		fare = fare+(int)(fare*0.1);
		
		return fare;
	}
	
	public void pay() {
		// TODO Auto-generated method stub
		int del;
		int index;
		System.out.println("번호\t손님수\t스테이크\t스파게티\t파스타\t멤버쉽\t결제금액\t입장시간");
		for(int i=0;i<r.size();i++) {
			System.out.printf("[%d]\t%d\t%d\t%d\t%d\t%s\t%d\t%s\n", r.get(i).number, r.get(i).customer, r.get(i).m1, r.get(i).m2, r.get(i).m3, r.get(i).membership,r.get(i).price, r.get(i).time);
		}
		System.out.print("==> 결제하실 번호를 입력하세요 : ");
		del = s.nextInt();
		index = get_index(del);
		r.remove(index);
	}
	
	private int get_index(int d) {
		for(int a=0;a<r.size();a++) {
			if(r.get(a).number==d)
				return a;
		}
		/*for(int a=1;a<people;a++) {
			for(int b=0;b<r.size();b++) {
				if(r.get(b).number!=a&& b==r.size()-1) return a;
				else if(r.get(b).number==a)break;
			}
		}*/
		return -1;
	}
	
	
	
	public void list() {
		// TODO Auto-generated method stub
		System.out.println("번호\t손님수\t스테이크\t스파게티\t파스타\t멤버쉽\t입장시간");
		for(int i=0;i<r.size();i++) {
			System.out.printf("[%d]\t%d\t%d\t%d\t%d\t%s\t%s\n", r.get(i).number, r.get(i).customer, r.get(i).m1, r.get(i).m2, r.get(i).m3, r.get(i).membership, r.get(i).time);
		}
	}
	
}
