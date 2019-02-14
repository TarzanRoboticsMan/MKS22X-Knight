import java.util.Arrays;
public class KnightBoard{
  int[][] board;

  //@throws IllegalArgumentException when either parameter is negative.
  public KnightBoard(int startingRows,int startingCols){
    if(startingRows<=0 || startingCols<=0) throw new IllegalArgumentException();
    board = new int[startingRows][startingCols];
  }

  public String toString(){
    String out = "";
    for(int[] row:board){
      for(int x:row){
        if(x<10) out+=" ";
        out+=x+" ";
      }
      out+="\n";
    }
    return out;
  }

  //@throws IllegalStateException when the board contains non-zero values.
  //@throws IllegalArgumentException when either parameter is negative or out of bounds.
  public boolean solve(int startRow, int startCol){
    if(startRow<0 || startCol<0) throw new IllegalArgumentException();
    if(!Arrays.deepEquals(board, new int[board.length][board[0].length])) throw new IllegalStateException();
    countMoves();
    return solveH(startRow,startCol, 0);
  }

  private void countMoves(){
    /*if(board[0].length>4){
      for (int[] row:board) Arrays.fill(row, 3, row.length-2, 8); //excluding 2 edges, fill with 8
    }*/
    //if(r>=2&&r<board.length-2 && c>=2&&c<board[r].length-2) board[r][c] = 8;
    for(int r=0;r<board.length;r++){for(int c=0;c<board[r].length;c++){
      int val=8;
      if 
      else if(r>=2){
        if (c>=1) val+=1;
        if (c>=2) val+=1
      }
    }}
  }

  private boolean solveH(int row ,int col, int level){

  }
}
