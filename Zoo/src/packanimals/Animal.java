package packanimals;

public class Animal {
int poids;
int age;

public Animal(int poids, int age) {
	
	this.poids = poids;
	this.age = age;
}

public void manger(){
	System.out.println("L'animal mange");
}

@Override
public String toString() {
	return "Animal [poids=" + poids + ", age=" + age + "]";
}


}
