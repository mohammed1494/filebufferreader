package file.BufferReaderExample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class File_bufferReaderExample {

	public static void main(String[] args) throws IOException {
		String fileLocation = "C:\\Users\\Mohammed Ali\\eclipse-workspace\\FileBufferReader\\ADNews";
		FileReader fr = null;
		BufferedReader br = null;
		
		fr = new FileReader(fileLocation);
		br = new BufferedReader(fr);
		String data = "";
		while ((data = br.readLine()) !=null);{
			System.out.println(data);
		}
		
		
		

	}

}
