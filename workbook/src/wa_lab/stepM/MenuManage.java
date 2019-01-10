package wa_lab.stepM;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class MenuManage {
	Scanner s = new Scanner(System.in);
	ArrayList<MenuList> m= new ArrayList<MenuList>();
	String name;
	String origin;
	int price;
	
	public void adding() {
		// TODO Auto-generated method stub
		System.out.print("메뉴의 메뉴명, 원산지, 가격을 입력하시오.");
		name = s.next();
		origin = s.next();
		price=s.nextInt();
		m.add(new MenuList(name,origin,price));
		System.out.println("입력되었습니다.\n");
	}

	public void modify() {
		// TODO Auto-generated method stub
		int number;
		
		list();
		
		System.out.print("==> 수정할 번호를 입력하세요: ");
		number = s.nextInt();
		System.out.print("==> 메뉴의 메뉴명, 원산지, 가격을 입력하시오.");
		name = s.next();
		origin = s.next();
		price=s.nextInt();
		m.set(number-1, new MenuList(name,origin,price));
		System.out.println("수정되었습니다.\n");
	}

	public void delete() {
		// TODO Auto-generated method stub
		list();
		
		System.out.print("==> 삭제할 번호를 입력하세요 : ");
		int delete_num = s.nextInt();
		m.remove(delete_num-1);
		System.out.print("삭제되었습니다. \n\n");
	}

	public void list() {
		// TODO Auto-generated method stub
		System.out.print("메뉴번호\t메뉴이름\t원산지\t1인분가격\n");
		for(int i=0;i<m.size();i++) {
			System.out.printf("%d\t%s\t%s\t%d\n",i+1,m.get(i).name,m.get(i).origin,m.get(i).price);
		}
	}

	public void amount() {
		// TODO Auto-generated method stub
		System.out.printf("%d개의 메뉴가 등록되어 있습니다.\n\n",m.size());
	}
	
	public void save() throws IOException {
		 FileWriter fw = new FileWriter("/Users/gimdaegyo/git/java-workbook/workbook/src/wa_lab/stepM/menuList");
		  fw.write("메뉴번호\t메뉴이름\t원산지\t1인분가격\n");
		  for(int i=0;i<m.size();i++)
			  fw.write((i+1)+"\t\t"+m.get(i).name+"\t"+m.get(i).origin+"\t"+m.get(i).price+"\n");
		  fw.close();
	}

}