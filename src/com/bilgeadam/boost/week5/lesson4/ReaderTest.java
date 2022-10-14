package com.bilgeadam.boost.week5.lesson4;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class ReaderTest {
	public static final String MAIN_WORKING_DIRECTORY = "C:\\Users\\snozd\\eclipse-workspace\\BilgeAdam\\src\\com\\bilgeadam\\boost\\week5\\lesson4";

	public static void main(String[] args) {
		File letterFile = new File(MAIN_WORKING_DIRECTORY, "test.txt");
		List<String> list = readFileToList(letterFile);

		List<Double> data = convertStringListToDoubleList(list);
		List<Integer> data2 = convertStringListToIntegerList(list);

		List<Integer> data3 = convertStringListToIntegerListwStream(list);

		writeDoubleListToFile(data,"test2.dat");
		writeIntegerListToFile(data2, "test2.dat");
		writeIntegerListToFile(data3,"test3.txt");
	}

	private static void writeIntegerListToFile(List<Integer> data, String filename ) {
		try (DataOutputStream out = new DataOutputStream( 
				new BufferedOutputStream( 
						new FileOutputStream( 
								new File(MAIN_WORKING_DIRECTORY, filename))))) { 
			for (Integer value : data) {
				out.writeInt(value);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void writeDoubleListToFile(List<Double> data, String filename) {
		try (DataOutputStream out = new DataOutputStream( 
				new BufferedOutputStream( 
						new FileOutputStream( 
								new File(MAIN_WORKING_DIRECTORY, filename))))) { 
			for (Double value : data) {
				out.writeDouble(value);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static List<Integer> convertStringListToIntegerListwStream(List<String> list) {
		List<Integer> data = list.stream().map(Integer::parseInt).collect(Collectors.toList());
		return data;
	}

	private static List<Integer> convertStringListToIntegerList(List<String> list) {
		List<Integer> data = new ArrayList<>();
		for (String string : list) {
			int value = Integer.parseInt(string);
			data.add(value);
		}
		return data;
	}

	private static List<Double> convertStringListToDoubleList(List<String> list) {
		List<Double> data = new ArrayList<>();
		for (String string : list) {
			double value = Double.parseDouble(string);
			data.add(value);
		}
		return data;
	}

	private static List<String> readFileToList(File file) {
		List<String> list = new ArrayList<>();
		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
			while (true) {
				String line = reader.readLine();
				if (line == null) {
					break;
				}
				list.add(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return list;
	}
}
