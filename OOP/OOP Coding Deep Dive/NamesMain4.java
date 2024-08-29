public NamesMain4{
	public static void main(String[] args){
      String student_name=new StudentNameGetter().getName();
      String sCourse=new StudentCourse().getStudentCourse();
      int StudentNo=new StudentNoGetter().getStudentNo();

      System.out.println("Hello" + student_name+" Your student No is:"+ StudentNo);
      System.out.println("You are registered for the "+sCourse+" Degree");
	}

}