class Element{
	int key=5;
	Element successor;
	public Element(int key){
	this.key=key;

	}

	public static void main(String [] args){

	final Element u=new Element(9);
	Element v=new Element(18);
	u.successor=v;
	v=adjustIt(u,v);
	System.out.println(u.successor.key+" "+ v.successor.key);

	}

	public static Element adjustIt(final Element p, final Element q){
	p.successor=q.successor;
return p;
	}
}