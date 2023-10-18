package methodparameter;

public class Parameter {
	
	//creating a method here
	int Addnumber(int a, int b) {
		System.out.print("Sum are: ");
		System.out.println("Hello");
		return a+b;
	}
	
	void information() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		Parameter obj = new Parameter();
		System.out.println(obj.Addnumber(23, 12));
		System.out.println(obj.Addnumber(35, 10));
		
		
	}

}
