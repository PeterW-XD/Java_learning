# Java

## 一.初步

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

3. `javac hello.java`==编译==生成class文件

4. `java hello`==运行==*注意：不用写成hello.class*

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



## 二. 变量

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
          double num5 = 4d;	//right
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
   
   

5. 数据类型**自动**转换

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

     ```java
     int i = 4;
     char ch = 1 + i;//int->char
     ```

     

   + Boolean不参与运算

     

6. **强制**类型转换

   `(int) (char) `

   + char可以保存int常量值，但不能保存int变量值

     ``` java
     char c1 = 100;
     int num1 = 99;
     char c2 = num1;//错误！！！
     char c3 = (char)num1;
     ```

     

5. *基本数据类型->String  

   语法：`数据类型变量+""`

   ```java
   int n1 = 100;
   float n2 = 1.1f;
   double n3 = 23.5;
   boolean b1 = false;
   char c1 = '嗨';
   String str1 = n1 + "";
   String str2 = n2 + "";
   String str3 = n3 + "";
   String str4 = b1 + "";
   String str5 = c1 + "";
   ```



6. *String->转换为基本数据类型 **特殊：不能用上面的强转！！！要用相应的包装类**

   要确保可以转换，否则程序异常，中止
   
   ```java
   String s1 = "123";
   //OOP面向对象，对应的包装类的相应方法
   int num1 = Integer.parseInt(s1);
   double num2 = Double.parseDouble(s1);
   //...
   //String->char
   System.out.println(s1.charAt(0));//得到s1的第1个字符
   ```
   
   
   
   ##### 数据类型作业homework_char, homework_char01
   
   

### Java API

