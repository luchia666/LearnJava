package Data.console;

import Data.Board;
import Data.Cell;

public abstract class ConsoleBoard implements Board {
    private Cell[][] cells;



    public void drawBoard(Cell[][] cells) {
        this.cells = cells;
        this.redraw(false);
    }

    public void drawCell(int x, int y) {
        System.out.println("****SELECT****");
        this.redraw(false);
    }

    public void drawBang() {
        System.out.println("********BANG*************");
        this.redraw(true);
    }

    public void drawCongratulate() {
        System.out.println("********Congratulate*************");
    }
    private void redraw(boolean real){
        for (Cell[] row : cells){
            for (Cell cell: row){
                cell.draw(System.out, real);
            }
            System.out.println();
        }
        System.out.println();
    }
}
