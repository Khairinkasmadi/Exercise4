package Abstraction;

abstract class Marks {
	
	abstract void getPercentage();
	
}

class ClassA extends Marks {
	
	double percentage=0, sub1, sub2, sub3;
	
	  ClassA(double i, double j, double k) {
		
		this.sub1=i;
		this.sub2=j;
		this.sub3=k;		
	}

	void getPercentage() {
		percentage = (sub1+sub2+sub3)/300*100;
		
		System.out.print("Percentage for class A:" +percentage+"%");		
		
	}
}

class ClassB extends Marks {
	
	double percentage=0, sub1, sub2, sub3, sub4;
	
	 ClassB(double i, double j, double k, double d) {
		 
		 this.sub1=i;
		 this.sub2=j;
		 this.sub3=k;
		 this.sub4=d;		
	}

	void getPercentage() {
		percentage = (sub1+sub2+sub3+sub4)/400*100;
		
		System.out.print("Percentage for class B:" +percentage+"%");
		
	}
}

public class Exercise5 {
	
	public static void main(String[] args) {
		ClassA classa = new ClassA(60,80,100);
		ClassB classb = new ClassB(40,40,60,80);
		
		classa.getPercentage();
		classb.getPercentage();

}
	
}
