package com.csvParser;

import java.io.IOException;

import au.com.bytecode.opencsv.CSVParser;

public class TestCSV {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException
	{
		CSVParser csvParser = new CSVParser(',');
		String[] str = csvParser.parseLine("1,2,\"Bitsight Technologies,INC\"");
		for(String s : str) {
			System.out.println(s);
		}
	}

}
