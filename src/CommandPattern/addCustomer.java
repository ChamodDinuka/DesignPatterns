package CommandPattern;

public class addCustomer implements CommandInterface {
    public CommandService service;
    public addCustomer(CommandService a) {
		// TODO Auto-generated constructor stub
    	this.service=a;
	}
    
	public void execute() {
		service.addCustomer();
	}
}
