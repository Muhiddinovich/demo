package chapter17_added_features.sealed_interface;

public non-sealed class Alpha implements MySealedInterface,MyInterface {

	@Override
	public void MyMeth() {
		System.out.println("In Alpha's myMeth(). ");
	}

	@Override
	public void bark() {
		System.out.println("Barking here");
	}

}
