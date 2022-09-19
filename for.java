import java.lang.Math;
 
class Main {
 
    public static void main(String args[])
    {
        
        int max = 5;
        int min = 0;
        int range = max - min + 1;
 
        for (int i = 0; i < 6; i++) {
            int rand = (int)(Math.random() * range) + min;
        if (rand==5){
            System.out.println("5!=5*4*3*2*1");
                }
        if (rand==4){
            System.out.println("4!=4*3*2*1");
                }
        if (rand==3){
            System.out.println("3!=3*2*1");
                }
        if (rand==2){
            System.out.println("2!=2*1");
                }
        if (rand==1){
            System.out.println("1!=1");
                }
        if (rand==0){
            System.out.println("0!=1");
                }
 
            
            
        }
    }
}