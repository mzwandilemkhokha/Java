public class ParamTest7 {
   public static void main(String[] args) {
        String str1 = "Hello";
        
        String str2= "Mzwandile";
        String  str3="java"; 
        String longest=longString(str1, str2, str3);
    }
    
    public static String longString(String str1, String str2, String str3) {
        String lString="";
        if(str1.length()<str2.length()){
            if(str3.length()<str2.length())
            {
                 lString=str2;
            }
            else{
                lString=str3;
            }
       
        }
        else{
        lString=str1;
        }

        System.out.println("Longest string i variable is- " + lString);
        return lString;
        
    }
}