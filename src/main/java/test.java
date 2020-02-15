import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import sun.rmi.runtime.Log;

public class test {
    public static void main(String[] arg) {
////        Scanner inp = new Scanner(System.in);
////        int x = inp.nextInt();
////        int y = inp.nextInt();
//        int x = Integer.parseInt(arg[0]);
//        int y = Integer.parseInt(arg[1]);
//
//        int min = Integer.min(x,y);
//        boolean flag = true;
//
//        for(int i = 2; i < min;i++ )
//        {
//            if(x % i == 0 && y % i == 0)
//            {
//                flag = false;
//            }
//        }
//
//        System.out.println(flag);
//        //inp.close();

        for(int i = 1; i < 11; i++)
        {
            for(int j = 1; j < 11;j++)
            {
                int res = i * j;
                if(res < 10)
                {
                    System.out.print(i * j + "  ");
                }
                else {
                    System.out.print(i * j + " ");
                }
            }
            System.out.println();
        }

    }
}
