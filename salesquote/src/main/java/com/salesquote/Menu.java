package com.salesquote;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Menu {

	private PrintWriter out;
	private Scanner in;

	public Menu(InputStream input, OutputStream output) {
		this.out = new PrintWriter(output);
		this.in = new Scanner(input);
	}

	public Object getUserInput(Object[] options) {
		displayUserOptions(options);
		int input = Integer.parseInt(getSalesRep());
		return input;
	}

	// DISPLAY USER INPUT
	private void displayUserOptions(Object[] options) {
		out.println("Please select the Sales Rep number");
		for (int i = 0; i<options.length; i++) {
			out.println(options[i].toString());
		}
		out.flush();
	}

	private String getSalesRep() {
		String userInput = in.nextLine();
		return userInput;
	}
}
