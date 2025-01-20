package quiz;

public class PokemonExam {

	public static void main(String[] args) {

		Pokemon p1 = new Pokemon();
		p1.name = "피카츄";
		p1.type = "전기";
		
		Pokemon p2 = new Pokemon();
		p2.name = "파이리";
		p2.type = "불";
		
		PokemonLeague pl = new PokemonLeague("관동");
		pl.add(p2);
		pl.add(p1);
		
		pl.print();
		Pokemon[] a = pl.getArray();
	}

}
