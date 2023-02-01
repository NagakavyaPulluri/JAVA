package collections;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import org.javatuples.Triplet;

public class MainCall {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat formatter = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		
		try {
		    ArrayList<String> logs = new ArrayList<>(Files.readAllLines(Paths.get("src/Call_Log.txt")));
//		    System.out.println(logs);
		    
		    
//		    System.out.println(logs.size());
		    Map<String, Triplet<String, String, String>> clog = new HashMap<String, Triplet<String, String, String>>();
		    for(int i = 0; i<logs.size(); i++) {
		    	String[] strar = logs.get(i).split(",");
		    	CallLog cl = new CallLog();
		    	cl.setNumberCalled(strar[1]);
		    	
		    	String dateInString = strar[2]; 
		    	Date date = formatter.parse(dateInString);
		    	String dateInStr = strar[2]; 
		    	Date date1 = formatter.parse(dateInStr);
		    	
		    	cl.setStartTime(date);
		    	cl.setEndTime(date1);
		    	
		    	
		    	clog.put(strar[0], new Triplet<>((strar[1]), (strar[2]), (strar[3])));
//		    	System.out.println(Arrays.toString(strar));
		    	
		    }
		    System.out.println(clog);
		    
//		    CallLog cl = new CallLog();
//
//		    System.out.println(clog.size());
//		    System.out.println("Before sorting");
//		    Iterator<String> it = clog.keySet().iterator();
//		    while(it.hasNext()) {
//		    	String key = it.next();
//		    	System.out.println("Customer name :" + key + "\ncontact number  StartTime      endTime" + "\n" + clog.get(key));
//		    }
		    
		    System.out.println("\nAfter Sorting");
		    TreeMap<String, Triplet<String, String, String>> smap = new TreeMap<String, Triplet<String, String, String>>(clog);
		    Iterator<String> it2 = smap.keySet().iterator();
		    while(it2.hasNext()){
		    	String key = it2.next();
		    	System.out.println("Customer name :" + key + "\ncontact number  StartTime      endTime" + "\n" + clog.get(key));
		    }
		    
		    
		    
		}
		catch (IOException e) {
		    // Handle a potential exception
		}
	}

}
