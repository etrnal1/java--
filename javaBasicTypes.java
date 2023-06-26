public class javaBasicTypes {
    public static void main(String[] args) {
        System.out.println("基本类型：byte 二进制位数：" + Byte.SIZE);  
        System.out.println("基本类型：short 二进制位数：" + Short.SIZE);
        System.out.println("基本类型：int 二进制位数：" + Integer.SIZE);  
        System.out.println("最小值：Long.MIN_VALUE=" + Long.MIN_VALUE);  
        System.out.println("最大值：Long.MAX_VALUE=" + Long.MAX_VALUE);
        System.out.println("最小值：Float.MIN_VALUE=" + Float.MIN_VALUE);  
        System.out.println("最大值：Float.MAX_VALUE=" + Float.MAX_VALUE);System.out.println("包装类：java.lang.Double");  
        System.out.println("最小值：Double.MIN_VALUE=" + Double.MIN_VALUE);  
        System.out.println("基本类型：char 二进制位数：" + Character.SIZE);  
        System.out.println("包装类：java.lang.Character");  
        System.out.println("我是java基本类型");
        final double pi = 3.15;
        System.out.println("我是使用final声明的常量"+pi);
        int decimal = 100;
        int octal = 0144;
        int hexa =  0x64;
        System.out.println("我是使用final声明的常量"+decimal);
        System.out.println("我是使用0开头10进制"+octal);
        System.out.println("我是使用16进制"+hexa);




    }
}
