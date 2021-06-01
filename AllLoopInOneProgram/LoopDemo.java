package AllLoopInOneProgram;

public class LoopDemo {
    public static void main(String[] args) {
    for(int i = 0 ; i< 10; i++)
        {
            System.out.printf("Bangladesh : %d\n",i+1);
        }
        int j = 0;
        while( j<10){
            System.out.printf("Bangladesh : %d\n",j+1);
            j++;
        }
        int k= 0;
        do{
            System.out.printf("Bangladesh : %d\n",k+1);
            k++;
        }
        while( k<10);
    }
}
