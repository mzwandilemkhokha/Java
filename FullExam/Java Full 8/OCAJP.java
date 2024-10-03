interface OCAJP {
  String type="A";
  void fly();

  default String getType(){
  	return type;
  }
}
class Exam{
	void method(){}
}
