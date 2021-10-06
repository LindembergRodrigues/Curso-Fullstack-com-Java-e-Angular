package collection.Map;

import java.util.*;

public class ExemploMap{
	public static void main(String [] args){

		System.out.println("Aula sobre Map");
		Map<String, Double> carros = new HashMap<>(){{
			put("Gol",14.4);
			put("Uno",15.6);
			put("Mobi",16.1);
			put("Hb20",14.5);
			put("Kwid",15.6);
			put("Jeep",16.1);
		}};
		System.out.println(carros);

		System.out.println("\nMODELOS");
		for (String modelos: carros.keySet()){
			System.out.println( modelos);
		}

		System.out.println("\nConsumo");
		for (Double autonomia: carros.values()){
			System.out.println( autonomia);
		}

		Set<Map.Entry<String, Double>> entrie = carros.entrySet();

		System.out.println("\nMaior consumo: ");
		for(Map.Entry<String, Double> entrie1: entrie){
			if (entrie1.getValue().equals(Collections.max(carros.values())) ){
				System.out.println("Modelo "+ entrie1.getKey() + ", Consumo " +carros.get(entrie1.getKey()));
			}
		}
		System.out.println("\nMenor consumo: ");
		for(Map.Entry<String, Double> entrie1: entrie){
			if (entrie1.getValue().equals(Collections.min(carros.values())) ){
				System.out.println("Modelo "+ entrie1.getKey() + ", Consumo " +carros.get(entrie1.getKey()));
			}
		}

		Iterator<Double> iterador = carros.values().iterator();
		double soma = 0d;

		while(iterador.hasNext()){
			soma += iterador.next();
		}
		System.out.println("\nA somas dos valores de autonomia é "+ soma );
		System.out.println("\nA média de autônomia é " + (soma /carros.size()));

		System.out.println("Remoção do valor 15.6 \n"+ carros.values());
		iterador = carros.values().iterator();
		while (iterador.hasNext()){
			if (iterador.next().equals(15.6)){
				iterador.remove();
			}
		}
		System.out.println("\n Após remoção "+ carros.values());

		Map<String, Double> carros2 = new LinkedHashMap<>(){{
			put("Gol",14.4);
			put("Uno",15.6);
			put("Mobi",16.1);
			put("Hb20",14.5);
			put("Kwid",15.6);
			put("Jeep",16.1);
		}};
		System.out.println("\nImpressão pela ordem de inserção " + carros2);

		Set<String> listaCarros = carros.keySet() ;

		System.out.println(listaCarros);
	}
}