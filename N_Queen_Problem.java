public class N_Queen_Problem {
    public static boolean placeQueens(int[][] board,int row) {

        if(row == board.length){
            printBoard(board);
            return true;
        }

        for(int currentCellIndex =0;currentCellIndex<board.length;currentCellIndex++){
            if(isSafeToPlaceQueen(board,row,currentCellIndex)){

            board[row][currentCellIndex] = 1;

            boolean canPlaceQueen = placeQueens(board,row+1);
            if(canPlaceQueen)
                return true;
            
            board[row][currentCellIndex] =0;
            }
        }

        return false;
    } 

    private static void printBoard(int[][] board){
        for(int row=0;row<board.length;row++){
            for(int col=0;col<board[0].length;col++){
                System.out.print(board[row][col] + "  ");
            }
            System.out.println();

        }
    }


    
    private static boolean isSafeToPlaceQueen(int[][] board,int currentRow,int currentCellIndex){
        for(int row =0;row<currentRow;row++){
            if(board[row][currentCellIndex] == 1){
                return false;     
    }
}

int x= currentRow;
int y=currentCellIndex;

while(x>=0 && y>=0){
    if(board[x][y] == 1){
return false;
}
x--;
y--;
}

x=currentRow;
y=currentCellIndex;



while(x>=0 && y<board.length && y<board.length){
    if(board[x][y] == 1){
    return false;
}
x--;
y++;
}
return true;
}

public static void main(String[] args) {
    int n=4;
    int[][] board = new int[4][4];

    placeQueens(board, 0);

}

    }
