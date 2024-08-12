/**
 * 
 */
package expresiones_LAMBDA;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author usuario
 *
 */
public class ExpresionesLAMBDA {

	// GenericInterfaz.java
	@FunctionalInterface
	interface GenericInterfaz<T> {

		// generic method
		T generic(T t);
	}

	/**
	 * 
	 */
	public ExpresionesLAMBDA() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericInterfaz<String> saludar = (usuario) -> {
			return "Hola amigo " + usuario;
		};

		GenericInterfaz<Double> areaCirculo = (radio) -> {
			System.out.println("Usted esta sacando el area de un circulo cuyo radio es igual a " + radio);
			return Math.PI * radio * radio;
		};

		System.out.println(saludar.generic("Marcelo"));
		System.out.println(areaCirculo.generic((double) 5));
		List<Double> list = new ArrayList<Double>();
		list.add(5.4);
		list.add(1.2);
		Optional<Double> opt = list.stream().sorted().findFirst();
		System.out.println(opt.get() + "" + list.get(0));
	}

}