1. API Appliction Programming Interface: Java提供的类和方法

   [中文文档](https://www.matools.com/)

<img src=".\索引结构.png" alt="索引结构" style="zoom:80%;" />

### 编码方式

ASCII一个字节，128个字符，但一个字节可以有256个字符

Unicode：（固定大小编码）两个字节代表字符

UTF-8：（可变大小）字母用一个字节，汉字用三个字节

GBK：字母用一个字节，汉字用2个字节

BIG-5：繁体

----

----



## 三. 运算符

### / 除法

```java 
System.out.println(10 / 4);//2 int/int=int
System.out.println(10.0 / 4);//2.5 double/int=double
double d = 10 / 4;//2.0
```

### %模

`a % b = a - a / b * b`

### ++自增

+ 独立语句时`i++`等于`++i`

+ `i++`先赋值再增加
+ **有趣的现象**   ++运算符的优先级高于=

``` java
int i = 1;
i = i++; //1)temp=i; 2) i=i+1; 3)i=temp
//i? 1

int i = 1;
i = ++i; //1)i=i+1; 2) temp=i; 3)i=temp
//i? 2
```

### 关系运算符

`instanceof`

返回布尔类型`true false`

### 逻辑运算符

1. a&b逻辑与

2. a&&b短路与

   ```java
   int a = 4;
   int b = 10;
   if(a < 1 && ++b < 50) {
       System.out.println("ok300");
   }
   System.out.println("a=" + a + "b=" + b);
   //b = 10
   //短路与：第一个条件为FALSE时，第二个条件不再判断，效率高
   //逻辑与：第一个条件为FALSE时，第二个条件仍然判断
   //===========================================
   int a = 4;
   int b = 10;
   if(a < 1 & ++b < 50) {
       System.out.println("ok300");
   }
   System.out.println("a=" + a + "b=" + b);
   //b = 11
   //短路与：第一个条件为FALSE时，第二个条件不再判断
   //逻辑与：第一个条件为FALSE时，第二个条件仍然判断
   
   ```

   

3. a|b

4. a||b短路或

   ```java
   int a = 4;
   int b = 10;
   if(a < 5 || ++b < 50) {
       System.out.println("ok300");
   }
   System.out.println("a=" + a + "b=" + b);
   //b = 10
   //短路或：第一个条件为TRUE时，第二个条件不再判断，效率高
   //逻辑或：第一个条件为TRUE，第二个条件仍然判断
   ```

   

5. !a

6. a^b异或



```java
//practice
boolean x = true;
boolean y = false;
short z = 46;
if((z++ == 46) && (y = true)) z++; //T 47 48
if((x = false) || (++z = 49)) z++; //49 T 50
System.out.println("z=" + z);

```

### 赋值运算符

+ 基本 `=`
+ 复合`a += b` <=>`a = a + b `         `a -= b`<=>`a = a - b`

+  运算顺序 从 右往左

+ 复合赋值运算会**自动**进行类型转换

  ```java 
  byte b = 3;
  b += 2; //等价 b = (byte)(b + 2);
  b++; // b = (byte)(b + 1);
  //若写成
  b = b + 2;//报错int ->byte
  ```

  

### 三元运算符

+ `条件表达式?表达式1:表达式2;`表达式为TRUE，结果表达式为1，**表达式2不会执行*
+ 可以改写成if else语句

### 运算优先级



### 标识符规则与规范

+ 规则
  + 英文字母，0-9，_ $
  + 数字不开头
  + 不使用关键字和保留字
  + 区分大小写
  + 不能空格
+ ==规范==
  + 包名：aaa.bbb.ccc所有字母小写
  + 类名、接口名：XxxYyyZzz[大驼峰]，第一个单词大写
  + 变量名、方法名：xxxYyyZzz[小驼峰]
  + 常量名XXX_YYY_ZZZ

### 输入(扫描器)

```java
import java.util.Scanner; //表示把java.util下的Scanner类导入
public class Input {

	public static void main(String[] args) {

		//Scanner类，表示简单文本扫描器，在java.until包
		//1. import Scanner类所在的包
		//2.创建Scanner对象，new创建一个对象
		// myScanner是Scanner类的对象
		Scanner myScanner = new Scanner(System.in);//从键盘输入
		System.out.println("请输入名字");
		String name = myScanner.next();
		System.out.println("请输入年龄");
		int age = myScanner.nextInt();
		System.out.println("请输如薪水");
		double salary = myScanner.nextDouble();
		System.out.println(name + age + salary);
	}
}
```

### 进制转换

+ 2 8 16进制转换为十进制

  加权求和

+ 十进制转2 8 16

  短除法，得余数，倒着写出

+ 2 -> 8 16  

  取三位、四位

+ 8 16 -> 2



+ `>>`算数右移，用符号位补溢出高位 === *相当于/2*

+ `<<`符号位不变，用0补低位 === *相当于`*`2*

+ `>>>`无符号右移 低位溢出，高位补0

+ 没有`<<<`

  

+ `~`按位取反，`& | ^`

> 源码反码补码
>
> + 最高位：0正1负
> + 正数三码合一
> + 负数反码=符号位不变，其他位反转
> + 负数补码=反码+1 ; *反推*反码=补码-1，负数符号位不变，其他位反转
> + java*没有*无符号数，都是有符号的
> + 所有运算时，用**补码**
> + 当看到结果的时候，要看原码

```java
//1.先得到补码 2的原码 => 000000000 00000000 00000000 00000010
//2.2的补码 => 000000000 00000000 00000000 00000010
System.out.println(2 & 3);

//-2的原码 => 100000000 00000000 00000000 00000010
System.out.println(~-2);
```





## 四. 控制结构

### 三大控制

+ 顺序控制

+ 分支控制 if-else（只进入一个入口，其他的不执行），switch

  >  输入问题：若输入的不是要求的int类型，超过范围？输入了char？输入了double？，在异常处理中可以搞定！

    ``` java 
    if() {
        xxx;
    } else {
        xxx;
    }
    //java中，只要有值返回，就是一个表达式
    switch(表达式) {
        case 常量1: {
            xxx;
            break;
        }
        case 常量2: {
            xxx;
            break;
        }
            ...
        default: {
            break;//有没有都会退出
        }
    }
    ```

    > swtich语句细节
    >
    > 1. 表达式的数据类型要与case后的常量的一致，或者是可以自动转换（char->int）
    > 2. switch返回值必须是（byte, short, int, char, enum[枚举], String）（不能用double）
    > 3. case字句中必须是常量或者是常量表达式'b' + 1，不是变量
    > 4. break;用来跳出，否则顺序执行到switch结尾
    > 5. 顺序执行，所以case里面不用{}

    ​		提示：具体数值不多，符合byte, short, int, char, enum[枚举], String，建议用switch；范围控制用if-else

+ 循环控制

    **for循环**
    
    ```java 
    for(1循环变量初始化(执行一次); 2循环条件; 4循环变量迭代) {
        3循环语句;
    }//循环条件为false的时候才跳出循环 1->2->3->4->2->3->4->2->3->4...
    ```
    
    > for循环细节
    >
    > 1. 循环条件是返回布尔值的表达式
    >
    > 2. 循环初始化，和循环迭代可以拿出来，分号不省略 **注意i的作用范围**
    >
    >    ```java
    >    for(int i = 1 ; i <= 10 ; i++)//此时i只在循环体内起作用,局部变量
    >    
    >    int i = 1;
    >    for( ; i <= 10 ; ) {
    >        i++;
    >    }
    >    
    >    for(;;){
    >    
    >    }//死循环 dos ctrl+c退出
    >    ```
    >
    > 3. 循环初始值可以有多条初始化语句，但要求类型一样，用`,`隔开; 循环变量迭代也可以有多条，用`,`隔开
    >
    >    ```java 
    >    for(int i = 0, j = 0; i < 3; i++, j+=2 ) {
    >    
    >    }
    >    ```

​		编程思想：化繁为简（先输出简单的，逐步输出），先死后活（先写常量的，再写变量的）

**while循环**

```java
1循环条件初始化;
while(2循环条件) {
3循环体;
循环变量迭代;
}
```

> 循环条件返回布尔值，先判断再执行

**do while循环**

```java 
循环条件初始化;
do {
    循环体;
    迭代;
} while(循环条件);
```

> 1. 先执行再判断，执行至少一次
> 2. 末尾 ;

### 多重循环

+ 打印金字塔**化繁为简，先死后活**   e.g. pyramid.java rhombus.java

### break需求

随机生成1-100

```java
(int)(MAth.random()*100) + 1
```

> break细节
>
> 1. 多层嵌套时，可以通过标签指明要终止的是哪一块语句块
>
>    ```java
>    label1: 
>    for(int i = 1; i <= 10; i++) {
>        label2:
>        	for(int j = 1; j < 10; i++) {
>                if() {
>    			break label1;	//break外面的for循环
>                }
>            }
>    }
>    ```
>
>    不写的时候，跳出最内层的循环

运用场景：登录场景

> 字符串比较
>
> ```java
> String name = "jack";
> System.out.println("jack".equals(name));//true[避免空指针]
> System.out.println("tom".equals(name));//false
> ```

### continue

+ 跳过当前循环，继续下一次循环；

+ 也可以使用标签表示跳过的是哪一层循环

### return

+ 跳出所在方法。用在main方法=》退出程序
