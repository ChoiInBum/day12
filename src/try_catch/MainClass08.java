package try_catch;


import java.util.*;
class Auth{
	private String age;
	public String getAge(){ return age; }
	public boolean check(int age){
		this.age = age+""; 
		if(this.age.length() == 6){
			if(this.age.charAt(0)<'9'){
				System.out.println("가입 가능");
				return true;
			}else{
				System.out.println("가입 불가");
			}
		}else{
			System.out.println("길이가 틀렸습니다.");
		}
		return false;
	}
	public int inputAge(){
		Scanner input = new Scanner(System.in);
		int age;
		String chkAge;
		System.out.println("90년생 이상은 '가입불가'");
		System.out.println("89년생 이하는 '가입가능'");
		System.out.println("'A,ㅁ,ㅋ 문자는 잘못 입력'");
		System.out.print("주민번호 입력(앞6자리) : ");
		try{
			age=input.nextInt();
			if(age < 0)
				throw new Exception("음수는 없음");
			return age;
		}catch(InputMismatchException e){
			System.err.println("숫자를 입력 하세요!!!");
			return -1;
		}catch (Exception e) {
			System.out.println( e.getMessage() );
		}
		return -1;
	}
	public void display(){
		boolean boo=false;
		System.out.println("인증 프로그램 입니다.");
		int age=-1;
		while(boo != true){ 
			age = inputAge();
			if(age != -1)
				boo=check(age);
		}
	}
}
public class MainClass08 {
	public static void main(String[] args){
		Auth au = new Auth();
		au.display();

	}
}

