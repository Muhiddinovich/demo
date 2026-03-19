package chapter17_added_features.sealed_interface;

public sealed interface MySealedInterface permits Alpha, Beta, MyInterface{
	void MyMeth();
}
