
public class PrintSomething {
	
	// This is a field of type String and name text.
	public String text;
	
	// This is constructor object with same name as the class name
	// and no return type. This is to construct an object of this class.
	public PrintSomething(String text) {
		this.text = text;
		System.out.println("Contructed print object with initial text: " + text);
	}
	
	public void print() {
		System.out.println(this.text);
	}
	
	public void changeText(String newText) {
		this.text = newText;
		
		this.print();
	}
	
	public static void main(String[] args) {
		PrintSomething printSomething = new PrintSomething("First Try");
		
		printSomething.print();
		
		printSomething.changeText("New text");
	}
}
