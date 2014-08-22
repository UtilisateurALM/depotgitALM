package packanimals;

public class Monzoo {

	public static void main(String[] args) {
		Animal a = new Chien(25,3);
		Chien c = new Chien(25,3);
		Lion l = new Lion(30,4);
		
		Lion simba = new Lion(12,6);
		
		System.out.println(a);
		System.out.println(c);
		System.out.println(l);
		
		a.manger();
		c.manger();
		l.manger();
		simba.manger();
	}

}
