/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg0306191467;
import java.util.Scanner;
/**
 *
 * @author ThomDoan
 */
public class KT02_0306191467 {
    public static void main(String[] agrs){
        int n;
        Scanner input = new Scanner(System.in);
    
        // bai 1
        System.out.println("Bai 1: ");
        int [][] A;
        System.out.print("Nhap N: ");
        n = input.nextInt();
        A = new int[n][n];
        A = TaoMang(n,1,50);
        XuatMang(n,A);
        System.out.println("Tong So hoan thien la: " + TongSoHoanThien(n,A));
        for (int i = 0 ;i < 10 ; i++)
        {
            System.out.print("- ");
        }
        System.out.println();
        
        // Bai 2
        System.out.println("Bai 2:");
        int [][] B;
        do 
        {
            System.out.print("Nhap N: ");
            n = input.nextInt();
            if (n < 6 || n > 18)
                System.out.println("nhap n sai! Vui long nhap lai!");
        }while (n < 6 || n > 18 );
        B = new int[n][n];
        B = TaoMang(n,15,45);
        XuatMang(n,B);
        int HoanThien = TongSoHoanThien(n,B);
        System.out.println("Tong So hoan thien: "+ HoanThien);
        int dem = 0;
        for(int i = 1;i < HoanThien ; i++)
        {
            if (HoanThien % i == 0) 
                dem++;
        }
        if (dem == HoanThien && dem != 0 )
            System.out.print("Tong la so hoan Thien!");
        else
            System.out.print("Tong Khong phai la so hoan thien");
        
    }
    public static int TaoSoNgauNhien(int min, int max)
    {
        return (int)(Math.random()*(max-min+1)+min);
    }
    public static int[][] TaoMang(int n,int min,int max)
    {
        int [][] a;
        a = new int[n][n];
        for (int i = 0;i < n;i++)
            for(int j = 0; j < n ; j++)
            {
                a[i][j]=TaoSoNgauNhien(min,max);
            }
        return a;
    }
    public static void XuatMang(int n, int [][] a)
    {
        for (int i = 0;i < n; i++)
        {
            for(int j = 0; j < n; j++)
                System.out.print(a[i][j]+"\t");
            System.out.println();
        }
        
    }
    public static int TongSoHoanThien(int n, int [][]a)
    {
        int tong =0;
     
        for (int i = 0;i < n; i++)
        {
            for (int j = 0 ; j< n; j++)
            {
                int setDiem = 0;
                for ( int k = 1 ;k < a[i][j]; k++)
                    if (a[i][j] % k == 0)
                        setDiem += k;
                if(setDiem == a[i][j])
                    tong += a[i][j];
            }
        }
        return tong;
                
    }
}
