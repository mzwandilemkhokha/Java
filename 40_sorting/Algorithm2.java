import java.util.*;
public class Algorithm {
    public static void main(String[] args) {
        int[][] lottonumbers = new int[10][50];

        for(int i=0;i<lottonumbers.length;i++){
            for(int j=0;i<lottonumbers.length;j++){
                  lottonumbers[i][j]=i+1;
                  System.out.println(lottonumbers[i][j]);
        }
    }
       
       
    }
}