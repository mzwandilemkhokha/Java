 public class InitErrorTest {	
	
	static Object member = null  ;

	static{
		if(member!=null){
        member.toString();
           }
       else{
	   System.out.println("member variable is null");
       }
	}

	
	public static void main(String[] args) {	
		System.out.println("Step 1");
	}
}
