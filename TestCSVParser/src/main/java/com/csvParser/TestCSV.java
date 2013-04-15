package com.csvParser;

import java.io.IOException;

import au.com.bytecode.opencsv.CSVParser;
import au.com.bytecode.opencsv.CSVReader;

public class TestCSV {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException
	{
		CSVReader csvParser = new CSVParser(',');
		String[] str = csvParser.parseLine("1,2,\"Bitsight Technologies,INC\"");
		for(String s : str) {
			System.out.println(s);
		}
	}

}
