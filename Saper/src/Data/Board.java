package Data;

import javafx.scene.control.Cell;

public interface Board {
    void drawBoard(Cell[][] cells);

    void drawCell(int x, int y);

    void drawBang();

    void drawCongratulate();


}
