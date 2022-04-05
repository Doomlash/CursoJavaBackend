package Dia02.Pair_Programming;

public class BoardMediumImpl implements BoardInterface {
    private int board[][];

    public BoardMediumImpl(){
        board = new int[5][5];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = 0;
            }
        }
    }

    @Override
    public int getSize() {
        // TODO Auto-generated method stub
        return 5;
    }

    @Override
    public int getTile(int x, int y) {
        if(x<5 && x>=0 && y<5 && y>=0){
            return board[x][y];
        }
        else return -1;
    }

    @Override
    public boolean allClear() {
        boolean clear = true;
        for (int i = 0; i < 5 && clear; i++) {
            for (int j = 0; j < 5 && clear; j++) {
                if (board[i][j]==1){
                    clear = false;
                }
            }
        }
        return clear;
    }

    @Override
    public boolean insertShip(int x, int y, int direccion) {
        board[x][y]=1;
        board[x][y-1]=1;
        board[x][y-2]=1;
        return true;
    }

    @Override
    public boolean shoot(int x, int y) {
        if(board[x][y]==1){
            board[x][y]=2;
            return true;
        } else {
            return false;
        }
    }
}
