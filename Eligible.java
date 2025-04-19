package studentinfo;
public class Eligible extends Student{
	int marks;
	public Eligible(String name,int marks){
		super(name);
		this.marks=marks;
	}
	public void checkEligible(){
		display();
		showRole();
		if(marks>=40){
			System.out.println("Status:Eligible");
		}else{
			System.out.println("Status:Not Eligible");
		}
	}
}