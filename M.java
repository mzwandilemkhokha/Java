public class M{
    public static void main(String[] args){
        C c= new C();
        ((A)this).perform_work();
    }
}

class A{public void perform_work(){
    System.out.println("A");
}}
class B extends A{public void perform_work(){System.out.println("B");}}
class C extends A{public void perform_work(){System.out.println("C");}}

