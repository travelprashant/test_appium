package test_appium.test_appium;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class ReadErrorFile {

	public static void main(String[] args) {
		ReadFile();
	}

	public static void ReadFile() {
		BufferedReader br = null;
		HashMap<String, LinkedList<String>> map = new HashMap<String, LinkedList<String>>();
		String testCaseName = "";
		LinkedList<String> testStatus =new LinkedList<String>();
		try {
			br = new BufferedReader(new FileReader("myfile.txt"));
			String contentLine = br.readLine();
			boolean flag =false;
			String testDesc = "";
			while (contentLine != null) {
				
				if(flag){
					testDesc=contentLine.trim();
					flag=false;
				}
				if (contentLine.contains("TestSuite")) {

					if (testCaseName.length() != 0) {
						map.put(testCaseName, testStatus);
						testCaseName = "";
						testStatus = new LinkedList<String>();
					}
					String[] tmp = contentLine.split("TestSuite :");
					testCaseName += tmp[1].trim();
					
				}
				if (contentLine.contains("TestCase")) {
					String[] tmp = contentLine.split("TestCase :");
					testCaseName += "_" + tmp[1].trim();
				
				}

				if (contentLine.contains("Test Step Description :")) {
					flag=true;
				}

				if (contentLine.contains("Status : fail")) {
					testStatus.add(testDesc);
					
				}

				contentLine = br.readLine();
			}

		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();

			} catch (IOException ioe) {
				System.out.println("Error in closing the BufferedReader");
			}
		}
		
		Iterator itr= map.entrySet().iterator();
		while(itr.hasNext()){
			Map.Entry pair=(Map.Entry)itr.next();
			 System.out.println(pair.getKey() + " = " + pair.getValue());
		}

	}

}
