package CommandPattern;

public class Button {
  public CommandInterface command;
  public Button(addCustomer commad) {
	// TODO Auto-generated constructor stub
	  this.command=commad;
}

  public void click() {
	  command.execute();
  };
}
