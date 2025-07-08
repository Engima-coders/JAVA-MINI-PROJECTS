import java.util.Scanner;

public class tictactoe {
    public static void main(String args[]){
        char[][] b =new char[3][3];
        //i=row and j=coloumn
        for(int i =0;i<3;i++){
            for(int j=0;j<3;j++){
                b[i][j]=' ';
            }
        }
        boolean game=false;
        char player='X';
        System.err.println("WELCOME TO TIC TAC TOE");
        Scanner sc=new Scanner(System.in);
        while(!game){
            printboard(b);
            System.out.println("Player "+ player+" turn:");
            int r=sc.nextInt(),c=sc.nextInt();
            if(b[r][c]==' '){
                b[r][c]=player;
                game=whowon(b,player);
                if(game){
                    System.out.println("Player "+player+" has won.");
                }
                else{
                    //player=(player=='X')?'O':'X'
                    if (player=='X')
                    player='O';
                    else
                    player='X';
                }
            }else{
                System.out.println("Invalid move.Try again");
            }
        }printboard(b);
        sc.close();
    }
    public static void printboard(char[][] b){
        for(int i =0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(b[i][j]+" | ");
            }System.out.println(" ");
        }
    }
    public static boolean whowon(char[][] b,char player){
        //to check row by row
        for(int i=0;i<3;i++){
                if (b[i][0]==player&&b[i][1]==player&&b[i][2]==player)
                return true;
        }
        // to check column by column
        for (int j=0;j<3;j++){
            if (b[0][j]==player&&b[1][j]==player&&b[2][j]==player)
                return true;
        }
        // to check diagonally
        if(b[0][0]==player&&b[1][1]==player&&b[2][2]==player){
            return true;
        }
        else if(b[0][2]==player&&b[1][1]==player&&b[2][0]==player){
            return true;
        }
        else{
            return false;
        }
    }
}
