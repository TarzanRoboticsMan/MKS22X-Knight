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
    return solveH(startRow,startCol, 0);
  }

  private boolean solveH(int row ,int col, int level){
    
  }
}
