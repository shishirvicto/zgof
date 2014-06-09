package structural.adapter.impl;

import java.io.RandomAccessFile;

/**
 * Small example Imagine you need to develop a simple file manager to handle
 * text documents. There is an existing resource that already handles this, but
 * by some reason you are forced to a specific interface for your file manager.
 * By using a class adapter we can use the forced interface and still reuse the
 * existing functionality. In the class diagram below the interface FileManager
 * is the target (desired interface). FileManagerUtil is the existing utility
 * class that we would like to adapt to FileManager interface. We do the actual
 * adaptation in the class FileManagerImpl, this class uses the desired
 * interface and the existing functionality through inheritance, i.e. a class
 * adapter.
 * 
 * @author sgupta
 *
 */
public class FileManagerUtil {
	private RandomAccessFile f;

	public boolean openFile(String fileName) {
		System.out.println("Opening file: " + fileName);
		boolean success = true;
		return success;
	}

	public boolean closeFile() {
		System.out.println("Closing file");
		boolean success = true;
		return success;
	}

	public boolean writeToFile(String d, long pos, long amount) {
		System.out.print("Writing " + amount + " chars from string: " + d);
		System.out.println(" to pos: " + pos + " in file");
		boolean success = true;
		return success;
	}

	public String readFromFile(long pos, long amount) {
		System.out.print("Reading " + amount + " chars from pos: " + pos
				+ " in file");
		return new String("dynamite");
	}
}
