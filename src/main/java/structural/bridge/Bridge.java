package structural.bridge;

/**
 * Sometimes an abstraction should have different implementations; consider an
 * object that handles persistence of objects over different platforms using
 * either relational databases or file system structures (files and folders). A
 * simple implementation might choose to extend the object itself to implement
 * the functionality for both file system and RDBMS. However this implementation
 * would create a problem; Inheritance binds an implementation to the
 * abstraction and thus it would be difficult to modify, extend, and reuse
 * abstraction and implementation independently.
 * 
 *
 */
public class Bridge {
	public static void main(String[] args) {
		Computer dell = new Dell(new Producer(), new Assembler());
		dell.manufacture();
		Computer apple = new Apple(new Producer(), new Assembler());
		apple.manufacture();
	}
}
