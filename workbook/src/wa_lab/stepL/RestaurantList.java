package wa_lab.stepL;

public class RestaurantList {
	int number;
	int customer;
	int m1;
	int m2;
	int m3;
	String membership;
	String time;
	int price;
	RestaurantList(int n,int c,int m1,int m2, int m3, String member,String time, int p){
		this.number = n;
		this.customer=c;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		this.membership=member;
		this.time=time;
		this.price=p;
	}
}
