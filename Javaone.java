//第一个语句hello，world
// public class Javaone {
//    public static void main(String[] args) {
//        System.out.println("Hello,world");
//---------------------------------------------
//计数count的实现
//        int count = 0;
//        count = count + 1;
//        count = count + 2 - 1;
//        System.out.println(count);
// -------------------------------------------
//数据类型byte/int/short/float/double/string/long
//        //byte
//        byte b = 10;
//        System.out.println(b);
//        //short
//        short s = 20;
//        System.out.println(s);
//        //int
//        int i = 30;
//        System.out.println(i);
//        //long
//        long n = 999999L;
//        System.out.println(n);
//          float
//          float f = 10.1F;
//          System.out.println(f);
//          //double
//          double d = 20.2;
//          System.out.println(d);
//---------------------------------------------------
//定义一个身份信息介绍
//        String name = "lkx";
//        int age = 18;
//        char gender = '男';
//        double height = 172;
//        boolean flag = true;
//        System.out.println(name);
//        System.out.println(age);
//        System.out.println(gender);
//        System.out.println(height);
//        System.out.println(flag);
//----------------------------------------------------------
//输出手机品牌介绍
//          double price = 5299.0;
//          String shoujiname = "华为";
//          System.out.println(price);
//          System.out.println(shoujiname);
//  }
//}
//-----------------------------------------------------------------------
//导入Scanner类，并放在开头
//import java.util.Scanner;
//public class Javaone{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入第一个数字：");
//        int number1 = sc.nextInt();
//        System.out.println("请输入第二个数字：");
//        int number2 = sc.nextInt();
//        System.out.println(number1+number2);
//    }
//}
//----------------------------------------------------------------
//public class Javaone{
//    public static void main(String[] args) {
//        System.out.println(3 + 2);
//        System.out.println(5 - 1);
//        System.out.println(7 * 9);
//        System.out.println(1.0 + 1.001);
//        System.out.println(10 / 3);
//        System.out.println(10 % 3);
//    }
//}
//------------------------------------------------------------
//public class Javaone{
//    public static void main(String[] args) {
//    //键盘录入一个三位数，获取其中的个、十、百
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个三位数：");
//        int number = sc.nextInt();
//        //个位 数字 % 10
//        //十位 数字 / 10 % 10
//        //百位 数字 /100 % 10
//        int ge = number % 10;
//        int shi = number /10 % 10;
//        int bai = number /100 % 10;
//        System.out.println("百位是："bai);
//        System.out.println("十位是："shi);
//        System.out.println("个位是："ge);
//    }
//
//}
//----------------------------------------------------------------------
//public  class Javaone {
//    public static void main(String[] args) {
//        byte b1 = 15;
//        byte b2 = 20;
          //强制转换
//        byte result = (byte) (b1 + b2);
//        System.out.println(result);
        //-------
//        System.out.println(1 + 'a');
//
//
//    }
//}
//--------------------------------------------------------
public class Javaone{
    public static void main(String[] args) {

        System.out.println();

      }
}