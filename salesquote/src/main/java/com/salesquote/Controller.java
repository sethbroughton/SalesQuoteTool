package com.salesquote;

import java.io.IOException;
import java.util.Date;

public class Controller {
	public String[] options = {};
	
	private Menu menu;
	
	public Controller(Menu menu) {
		this.menu = menu;
	}

	public void createQuote() throws IOException {
		Logger log = new Logger();
		int repNumber = (int) menu.getUserInput(options);
		Date date = new Date();
		Quote quote = new Quote(date, repNumber, 0);
		log.appendLog(quote);	
	}
	
	public static void main(String[] args) throws IOException {
		Menu menu = new Menu(System.in, System.out);
		Controller controller = new Controller(menu);
	controller.createQuote();
	}

}
