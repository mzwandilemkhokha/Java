public class AtmClass{

   // Constructing an instance method that displays menu options
    public void showMenu(){
        System.out.println("Welcome to the ATM");
        System.out.println("Press:");
        System.out.println("1-Withdraw");
        System.out.println("2-Ewallet");
        System.out.println("3-Transfer cash");

    }
    public static void main(String[] args) {
       int sensor=3; // 3 meters away
      int Atm_distance_sensor=sensor;  //this variable stores the minimum distance that automatically switches on the atm screen once a user reaches that point.
          AtmClass obj = new AtmClass();
        //the if statement automatically swiches on the atm screen once a user is 5 meters away from the atm.
        if(Atm_distance_sensor<5)
        {
         obj.showMenu();
       }

    }
    }