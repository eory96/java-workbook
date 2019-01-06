package wa_lab.stepL;

import java.util.*;

public class InformationManage {
	//int amount=1;
	String name;
	String id;
	String sex;
	String address;
	String phone;
	String r_school;
	
	Scanner s = new Scanner(System.in);
	ArrayList<InformationList> i = new ArrayList<InformationList>();
	
	
	public void register() {
		// TODO Auto-generated method stub
		
		//boolean r;
		System.out.print("학생이름, 학번, 성별을 입력하세요 : ");
		name = s.next();
		id = s.next();
		sex = s.nextLine();
		System.out.print("주소를 입력하세요 : ");
		address = s.nextLine();
		System.out.print("전화 번호를 입력하세요 : ");
		phone = s.next();
		System.out.print("복학생입니까?(Y/N) ");
		r_school = s.next();
		//if(r_school.equalsIgnoreCase("y")) r = true;
		//else r = false;
		
		i.add(new InformationList(name,id, sex, address, phone, r_school));
		
		System.out.printf("총 %d명이 등록되었습니다.\n\n", i.size());
	}

	public void modify() {
		// TODO Auto-generated method stub
		int n;
		list();
		System.out.print("==> 수정하실 번호를 입력하세요 : ");
		n = s.nextInt();
		
		System.out.print("학생이름, 학번, 성별을 입력하세요 : ");
		name = s.next();
		id = s.next();
		sex = s.nextLine();
		System.out.print("주소를 입력하세요 : ");
		address = s.nextLine();
		System.out.print("전화 번호를 입력하세요 : ");
		phone = s.next();
		System.out.print("복학생입니까?(Y/N) ");
		r_school = s.next();
			
		n=n-1;
		i.set(n, new InformationList(name,id, sex, address, phone, r_school));
		
		System.out.println("수정되었습니다.");
	}

	public void delete() {
		// TODO Auto-generated method stub
		int numb;
		list();
		System.out.print("==> 삭제하실 번호를 입력하세요 : ");
		numb = s.nextInt();
		numb--;
		i.remove(numb);
	}

	public void list() {
		// TODO Auto-generated method stub
		System.out.println("번호\t이름\t학번\t\t성별\t주소\t\t전화번호\t\t복학생");
		for(int a=0;a<i.size();a++) {
			System.out.printf("%d\t%s\t%s\t%s\t%s\t%s\t%s\n",a+1,i.get(a).name,i.get(a).id,i.get(a).sex,i.get(a).address,i.get(a).phone,i.get(a).r_school);
		}
		System.out.println("");
	}

	public void n_search() {
		// TODO Auto-generated method stub
		String n;
		System.out.print("검색하실 주소를 입력하세요 : ");
		n = s.next();
		System.out.println("");
		
		System.out.println("번호\t이름\t학번\t\t성별\t주소\t\t전화번호\t\t복학생");
		for(int a=0;a<i.size();a++) {
			if(i.get(a).name.contains(n)) {
				System.out.printf("%d\t%s\t%s\t%s\t%s\t%s\t%s\n",a+1,i.get(a).name,i.get(a).id,i.get(a).sex,i.get(a).address,i.get(a).phone,i.get(a).r_school);
			}
		}
	}

	public void search() {
		// TODO Auto-generated method stub
		String n;
		System.out.print("검색하실 이름을 입력하세요 : ");
		n = s.next();
		System.out.println("검색되었습니다.\n");
		
		System.out.println("번호\t이름\t학번\t\t성별\t주소\t\t전화번호\t\t복학생");
		for(int a=0;a<i.size();a++) {
			if(i.get(a).name.contains(n)) {
				System.out.printf("%d\t%s\t%s\t%s\t%s\t%s\t%s\n",a+1,i.get(a).name,i.get(a).id,i.get(a).sex,i.get(a).address,i.get(a).phone,i.get(a).r_school);
			}
		}
	}

	public void r_list() {
		// TODO Auto-generated method stub
		int count=0;
		System.out.println("번호\t이름\t학번\t\t성별\t주소\t\t전화번호\t\t복학생");
		for(int a=0;a<i.size();a++) {
			if(i.get(a).name.equalsIgnoreCase("y")) {
				System.out.printf("%d\t%s\t%s\t%s\t%s\t%s\t%s\n",a+1,i.get(a).name,i.get(a).id,i.get(a).sex,i.get(a).address,i.get(a).phone,i.get(a).r_school);
				count++;
			}
		}
		System.out.printf("복학생은 %d명입니다.", count);
	}

}
