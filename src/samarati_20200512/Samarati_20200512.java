/*
1 = Käfig offen
0 = Käfig schließen
*/
package samarati_20200512;

import java.util.Scanner;

public class Samarati_20200512 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        int[] birds = new int[125]; 
        int n, k, count, switcher;
        while(true){
            for(int i = 0; i<125; i++){birds[i] = 1;}
            k = 0;
            System.out.println("Geben Sie eine ganze Zahl zwischen 25 und 125 ein! ");
            s = sc.next();
            n = Integer.parseInt(s);
            if(n>=25 && n<=125){
                count = 0;
                while(true){
                    count++;
                    switcher = count%2;
                    while(true){
                        k = k+count;
                        if(k-1>=n){k = 0; break;}
                        birds[k-1] = switcher;
                    }
                    if(count==n){break;}
                }
                System.out.print("Bei der ersten Methode werden ");
                for(int i = 0;i<n;i++){if(birds[i]==1){System.out.print(i+1+", ");}}
                System.out.println("freigelassen! ");
                for(int i = 0; i<125; i++){birds[i] = 1;}
                count = 1;
                while(true){ 
                    count++;
                    while(true){
                        k = k+count;
                        if(k-1>=n){k = 0; break;}
                        if(birds[k-1]==1){birds[k-1]=0;}else{birds[k-1]=1;}
                    }
                    if(count==n){break;}
                }
                System.out.print("Bei der zweiten Methode werden ");
                for(int i = 0;i<n;i++){if(birds[i]==1){System.out.print(i+1+", ");}}
                System.out.println("freigelassen! ");
                }else{
                System.out.println("Aufwidersehen! ");
                break;
            }
        }

    }
    
}