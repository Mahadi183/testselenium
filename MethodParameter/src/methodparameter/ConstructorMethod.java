package methodparameter;

public class ConstructorMethod {
	
	ConstructorMethod(int a, int b){
		System.out.println("Hello Constructor");
		System.out.println("Sum are: "+ (a+b));
	}
	
	ConstructorMethod(int a, int b,int c){
		System.out.println("Hello Constructor");
		System.out.println("Sum are: "+ (a+b+c));
	}
	
	void  Sum() {
		System.out.println("This is a sum");
		
	}

	public static void main(String[] args) {
		ConstructorMethod obj = new ConstructorMethod(45,10);
		ConstructorMethod obj1 = new ConstructorMethod(45,10,20);
		obj.Sum();

	}

}
