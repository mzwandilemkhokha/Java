import java.util.*;
import java.lang.*;

public class Switcher{
 
   

public static void main(String[] args){
switch(Integer.parseInt(args[1])){
case 0:
   boolean b=false;
   break;
case 1:
   b=true;
   break;
}
if(b) System.out.println(args[2]);
}

}

