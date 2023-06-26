/**
 * java 程序的构造函数
 * class 声明类名
 * String 声明字符串类型
 * int 声明整型
 * 创建实例子          NewClassGouzao myInstance = new NewClassGouzao("某种品种", 10, "红色", 5);
 * 调用方法           myInstance.sleep();
 */
public class NewClassGouzao {
    String breed;
    int size;
    String Colour;
    int age;

    // 添加构造函数
    public NewClassGouzao(String breed, int size, String Colour, int age) {
        this.breed = breed;
        this.size = size;
        this.Colour = Colour;
        this.age = age;
    }

    void eat() {

    }

    void run() {
        System.out.println("我正在跑步");
    }

    void sleep() {
        System.out.println("我正在睡觉");
    }
    void name() {

    }
    public static void main(String[] args) {
        // 创建 NewClassGouzao 类的实例
        NewClassGouzao myInstance = new NewClassGouzao("某种品种", 10, "红色", 5);

        // 调用 sleep 方法
        myInstance.sleep();
        myInstance.run();
        System.out.println("我是一个class 程序,用来编辑和class程序相关的日志");
                // System.out.println("我正在跑步");

    }
}
