package wa_lab.stepL;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class ParkingManage {
	SimpleDateFormat f = new SimpleDateFormat("YYYY-MM-dd hh:mm", Locale.KOREA);
	SimpleDateFormat f1 = new SimpleDateFormat("YYYY년 MM월 dd일 hh시 mm분", Locale.KOREA);
	ArrayList<ParkingList> p= new ArrayList<ParkingList>();
	Scanner s = new Scanner(System.in);
	int space;
	int parking_number;
	int number;
	String car;
	int price;
	String time;

	ParkingManage(){
		start();
	}
	
	public void start() {
		System.out.print("주차할 수 있는 차의 개수를 입력하세요 : ");
		space = s.nextInt();
		System.out.printf("총 %d대를 주차할 수 있습니다.\n\n", space);
	}
	
	public void adding() {
		// TODO Auto-generated method stub
		String today1 = f1.format(new Date());
		System.out.print("입차할 차의 번호와 차종을 입력하세요. ");
		number = s.nextInt();
		car = s.next();
		time = f.format(new Date());
		parking_number = get_p_number();
		
		p.add(new ParkingList(parking_number,number,car,time));
		System.out.printf("[%d번] %s 입차 되었습니다.\n", p.get(p.size()-1).p_number, today1);
	}

	private int get_p_number() {
		for(int i=1; i<space;i++) {
			for(int j=0;j<p.size();j++) {
				if(p.get(j).p_number!=i&& j==p.size()-1) return i;
				else if(p.get(j).p_number==i)break;
			}
		}
		return 1;
	}
	
	public void out() throws ParseException {
		// TODO Auto-generated method stub
		int num;
		int bye = 0;
		int fare;
		int gap;
		
		list();
		System.out.print("==> 출차 번호를 입력하세요 : ");
		num = s.nextInt();
		for(int i=0;i<p.size();i++) {
			if(num==p.get(i).p_number) {
				bye=i;
				break;
			}
		}
		String s_time=p.get(bye).time;
		String e_time = f.format(new Date());	
		Date start = f.parse(s_time);
		Date end =f.parse(e_time);
		gap=getGap(start,end);
		fare=fee(gap);
		
		System.out.printf("==> 현재 시간은 [%s]이므로 주차금액은 %d입니다.\n",e_time, fare);
		System.out.print("==> 정산되었습니다.\n");
		p.remove(bye);
	}
	
	@SuppressWarnings("deprecation")
	private int getGap(Date start, Date end) {
		int between=0;
		int time=0, minute=0;
		
		time=end.getHours()-start.getHours();
		minute=end.getMinutes()-start.getMinutes();
		between = time*60 + minute;
		return between;
	}
	
	private int fee(int gap) {
		int cal;
		int a = gap/10;
		
		if(gap<1)
			cal=0;
		else if(gap%10>0)
			cal=a*500;
		else 
			cal=(a-1)*500;
		
		return cal;
	}
	
	public void list() {
		// TODO Auto-generated method stub
		for(int i=0;i<p.size();i++) {
			System.out.printf("[%d번]\t%d\t%s\t%s\n",p.get(i).p_number,p.get(i).number, p.get(i).car, p.get(i).time);
		}
	}

	public void in_car() {
		// TODO Auto-generated method stub
		System.out.printf("총 %d대가 주차되어 있습니다.\n\n", p.size());
		list();
	}

	public void remain() {
		// TODO Auto-generated method stub
		System.out.printf("주차 가능한 자리는 %d대입니다.\n\n", space-p.size());
	}
	
}
