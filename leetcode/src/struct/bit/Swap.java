package struct.bit;

public class Swap {
    public static void swap(int a,int b){
        a=a^b;
        b=a^b;
        a=a^b;
    }
}
