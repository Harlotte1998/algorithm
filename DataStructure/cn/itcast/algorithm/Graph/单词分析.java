package 单词分析;

import java.util.Scanner;

/**
 * @Author: LC
 * @Date: 2021/12/13 15:39


输入一行包含一个单词，单词只由小写英文字母组成。

对于所有的评测用例，输入的单词长度不超过 1000。

输出描述
输出两行，第一行包含一个英文字母，表示单词中出现得最多的字母是哪 个。如果有多个字母出现的次数相等，输出字典序最小的那个。

第二行包含一个整数，表示出现得最多的那个字母在单词中出现的次数。

 */
public class Demo {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        //
        System.out.println("请输入一个字符串");
        String string = s.nextLine();

        //将字符串转换为字符串数组
        char[] chars = string.toCharArray();

//        for (int i = 0; i <chars.length ; i++) {
//            System.out.println(chars[i]);
//        }

        //设置一个数组 用来存储字符串数组元素出现的次数
        int[] a=new int[chars.length];

//        System.out.println(a.length);

        /*
         让字符串数组的第1个元素与其他元素相比较
         让字符串数组的第2个元素与其他元素相比较
         让字符串数组的第3个元素与其他元素相比较
         让字符串数组的第4个元素与其他元素相比较

        让字符串数组的第1个元素与1元素相比较
        让字符串数组的第1个元素与2元素相比较
        让字符串数组的第1个元素与3元素相比较
        让字符串数组的第1个元素与4元素相比较

        */



        for (int i = 0; i <chars.length ; i++) {
            for (int j = 0; j <chars.length ; j++) {
                if (chars[i]==chars[j]){
                    a[i]=a[i]+1;
                }
            }
        }






    }
}
