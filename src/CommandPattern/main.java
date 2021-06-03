package CommandPattern;

public class main {

	public static void main(String[] args) {
		var a =new CommandService();
		var b = new addCustomer(a);
		var c= new Button(b);
		c.click();
		
		

	}

}
