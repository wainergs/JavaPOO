package application;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class List {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>() ;
		
		list.add("Eduardo");
		list.add("Sandra");
		list.add("Joao");
		list.add("Erivaldo");
		
		//adicionando elemento na posicao 2
		list.add(2, "Marcos");
		
		//tamanho da lista
		System.out.println(list.size());
		
	
		
		
		for (String x: list) {
			System.out.println(x);
		}
		System.out.println("---------------");
		
		//removendo pelo valor
		list.remove("Joao");
		
		//removendo pelo indice
		list.remove(2);
		
		
		//removendo por predicado
		list.removeIf(x -> x.charAt(0)=='S');
		
		for (String x: list) {
			System.out.println(x);
		}
		System.out.println("index of: "+list.indexOf("Eduardo"));
		
		System.out.println("---------------------");
		
		list.add("Carlos");
		list.add("Caua");
		list.add("Tais");
		
		
		//Copiando uma arrayList para outra deixando somente os items que comecam com a letra 'E'
		//converte para stream  ==>  list.stream()
		//faz a operacao lambda com tipo 'Lista' ==>.filter(x ->x.charAt(0)=='E')
		//depois voltar para lista   ==> collect(Collectors.toList())
		ArrayList<String> result = (ArrayList<String>) list.stream().filter(x ->x.charAt(0)=='E').collect(Collectors.toList());
		for (String x: result) {
			System.out.println(x);
		}	
		
		System.out.println("---------------------");
		String name = list.stream().filter(x ->x.charAt(0)=='C').findFirst().orElse(null);
		System.out.println(name);
		
		
		
		
		
		
	}

}
