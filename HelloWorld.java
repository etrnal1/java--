/**
 * 类名字和文件名字一致
 * javac HelloWorld.java 生成class文件
 * java HelloWorld 生成执行结果
 * void 代表返回类型
 * public 访问修饰符
 * static 关键字
 * main 方法名
 * String string 类
 * args 字符串数组
 * javac -encoding UTF-8 HelloWorld.java 指点类型编码编译java
 * 类名首字母大写
 * 方法名小写字母开头
 * 类名必须有main方法,否则报错
 * default, public , protected, private
 * final, abstract, static, synchronized
 * 局部变量
*  类变量（静态变量）
* 成员变量（非静态变量）
*Java 5.0引入了枚举，枚举限制变量只能是预先设定好的值。使用枚举可以减少代码中的 bug。
*例如，我们为果汁店设计一个程序，它将限制果汁为小杯、中杯、大杯。这就意味着它不允许顾客点除了这三种尺寸外的果汁。
* java 源程序编译成class 字节码程序,然后在解释器里面执行 
*/
public class HelloWorld {
    public static void main(String[] args){
        //  System.out.println("Hello World"); // 输出 Hello World

         System.out.println("Hello World");
    }
   
}