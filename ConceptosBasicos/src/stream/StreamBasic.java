/**
 * 
 */
package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author usuario
 *
 */
public class StreamBasic {

	Stream<Map<String, Integer>> myStream;
	
	
	/**
	 * 
	 */
	public StreamBasic() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/**************
		 * map teoria *
		 **************/
		List<Integer> number = Arrays.asList(2,3,4,5);
		List<Integer> square = number.stream().map(x->x*x).collect(Collectors.toList());
		imprimirCollection(square);
		
		// Prueba
		List<String> cadena = Arrays.asList("Marcelo","Marcos","Lucas","Juan");
		List<String> cadenaSaludo = cadena.stream().map(x->"Hola " + x).collect(Collectors.toList());
		imprimirCollection(cadenaSaludo);
		
		/*****************
		 * filter teoria *
		 *****************/
		List<String> names = Arrays.asList("Reflection","Collection","Stream");
		List<String> result = names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
		imprimirCollection(result);
		result = names.stream().sorted().collect(Collectors.toList());
		imprimirCollection(result);
		
		number = Arrays.asList(2,3,4,5,3);
		Set<Integer> squareSet = number.stream().map(x->x*x).collect(Collectors.toSet());
		for(Integer element : squareSet) {
			System.out.println(element);
		}
		squareSet.stream().collect(Collectors.toList()).stream().sorted().forEach(y -> System.out.println(y));
		
		System.out.println("------------------------------------------------------");
		number = Arrays.asList(2,3,4,5);
		number.stream().filter(x->x%2==0).forEach(y -> System.out.println(y));
		int even = number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
		System.out.println(even);
		List<Double> doubleList = Arrays.asList((double)2,(double)3,(double)4,(double)5);
		Double decimal = doubleList.stream()
			    .mapToDouble(Double::byteValue)
			    .average()
			    .orElse(Double.NaN);
		//Double decimal = doubleList.stream().filter(x->x>2).mapt reduce((double)0,Double::sum);
		System.out.println(decimal);
	}
	
	private static void imprimirCollection(List lista) {
		if(Integer.class == lista.get(0).getClass()) {
			List<Integer> listaTemp = lista;
			for(Integer element : listaTemp) {
				System.out.println(element);
			}
		}
		
		if(String.class == lista.get(0).getClass()) {
			List<String> listaTemp = lista;
			for(String element : listaTemp) {
				System.out.println(element);
			}
		}
		
		
	}

}
