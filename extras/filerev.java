//Reverse a content file and copy it to another file

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.io.Reader;
import java.io.FileWriter;


public class Main {
	
	public int[] readByte(File _file) throws Exception {
		FileInputStream source = new FileInputStream(_file);
		int currentByte = source.available();
		int readCount = 0;
		
		int byteContainer[] = new int[currentByte];
		while(readCount < currentByte){
			byteContainer[readCount] = source.read();
			readCount++;
		}
		source.close();
		return byteContainer;
	}
	
	public void printReverse(int[] fileContent) throws Exception
	{
		char[] str = new char[fileContent.length];
		for(int byt=fileContent.length -1,i=0; byt >= 0 ; byt--,i++)
		{
			str[i]= (char)fileContent[byt];
		}
		FileWriter fw = new FileWriter("b.txt");
		
		for (int i = 0; i < fileContent.length; i++)
			fw.write(str[i]);
		
		System.out.println("Successfully written");
		
		
		fw.close();
	}
	
	public static void main(String[] args) throws Exception {
		File fileToRead = new File("a.txt");
		
		Main demo = new Main ();
		int[] readBytes = demo.readByte(fileToRead);
		
		demo.printReverse(readBytes);
	}
	
}
