class Outer{
	class Inner1{
		void dispinner1(){
			System.out.println("In Inner1 method");
		}
	class Inner2{
		void dispinner2(){
			System.out.println(" In Inner2 method");
		}
	}
   }
}
class Output{
	public static void main(String[] args){
		Outer outobj = new Outer();
		Outer.Inner1 obj1 = outobj.new Inner1();
         	Outer.Inner1.Inner2 obj2 = obj1.new Inner2();

		obj1.dispinner1();
		obj2.dispinner2();

	}
}
