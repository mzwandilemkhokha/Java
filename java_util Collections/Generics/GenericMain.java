import java.util.*;

 public class GenericMain{
public static void main(String[] args){
	List<Banana> bananaList= new ArrayList<Banana>();
	for (int i=0;i<15 ;i++ ) {
		bananaList.add(new Banana());
	}

	Iterator<Banana> itr= bananaList.iterator();

	while(itr.hasNext()){
		System.out.println(itr.next());
	}


  Map<Ball, Banana> map_key = new HashMap<Ball, Banana>();

        // Create instances of Banana and Ball
        Banana banana = new Banana();
        Ball ball = new Ball();

        // Put the Ball and Banana into the map
        map_key.put(ball, banana);
	System.out.println();
	System.out.println("HashMap");
	System.out.println(map_key);
}
}
