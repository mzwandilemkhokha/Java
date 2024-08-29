public class InterfaceImplementer implements myInterface{
	static int i=5, j=7;
	int x=6;
	int y=8;
	int var4;
	int var5;
	static int var6,var7;
	static{
		var7=11;
	}
	{
		var4=15;
	}
	{
		i++;
		j++;
		var4++;
		var5++;
		var6++;
		var7++;
	}



	final static int var2=10;
	final static String var3="10";
	final static int var1=0;;
	public void converter(String input){
	System.out.println(Integer.parseInt(input));
	}


public InterfaceImplementer(){
	var5=13;
	var6=9;
}


public InterfaceImplementer(int i, int j){
	
	double result=i + j-this.var6+4.0+this.var7;
	System.out.println(result);
}

public InterfaceImplementer(int a, int b,int c){
	
	this(a,b);
	double result=(a-b+this.var6+c)-var7;
	System.out.println(result);
}

	public void dolt(){
		int  a=2;
		this.dolt(x,y,a);
		System.out.println("X="+x+""+"Y="+y+"");

	}

	public void dolt(int a, int b, int c){
		a=4;
		b=4;
		c=1;

		this.dolt(i,j,a,b);
	}

	static int dolt(int i, int j, int x, int y){
		int a=3;
		int ret=(i+j*x)/a*var2;
		return ret;
	}

	public static void main(String[] args){
		InterfaceImplementer a = new InterfaceImplementer();
		a.converter(var3);
		a.dolt();

InterfaceImplementer UnsupportedOperationException=new InterfaceImplementer(j,var6,var7);
	}
}