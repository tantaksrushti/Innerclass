// it mainly work on functional interface
interface Demo{
	void fun();
}
class Fun{
	public static void main(String[] args){
		Demo obj = ()->System.out.println("In-fun");
		obj.fun();
	}
}
