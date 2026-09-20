/* Inner class is depend on Outer class so when Outer class object is created then only we can acess the method or variable inside 
the Inner class by creating an object of Inner */
//THIS CODE TELLS THE WAY TO ACESS A INNERCLASS METHOD 
class Outer{
	class Inner{
		void dispinner(){
			System.out.println("In Inner method");
		}
	}
	void dispouter(){
		System.out.println("In Outer method");
	}
}
class Display{
	public static void main(String[] args){
		Outer outobj1 = new Outer();
		Outer.Inner obj1 = outobj1.new Inner();
		obj1.dispinner();
		outobj1.dispouter();

		Outer outobj2 = new Outer();
		Outer.Inner obj2 = outobj2.new Inner();
		obj2.dispinner();

		Outer.Inner obj3 = outobj1.new Inner();
		obj3.dispinner();
	}
}
