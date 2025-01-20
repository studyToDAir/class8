package quiz;

import java.util.ArrayList;

public class PokemonLeague {

	String name = null;
	ArrayList list = new ArrayList();
	Pokemon[] arrPokemon = new Pokemon[10];

	void name() {
	}
	void name(int name) {
		this.name = null;
	}
	
	PokemonLeague(String name){
		
		this.name(1);
		
//		System.out.println(arrPokemon[0]);
		System.out.println("name : "+ name);
		this.name = name;
	}
	
	void add(Pokemon p) {
		this.list.add(p);
	}
	
	void print() {
		System.out.println("--------");
		System.out.println( this.name + "리그 참가 포켓몬 목록입니다");
		for(int i=0; i<list.size(); i++) {
			Pokemon p = (Pokemon)list.get(i);
			System.out.println(p);
			System.out.println("이름:"+ p.name);
			System.out.println("타입:"+ p.type);
			System.out.println();
		}
	}
	
	
	Pokemon[] getArray(){
		return arrPokemon;
	}
}
