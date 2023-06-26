/**
 * Local Variables [局部变量];
 * Instance Variables [成员变量];
 * Class Variables   [静态变量];
 * Parameters    [参数变量];
 * 声明变量前必须加上对应的关键字;
 * 变量先声明在使用;
 */
public class javaVariableTypes {
    private int instanceVar;
    private static int staticVar;

    int a, b, c;
    int d = 3, e = 4, f = 5;
    byte z = 22; 
    String s = "存款";
    double pi = 3.14159;
    char x = 'x'; 
    public void method  (int parmVar){
        int localVar = 10 ;
        instanceVar = localVar;
        staticVar=parmVar;

        System.out.println("声明的静态整型值"+staticVar);
    }
    public static void main(String[] args) {
        System.out.println("java 变量类型,分为局部变量,静态变量,参数变量,成员变量");
        javaVariableTypes test = new javaVariableTypes();
        test.method(2);
    }
}
