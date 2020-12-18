package assignment;

public class ConvertToBinary {
    public static void main(String[] args) {
        System.out.println(convertToBinary(100));
    }

    private static String convertToBinary(int n){
    String result ="1";
    while (n>1){
       int b=n%2;
       result=result+b;
       n=n/2;
    }

    return result;

    }
}
