package structural.adapter;

import structural.adapter.impl.FileManagerImpl;
import structural.adapter.interfaces.FileManager;

/**
 * When FileManagerClient is executed the result is:
c:>Opening file: dummyfile.dat
c:>Writing 8 chars from string: dynamite to pos: 0 in file
c:>Reading 8 chars from pos: 0 in fileData written and read: dynamite
c:>Closing file

 * @author sgupta
 *
 */
public class FileManagerClient {
	public static void main(String[] args) {
		FileManager f = null;
		String dummyData = "dynamite";
		f = new FileManagerImpl();
		System.out.println("Using filemanager: " + f.getClass().toString());
		f.open("dummyfile.dat");
		f.write(0, dummyData.length(), dummyData.getBytes());
		String test = f.read(0, dummyData.length(), dummyData.getBytes());
		System.out.println("Data written and read: " + test);
		f.close();
	}

}
