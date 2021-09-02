package myJavaProject;

import java.util.Scanner;

public class Controller {
	private Model model;
	private View view;
	
	public Controller(Model model, View view) {
		this.model = model;
		this.view = view;
	}
	
	public void launch() {
		view.printMessege(View.GREETINGS + "\n");
		model.initHiddenNumber();
				
		Scanner sc = new Scanner(System.in);
				
		while(true) {
			view.printMessege(View.INPUT_INT_DATA);
			model.setAttempt(sc.nextInt());
			if(model.check()) {
				view.printMessege(View.TRUE_INPUT);
				view.printMessege(View.ATTEMPTS_INPUT + model.getArray().size());
				break;
			} else {
				view.printMessege(View.ARRAY_ATTEMPTS + model.getArray().toString()+ " ");
				view.printMessege(View.RANGE_INPUT + model.range() +" " + View.WRONG_INPUT);
			}
		}
		
		sc.close();
			
	}
	
}
