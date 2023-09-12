import java.util.Scanner;
class Main{
    public static void main(String[] args) {

    Scanner in=new Scanner(System.in);


       int [][] matrix=new int[3][3];

       for(int row=0; row<matrix.length; row++){

           for(int column=0; column<matrix[row].length;column++){

               matrix[row][column]=in.nextInt();
           }
       }

        for(int row=0; row<matrix.length; row++){

            for(int column=0; column<matrix[row].length;column++){

                System.out.print(matrix[row][column]);
            }
            System.out.println();
        }

}

}
