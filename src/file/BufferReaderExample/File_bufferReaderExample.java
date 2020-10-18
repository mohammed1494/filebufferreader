package file.BufferReaderExample;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class File_bufferReaderExample {

	public static void main(String[] args) {
		String fileLocation = "C:\\Users\\Mohammed Ali\\eclipse-workspace\\FileBufferReader\\datafile\\ADnews.txt";
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(fileLocation);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			br = new BufferedReader(fr);

			//BufferedReader br1 = new BufferedReader(new FileReader(fileLocation));
			//above string is all the above in simpler form lines 11-15
			String data = "";
			while ((data = br.readLine()) !=null){
				System.out.println(data);
			}
		}catch (Exception ex) {
		System.out.println("File is not readable, data may be corrupted");
	}
         //working now what was the issue? you had semicolon after for loop and path was wrong too
		//I chaged the path i ahd the txt but nonetheless thank you no prob. please practice atlyways debug the code if there is any issue ok ty
		//clean up the code. yesthank you bye
}

}
