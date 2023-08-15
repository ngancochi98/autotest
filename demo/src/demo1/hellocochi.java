package demo1;
import java.security.DomainCombiner;
import java.util.Scanner;
public class hellocochi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		System.out.println("nhập số a:");
		int a= nhap();
		System.out.println("nhập số b:");
		int b= nhap();
		System.out.println("UCLN của số "+a+" và "+b+" là "+ UCLN(a, b));
		System.out.println("BCNN của số "+a+" và "+b+" là "+ ((a*b)/UCLN(a, b)));
		*/
		/*
		System.out.println("nhập số cần đổi: ");
		int a = nhap();
		System.out.println("nhập cơ số cần đổi: ");
		int b = nhap();
		System.out.println("So " +a+ " chuyen sang co so " +b+ " thanh: ");
		doiCoSo(a, b);
		*/
		/*
		System.out.println("nhập số a:");
		int a= nhap();
		System.out.println("kết quả của số "+a+" bằng: ");
		songuyento(a);
		*/
		System.out.println("nhập chuỗi kiểm tra:");
		String s= nhapString();
		if(checkdoixung(s)==true) {
			System.out.println("đây là chuỗi đối xứng");
		}
		else System.out.println("đây không phải là chuỗi đối xứng");

	}
	public static int nhap () {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		boolean check= false;
		int n =0;
		while(!check) {
			System.out.println("");
			try {
				n = input.nextInt();
				check = true;
			}catch(Exception e) {
				System.out.println("Vui lòng nhập số,please....\n");
				input.nextLine();
			}
		}
		return n;
	}
	public static String nhapString () {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		boolean check= false;
		String n="" ;
		while(!check) {
			System.out.println("");
			try {
				n = input.nextLine();
				check = true;
			}catch(Exception e) {
				System.out.println("Vui lòng nhập chữ,please....\n");
				input.nextLine();
			}
		}
		return n;
	}
	public static int[] nhapMang() {
		Scanner input = new Scanner(System.in);
		int n=0;
		do {
			System.out.println("nhập số phần tử của mảng: ");
			n= input.nextInt();	
		}while(n<0);
		
		int a[]= new int[n];
		for(int i=0;i<n;i++) {
			a[i]=input.nextInt();
		}
		return a;
	}
	public static void inMang(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}
	}
	public static void inPhanTuGiongNhau(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}
	}
	public static void countCharacterString(String s) {
		int a[] = new int[s.length()];
		
		
	}
	public static int count(char a, String s) {
		int dem=0;
		 for(int i=0;i<s.length();i++){
			if(s.charAt(i)==a) dem++;
		}
		return dem;
	}
	public static int UCLN(int a, int b) {
		while(a!=b) {
			if(a>b) {
				a=a-b;
			}
			else {
				b=b-a;
			}
		}
		return a;
	}
	public static void doiCoSo(int n,int base){
        if(n>=base) doiCoSo(n / base, base);
        if(n % base>9) System.out.printf("%c",n%base+55);
        else
        System.out.print((n % base));
    }
	public static int sum(int a) {
		int s=0;
		while(a>0) {
			s+=a%10;
			a/=10;
		}
		return s;
	}
	public static void songuyento(int n) {
		int a=2;
		while(n!=1){
			if(n%a==0){
				if(n==a) System.out.printf("%d",a);
				else System.out.printf("%d x ",a);
				n/=a;
			}
			else a++;
		}
	}
	public static boolean checksnt(int a) {
		int b=2;
		int dem=0;
		while(a!=1){
			if(a%b==0){
				dem++;
			}
			else b++;
		}
		if(dem ==2) return true;
		else return false;
	}
	public static boolean checkdoixung(String s) {
		int dem=0;
		for(int i=0; i<=s.length()/2;i++) {
			if(s.charAt(i)!=s.charAt(s.length()-1-i)) {
				dem++;
			}
		}
		if(dem==0) return true;
		else return false;
	}
}