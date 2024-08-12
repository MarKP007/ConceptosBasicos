/**
 * 
 */
package generic;

/**
 * @author usuario
 *
 */
public class GenericMethod {

	/**
	 * 
	 */
	public GenericMethod() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// initialize the class with Integer data
		DemoClass demo = new DemoClass();

		// generics method working with String
		demo.<String>genericsMethod("Java Programming");

		// generics method working with integer
		demo.<Integer>genericsMethod(25);

	}

	static class DemoClass {

		// creae a generics method
		public <T> void genericsMethod(T data) {
			System.out.println("Generics Method:");
			System.out.println("Data Passed: " + data);
		}
	}

}
