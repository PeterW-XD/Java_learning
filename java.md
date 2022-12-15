# Java

## 1.初步

### sublime的使用

快捷键修改：key bindings-复制左侧的默认到右侧-修改即可（多个条目用 , 间隔）

- ctrl+shift+d复制整行到下一行

- ctrl+k删除行

### 简介

- .java ---编译`javac`---> .class ---运行`java`---> 在JVM上
- 解释性语言（c，c++是编译性语言）
- *是跨平台的* 需要在JVM(java virtual machine)上：JVM在JDK里
- JDK (Java Development Kit) = JRE + java开发工具(java, javac, javadoc, javap)
- JRE (Java Runtime Environment) = JVM + java核心类库

### 安装

1. 配置环境变量

   我的电脑-属性-高级系统设置-环境变量

   变量名JAVA_HOME，指向安装目录

   编辑path环境变量，增加%JAVA_HOME%\bin

   - 用户变量VS系统变量

2. 文本编辑器sublime

### Hello world 初步

1. 编码方式 	**为了在win的dos界面运行，需要改为GBK，否则，就是UTF-8**

   控制台-右键-属性-查看编码方式，控制台的编码方式是GBK（注释），所以在sublime里面要改成GBK

   ```java
   //快速入门
   //表示hello是一个类，是一个public公用的类
   public class hello {
   	//编写一个主main方法
   	public static void main(String[] args){
   		System.out.println("Hello World!");
   	}
   }
   ```

2. 在文件管理器的地址栏输入`cmd`即可进入控制台

3. `javac hello.java`编译生成class文件

4. `java hello`*注意：不用写成hello.class*

   ![image-20221212203509199](C:\Users\王沛然\AppData\Roaming\Typora\typora-user-images\image-20221212203509199.png)

5. .java源文件 .class字节码文件

6. 编译:

​		通过编译器将java文件编译成JVM可识别的字节码文件

### 小节

1. 源文件以.java为扩展名，基本组成成分是**类（class）**
2. 执行入口是main()，有固定格式 `public static void main(String[] args) {}`
3. 严格*区分大小写*
4. 一个源文件中最多只能一个public类，其他类不限。**编译后，每一个类都对应一个.class**
5. 若源文件包括一个public类，文件名要求以该类名命名。
6. 可以将main方法写在非public类中，运行指定的类，程序入口就是main

------

### 转义字符

```java
//转义字符
public class Changechar {

	public static void main(String[] args) {
		//\n
		//制表位，实现自动对齐
		System.out.println("北京\t上海\t杭州");
		//\\输出一个\
		System.out.println("C:\\windows\\");
		//\"
		System.out.println("输出\"");
		//\'
		//\r 回车 将光标置于最前第一个字符，在用后面的代替
		System.out.println("你好世界\r回车");
	}	
}
```

### 常见错误

业务错误BUG，环境错误

### 注释 快捷键ctrl+/

```java
//注释 单行注释
/*
	public static void main(String[] args) {
		//\n
		//制表位，实现自动对齐
		System.out.println("北京\t上海\t杭州");
		//\\输出一个\
		System.out.println("C:\\windows\\");
		//\"
		System.out.println("输出\"");
		//\'
		//\r 回车 将光标置于最前第一个字符，在用后面的代替
		System.out.println("你好世界\r回车");
*/
//多行注释
//多行注释里面不能嵌套多行注释
```

- 文档注释

  注释内容可以被JDK中的javadoc所解析，生成网页文件体现说明文档

  ```java
  /**
   *	@author
   *	@version
   */
  ```

  用`javadoc -d 文件路径 -xx -yy Demon.java`

### 代码规范（初级）

1. 类、方法的注释，要用javadoc来写
2. 单行注释，多行注释，是给代码的维护者
3. `table`缩进，`shift+table`向左缩进
4. 运算符，等号两边加空格
5. 源文件用**UTF-8**编码
6. 行宽不超过80个字符
7. 代码编写有**行尾风格**和**次行风格**

```java
//行尾风格
if (i > 0) {
    
}
//次行风格
if (i > 0)
{
    
}
```

### Dos简介（win10）

- `md d:\\temp`创建目录

- `rd d:\\temp`删除目录

- `dir`查看当前目录的内容

- `cd`change directory 切换盘符 `cd /D c:`

  - 切换到上一级`cd ..`
  - 直接到根目录`cd \`

- **相对**路径和**绝对**路径

  文件夹-目录

  `..\`上一级

- 查看文件树`tree`
- `cls`
- `exit`
- `copy del echo type move`

---

---



## 变量

### 变量类型

```java
int a;	//4个字节
double b;	//8个字节 
char c = 'k';
String d = "king";
```

### +的使用

+ 两边有一方是==字符串String==，则做拼接运算。若是==字符char==，则用Unicode编码计算。

  `System.out.println(100 + 3 +"hello"); //输出103hello`
  
  `System.out.println('a' + 100);//输出197`

