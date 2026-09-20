class Outer{
     	//final Outer this$0;
	class Inner{
		void innerMethod(){
			System.out.println("In Inner Method");
		}
	}
	void outerMethod(){
		System.out.println("In Outer Method");
	}
}
class Output{
	public static void main(String[] args){
		Outer outobj1 = new Outer();
		Outer.Inner obj1 = outobj1.new Inner();
	}
}
