abstract class Outer{
	abstract void fun();
}
class Output{
	public static void main(String[] args){
		Outer obj = new Outer(){
			void fun(){
				System.out.println("Override-In-Client$1");
			}
		};
		obj.fun();
	}
}
