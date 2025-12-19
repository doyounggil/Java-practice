import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class FileConverter {
	
	public static void q2() {
		try {
			FileInputStream fis = new FileInputStream("input.txt");
			byte[] buf = new byte[fis.available()];
			
			fis.read(buf);
			fis.close();
			
			String str = new String(buf);
			
			ArrayList<String> arr = new ArrayList<>();
			
			String[] split = str.split("\n");
			for(int i=0; i<split.length; i++) {
				if (split[i].isEmpty()) {
					continue; 
				}
				String splitStr1 = split[i].substring(0,1);
				String splitStr2 = split[i].substring(1);
				String first = splitStr1.toUpperCase();
				String remain = splitStr2.toLowerCase();
				String full = first+remain;
				arr.add(full);
				
			}
			List<String> result = arr.stream().distinct().sorted().collect(Collectors.toList());
					  
			
			FileOutputStream fos = new FileOutputStream("output.txt");
			
			for(String s: result) {
				fos.write(s.getBytes());
				fos.write('\n');
			}
			
			fos.flush();
			fos.close();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
