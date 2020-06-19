package struct.bit;

import java.util.HashMap;
import java.util.Map;

public class ReverseBits {
    private static Map<Byte,Integer>cache=new HashMap<>();

    public int reverseBits2(int x){
        int ret=0;
        for (int i = 0; i <4 ; i++) {
            ret <<= 8;
            ret |= reverseByte((byte) (x & 0b11111111));
            x >>= 8;

        }
        return ret;

    }

    private int reverseByte(byte b) {
        if(cache.containsKey(b))return cache.get(b);
        int ret=0;
        for (int i = 0; i <8 ; i++) {
            ret<<=1;
            ret|=(b&1);
            b>>>=1;

        }
        cache.put(b,ret);
        return ret;
    }

    public static int reverseBits(int x){
        int ret=0;
        for (int i = 0; i <32 ; i++) {
            ret<<=1;
            ret|=(x&1);
            x>>>=1;//左边会补0

        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(reverseBits(5));
    }
}
