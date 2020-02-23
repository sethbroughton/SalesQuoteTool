package com.salesquote;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Logger {
	
	public Logger() {
	}

	public void appendLog(Quote quote) throws IOException {
		FileWriter fileWriter = new FileWriter("QuoteLog.txt", true); // Set true for append mode
		try (PrintWriter printWriter = new PrintWriter(fileWriter)) {
			printWriter.println(quote);
		}
	} 
	
}
