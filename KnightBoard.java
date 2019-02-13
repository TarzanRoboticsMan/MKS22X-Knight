public class KnightBoard{
  int[][] board;

  public KnightBoard(int startingRows,int startingCols){
    if(startingRows<0 || startingCols<0) throw new IllegalArgumentException();
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
/*see format for toString below
blank boards display 0's as underscores
you get a blank board if you never called solve or
when there is no solution

@throws IllegalStateException when the board contains non-zero values.
@throws IllegalArgumentException when either parameter is negative
 or out of bounds.
  */
}
