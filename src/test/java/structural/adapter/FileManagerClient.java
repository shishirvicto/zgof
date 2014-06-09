package structural.adapter;

import structural.adapter.impl.FileManagerImpl;
import structural.adapter.interfaces.FileManager;

/**
 * When FileManagerClient is executed the result is:
c:>Opening file: dummyfile.dat
c:>Writing 8 chars from string: dynamite to pos: 0 in file
c:>Reading 8 chars from pos: 0 in fileData written and read: dynamite
c:>Closing file

Usage example
The Java API uses the Adapter pattern, WindowAdapter, ComponentAdapter, ContainerAdapter, 
FocusAdapter, KeyAdapter, MouseAdapter, MouseMotionAdapter.

Definition
The Adapter pattern is used to translate the interface of one class into another interface. This means that we can make classes work together that couldn't otherwise because of incompatible interfaces. A class adapter uses multiple inheritance (by extending one class and/or implementing one or more classes) to adapt one interface to another. An object adapter relies on object aggregation.
Where to use
•When you want to use an existing class, and its interface does not match the one you need.
•When you want to create a reusable class that cooperates with unrelated or unforeseen classes, that is, classes that don't necessarily have compatible interfaces.
•When you want to increase transparency of classes. 
•When you want to make a pluggable kit.

Benefits
•Highly class reusable. •Introduces only one object

Drawbacks/consequences
When using Java, Target must be an interface.

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
