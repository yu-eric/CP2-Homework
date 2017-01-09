package Chapter7;

import java.util.Scanner;

public class MagicSquare{

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int temp[] = new int[525];
        int i;
        int j=0;

        do{
            System.out.println("Please enter 16 numbers from left to right, top to bottom (Enter -1 to stop reading)");
            i=input.nextInt();
            temp[j]=i;
            j++;
        }while(i!=-1);
        j--;

        int n=(int)Math.sqrt(j);
        if(Math.sqrt(j)!=n){
            System.out.println("Not enough numbers entered.");
            return;
        }

        System.out.println("User enters n^2 numbers.");
        int k=0;
        int mat[][]=new int[n][n];
        for( i = 0; i < n; i++ ) {
            for( j = 0; j < n; j++ ) {
                mat[i][j]=temp[k];
                k++;
            }
        }

        for( i = 0; i < n; i++ ) {
            for( j= 0; j < n; j++)
                System.out.print(mat[i][j]+" ");
            System.out.println();
        }

        int check;
        boolean flag=false;
        test: for( i = 0; i < n; i++ ) {
            for( j= 0; j < n; j++) {
                check=mat[i][j];
                for( k = 0; k < n; k++ ) {
                    for(int l = 0; l < n; l++ ) {
                        if(check==mat[k][l] && (i!=k || j!=l)) {
                            flag=true;
                            break test;
                        }
                    }
                }
            }
        }
        if(flag==true)
            System.out.println("Magic square has duplicate numbers.");
        else
            System.out.println("Magic square does not has duplicate numbers.");

        magicSquare(mat,n);
    }

    static void magicSquare(int arr[][],int num){
        int sumRow[]=new int[num];
        int sumCol[]=new int[num];
        int sumDig[]=new int[2];
        boolean flag=false;

        for ( int i = 0; i < num; i++ ) {
            for( int j = 0; j < num; j++ ) {
                sumRow[i]=sumRow[i]+arr[i][j];
                sumCol[i]=sumCol[i]+arr[i][j];
            }
        }

        for( int i = 0; i < num; i++ ) {
            sumDig[0]=sumDig[0]+arr[i][i];
            sumDig[1]=sumDig[1]+arr[i][num-i-1];
        }

        int sum=sumDig[0];
        for( int i = 0; i < num; i++) {
            if((sum==sumRow[i] && sum ==sumCol[i])&&(sum==sumDig[1])) {
                flag=true;
            }
            else{
                flag= false;
            }
        }

        if(flag)
            System.out.println("The numbers form a Magic square!");
        else
            System.out.println(" It's not a magic square!");
    }
}
