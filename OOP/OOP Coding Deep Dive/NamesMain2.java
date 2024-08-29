public NamesMain2{
	public static void main(String[] args){
      String name=new NameGetter2().getName();
      String surname=new SurnameGetter2().getSurname();
      int age=new AgeGetter2().getAge();

      System.out.println("Hello" name+" "+ surname);
      System.out.println("You are "+age+" old");
	}

}