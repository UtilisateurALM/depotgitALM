package packanimals;

public class Monzoo {

	public static void main(String[] args) {
		Animal a = new Chien(25,3);
		Chien c = new Chien(25,3);
		Lion l = new Lion(30,4);
		
		Lion simba = new Lion(12,6);
		Animal muf = new Lion(15,9);
		
		Chien dog = new Chien(12,2);
		
		System.out.println(a);
		System.out.println(c);
		System.out.println(l);
		System.out.println(muf);
		System.out.println(dog);
		
		a.manger();
		c.manger();
		l.manger();
		simba.manger();
	}

}