### 数据类型

1. 基本数据类型

   1. 数值型

      + 整数 `byte[1] short[2] int[4] long[8]`

        + **注意：**整型常量（具体的值）默认为int，声明long常量时，后面需要加l或L；==但对于byte和short来说，先判断范围是否在-128~127，-32768 ~ 32767==

          ```java
          int num1 = 1;
          int num2 = 1L;//wrong
          long num3 = 1L;
          ```

      + 浮点`float[4] double[8]`

        + 浮点数存放形式，浮点数=符号位+指数位+尾数位

        + **注意：**浮点型常量默认为double，声明float变量时，后面需要加f或F

          ```java
          float num1 = 1.1; 	//wrong
          float num2 = 1.1f;	//right
          double num3 = 1.1;	//right
          double num4 = 1.1f;	//right
          ```

        + 表示形式

          ​	十进制 0.15=.15

          ​	科学计数法 5.12e-2

        + 通常用double

        + ==浮点数计算的**陷阱**==

          ```java
          //不要对运算后的小数进行比较
          double num1 = 2.7;
          double num2 = 8.1 / 3; //接近2.7的一个小数
          //正确的比较
          if(Math.abs(num1 - num2) < 0.0001){
              
          }
          ```

          ***正确比较运算后的小数：判断两个数的差值的绝对值，在某个范围内***

        | 类型  | 存储空间（字节） |                  |
        | :---: | :--------------: | :--------------: |
        | byte  |        1         |    -128 ~ 127    |
        | short |        2         |  -32768 ~ 32767  |
        |  int  |        4         | -2^31^ ~ 2^31^-1 |
        | long  |        8         | -2^63^ ~ 2^63^-1 |

   2. 字符型

      + `char[2]`

         ```java
         char c1 = 'a';
         char c2 = '\t';
         char c3 = '一';
         char c4 = 97;//字符类型存放数字，输出a
         
         System.out.println((int)c1);//输出97
         ```

      + 用单引号`''`引用

      + 默认输出时，是Unicode码对应的字符

      + ASCII一个字节，128个字符，但一个字节可以有256个字符


   3. 布尔型

      + `boolean[1]`,true false

      + 只能用TRUE和FALSE，不同于c语言

        

2. 引用数据类型
   1. 类class `String`
   2. 接口interface
   3. 数组[ ]
   
   

3. 数据类型**自动**转换

   + ==低精度**自动**转换为高精度的== **记忆**

     char---->int----->long----->float------>double

     byte----->short----->int------long----->float----->double

     如：`int a = 'c';//right！`

   + 多种类型混合运算时，系统直接将所有数据转成高精度的类型计算

     ```java
     int n1 = 10;
     //float num1 = n1 + 1.1;//错误，1.1是double
     float num1 = n1 + 1.1F;//正确
     ```

   + 高精度**不能**赋给低精度

   + byte，short，char不相互转换

   + ==byte，short，char可以参与计算（单独或混合），一旦计算，**精度都提升到int**==

   + Boolean不参与运算

     

4. **强制**类型转换

   `(int) (char) `

   + char可以保存int常量值，但不能保存int变量值

     ``` java
     char c1 = 100;
     int num1 = 99;
     char c2 = num1;//错误！！！
     char c3 = (char)num1;
     ```

     

5. 基本数据类型->String

   语法：`数据类型变量+""`

   ```java
   int n1 = 100;
   float n2 = 1.1f;
   double n3 = 23.5;
   boolean b1 = false;
   String str1 = n1 + "";
   String str2 = n2 + "";
   String str3 = n3 + "";
   String str4 = b1 + "";
   ```



6. String->转换为基本数据类型

   ```java
   String s1 = "123";
   //OOP面向对象，对应的包装类的相应方法
   int num1 = Integer.parseInt(s1);
   double num2 = Double.parseDouble(s1);
   //...
   //String->char
   System.out.println(s1.charAt(0));//得到s1的第1个字符
   ```

   

### Java API

1. API Appliction Programming Interface: Java提供的类和方法

   [中文文档](https://www.matools.com/)

<img src="C:\Users\王沛然\Desktop\JAVA\索引结构.png" alt="索引结构" style="zoom:80%;" />

### 编码方式

ASCII一个字节，128个字符，但一个字节可以有256个字符

Unicode：（固定大小编码）两个字节代表字符

UTF-8：（可变大小）字母用一个字节，汉字用三个字节

GBK：字母用一个字节，汉字用2个字节

BIG-5：繁体
