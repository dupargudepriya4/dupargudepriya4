
public class DmoImpl {

	public static void main(String[] args) {
	IDemo id = new IDemo(){
		public int add(int a,int b){
			return a+b;
			
			
		}
	};
	System.out.println(id.add(5,6));

	System.out.println(id.add(5,6));

	}

}
