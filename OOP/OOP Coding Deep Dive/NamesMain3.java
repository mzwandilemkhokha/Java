public NamesMain3{
	public static void main(String[] args){
      String name=new NameGetter3().getName();
      String surname=new SurnameGetter3().getSurname();
      int age=new AgeGetter3().getAge();

      System.out.println("Hello" name+" "+ surname);
      System.out.println("You are "+age+" old");
	}

}