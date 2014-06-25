package packanimals;

public class Chien extends Animal {

	
	public Chien(int poids, int age) {
		super(poids, age);
	
	}
	
	public void manger(){
		System.out.println("Le chien mange");
	}

	@Override
	public String toString() {
		return "Chien [poids=" + poids + ", age=" + age + "]";
	}
	

}
