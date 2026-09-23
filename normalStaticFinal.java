class Outer{
	int num1 = 10;
	class Inner{
		int num2 = 20;
		final static int num3 = 30;
		void dispInner(){
			System.out.println(num1);
			System.out.println(num2);
			System.out.println(num3);
		}
	}
	void dispOuter(){
		System.out.println(num1);
	}
}
class Output{
	public static void main(String [] args){
		Outer outobj = new Outer();
		Outer.Inner innobj = outobj.new Inner();
		innobj.dispInner();
		outobj.dispOuter();
	}
}
