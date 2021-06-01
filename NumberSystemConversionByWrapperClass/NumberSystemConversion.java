package NumberSystemConversionByWrapperClass;

public class NumberSystemConversion {

    public static void main(String[] args) {
        String bin = "1001010";
        int dec = Integer.parseInt(bin, 2);
        System.out.println("Decimal number is : " + dec);

        String oct = "7652";
        Integer dec1 = Integer.parseInt(oct, 8);
        System.out.println("Decimal number is : " + dec1);
        
        String hex = "765AC2";
        Integer dec2 = Integer.parseInt(hex, 16);
        System.out.println("Decimal number is : " + dec2);
        
        int deci = 125;
        String bin1 = Integer.toBinaryString(deci);
        String oct1 = Integer.toOctalString(deci);
        String hex1 = Integer.toHexString(deci);
        System.out.println("Binary is : "+bin1);
        System.out.println("Octal is : "+oct1);
        System.out.println("Hexadecimal is : "+hex1);
        
    }
}
