package packanimals;

public class Monzoo {

	public static void main(String[] args) {
		Animal a = new Animal(25,3);
		Chien c = new Chien(25,3);
		Lion l = new Lion(30,4);
		
		System.out.println(a.toString());
		System.out.println(c.toString());
		System.out.println(l.toString());
		
		a.manger();
		c.manger();
	}

}
