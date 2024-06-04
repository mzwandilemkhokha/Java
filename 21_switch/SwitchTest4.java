 public class SwitchTest4 {
    public static void main(String[] args) {
        int option = 3;
        
        if (option == 1)
            if (option == 2)
                if (option == 3)
                    System.out.println("Option is 3");
                else
                    System.out.println("Option is not 3");
            else
                System.out.println("Option is not 2");
        else
            System.out.println("Option is not 1");


            switch(option){
            case 1:{

            }break;
            case 2:{

            }break;
           case 3:{

        }break;
        }
    }
}
