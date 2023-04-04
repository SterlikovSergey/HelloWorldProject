package by.sterlikov.homework.lesson5;

public class ChessBoard {
    public static void main(String[] args) {
        //int [][] chessBoard = new int[8][8];
        String [][] chessBoard= new String[8][8];
        for (int i = 0; i < chessBoard.length;i++){
            for(int j = 0; j < chessBoard[i].length;j++){
                if((i+j)%2==0){
                    //chessBoard[i][j] += 8;
                    chessBoard[i][j] += "W";
                } else {
                    //chessBoard[i][j] += 0;
                    chessBoard[i][j] += "B";
                }
            }
        }
        for (int i = 0; i < chessBoard.length;i++){
            for(int j = 0; j < chessBoard[i].length;j++) {
                System.out.print(chessBoard[i][j]);
            }
            System.out.println();
        }
    }
}
