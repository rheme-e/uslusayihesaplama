package Giris;

import java.util.Scanner;

public class uslusayihesaplama {
    public static void main(String[] args) {
        int n,r,a,sonuc=1;
        Scanner inp=new Scanner(System.in);
        System.out.print("r^n olacak şekilde (n) değeri giriniz:");
        n=inp.nextInt();
        System.out.print("r^n olacak şekilde (r) değeri giriniz:");
        r=inp.nextInt();
        for(a=1; a<=n ; a++){
            sonuc*=r;
        }
        System.out.println("r^n="+sonuc);



    }
}
