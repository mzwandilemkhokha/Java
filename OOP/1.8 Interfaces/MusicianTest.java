public class MusicianTest {
	public static void main(String[] args) {
		Musician [] misicians = new Musician []{new PuffDaddy(),new JohnLegend(),new Snoop(), new Kabza()};
	PuffDaddy pdiddy=new PuffDaddy();
	System.out.println(pdiddy.getName());
		//ystem.out.println(puff.getName+" "+puff.getLyrics);
		for(int i = 0;i<misicians.length;i++){
			System.out.println("Name : "+ misicians[i].getName());
			System.out.println("Lyrics : "+ misicians[i].getLyrics());
		}
	}
}
