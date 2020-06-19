package struct.bit;

public class HasAlternationBits {
    public static boolean hasAlternationsBits(int n){
        int a=n|(n>>1);
        return (a&(a+1))==0;
    }

    public static void main(String[] args) {
        System.out.println(hasAlternationsBits(5));
    }
}
