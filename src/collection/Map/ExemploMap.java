package collection.Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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
		System.out.println(carros.toString());

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

	}
}