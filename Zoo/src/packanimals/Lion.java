package packanimals;

public class Lion extends Animal {

	public Lion(int poids, int age) {
		this.poids = poids;
		this.age = age;
		
	}
	public void manger(){
		System.out.println("Le lion mange");
	}

	@Override
	public String toString() {
		return "Lion [poids=" + poids + ", age=" + age + "]";
	}
}
