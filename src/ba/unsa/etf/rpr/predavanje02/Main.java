package ba.unsa.etf.rpr.predavanje02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int n;
	Scanner ulaz= new Scanner(System.in);
	n= ulaz.nextInt();
	for(int i=1; i<n; i++) {
	    if(i%sumaCifara(i)==0)
            System.out.println(i);
    }
    }

    private static int sumaCifara(int i) {
        int suma=0;
        while(i>0) {
            suma=suma+i%10;
            i=i/10;
        }
        return suma;
    }
}
