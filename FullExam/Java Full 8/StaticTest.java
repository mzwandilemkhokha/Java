class StaticTest{
	void m1(){
	StaticTest.m2();
	m4();
	StaticTest.m3();
	}

	static void m2(){}

	void m3(){
	m1();
	m2();
	m1();
	}

	static void m4(){}
}