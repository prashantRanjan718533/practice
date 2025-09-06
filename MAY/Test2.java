package MAY;

import java.util.Arrays;

public class Test2 {
//    Write a program to get the desired output
//    input 12345 -> 1+2+3+4+5 ->15 -> 1+5 -> 6
//    The output should always return single-digit number
public static void main(String[] args) {
    Integer data = 13524;
    char chardata [] =data.toString().toCharArray();
    Integer sum = 0;
    for (int i = 0; i <chardata.length ; i++) {
     sum+=   Integer.valueOf(String.valueOf(chardata[i]));
    }
    System.out.println(sum);
    int sumdatas = 0;
    char [] sumdata = sum.toString().toCharArray();
    for (int i = 0; i < sumdata.length; i++) {
        sumdatas+=   Integer.valueOf(String.valueOf(sumdata[i]));
    }
    System.out.println(sumdatas);
}
}
