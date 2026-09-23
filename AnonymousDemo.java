class Outer{
	void fun(){
		System.out.println("In-fun");
	}
}
class Client{
	public static void main(String[] args){
		Outer obj = new Outer(){
			void fun(){ //Client$1.class , Parent of this class is Outer
				System.out.println("In-Client$1");
			}
		};
		obj.fun();
	}
}
