// Method local innerclassclass 
class Outer{
	void dispOuter(){
		System.out.println("In disp1 method");
		class Inner{
			void dispInner(){
				System.out.println("In Inner-1-disp");
			}
		}
		Inner obj = new Inner();
		obj.dispInner();
	}
	public static void main(String[] args){
		Outer obj = new Outer();
		obj.dispOuter();
	}
}
