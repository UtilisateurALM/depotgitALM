package packanimals;

public abstract class Animal {
int poids;
int age;

public Animal(){

}

public Animal(int poids, int age) {
	
	this.poids = poids;
	this.age = age;
}

public void manger(){
	System.out.println("L'animal mange");
}

@Override
public String toString() {
	return "L'animal pèse TU PEEEESSEEEES  " + poids + " kg et a " + age + " ans";
}


}
