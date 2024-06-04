public class MultiTest2 {
    public static void main(String[] args) {
    	
        int [][] lottogroups = {{1111,2222,3333,4444},{6666,7777,8888,9999},{11111,121212,131313}};
    	
        for(int i = 0;i < lottogroups.length ;i++){
            if(i%2==0){
            System.out.println("Group :"+i);
        }
            for(int j = 0;j < lottogroups[i].length ;j++){
                if(j%2==0){
                System.out.println("  Value "+j+" = "+lottogroups[i][j]);
            }
            }        	
        }
    }
}
