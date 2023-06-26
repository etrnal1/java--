/**
 * - `enum FreshJuiceSize {SAMLL, MEDIUM, LARGE}`: 在 `FreshJuice` 类内部定义一个名为 `FreshJuiceSize` 的枚举类型，它表示果汁的大小。枚举类型包含三个枚举常量：SMALL、MEDIUM 和 LARGE。
- `class FreshJuice`: 定义一个名为 `FreshJuice` 的新类。

- `enum FreshJuiceSize {SAMLL, MEDIUM, LARGE}`: 在 `FreshJuice` 类内部定义一个名为 `FreshJuiceSize` 的枚举类型，它表示果汁的大小。枚举类型包含三个枚举常量：SMALL、MEDIUM 和 LARGE。

- `FreshJuiceSize size;`: 在 `FreshJuice` 类中定义一个名为 `size` 的成员变量，其类型为 `FreshJuiceSize` 枚举。这个变量将用于存储果汁的大小。

- `public class Medium`: 定义一个名为 `Medium` 的公共类，这个类包含程序的主要逻辑。

- `public static void main(String[] args)`: 定义一个名为 `main` 的方法，这是 Java 程序的入口点。`main` 方法包含 `public`（公共）和 `static`（静态）修饰符，返回类型为 `void`（无返回值）。`main` 方法接受一个 `String` 类型的数组参数 `args`，用于传递命令行参数。

- `FreshJuice juice = new FreshJuice();`: 创建一个 `FreshJuice` 类的实例，并将其赋值给名为 `juice` 的变量。`new` 关键字用于实例化对象。

- `juice.size = FreshJuice.FreshJuiceSize.MEDIUM;`: 为 `juice` 对象的 `size` 成员变量赋值，将其设置为 `FreshJuice.FreshJuiceSize.MEDIUM`。这表示果汁的大小为中等。

- `System.out.println(juice.size);`: 输出 `juice` 对象的 `size` 成员变量的值，即果汁的大小。在这个例子中，将输出 "MEDIUM"。`System.out` 是一个 `PrintStream` 类型的对象，表示标准输出。`println` 方法用于在控制台打印一行文本。
 */
class FreshJuice {
    enum FreshJuiceSize {SAMLL,MEDIUM,LARGE}
    FreshJuiceSize size;
}
public class Medium {
    public static void main(String[] args) {
        /**
         * new 一个对象
         * 
         */
        FreshJuice juice = new FreshJuice();
        juice.size =FreshJuice.FreshJuiceSize.LARGE;
        System.out.println(juice.size);
    }
}
