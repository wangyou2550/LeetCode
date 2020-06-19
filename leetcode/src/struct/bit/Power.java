package struct.bit;

public class Power {
    public static boolean isPowerOfTwo(int n) {
        return n != 0 && (n & (n - 1)) != 0;
    }

    public static boolean isPowerofFour(int n) {
        return isPowerOfTwo(n) && (n & (0b0101010101010101010101)) != 0;
    }

    public static void main(String[] args) {
        System.out.println(isPowerofFour(64));
    }
}
