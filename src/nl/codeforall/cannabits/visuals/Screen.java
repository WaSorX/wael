package nl.codeforall.cannabits.visuals;

// field in visual logic


import nl.codeforall.cannabits.gamelogic.object.Player;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import nl.codeforall.cannabits.gamelogic.Grid;
import org.academiadecodigo.simplegraphics.pictures.Picture;


public class Screen {

    public final static int PADDING = 10;
    private final static int CELLENGTH = 32;
    private final static String fieldPic = "grass.png";

    private int width;
    private int length;
    private Grid grid;
    private Picture field;

    public Screen(Grid grid){
        width = (grid.getCols()*CELLENGTH)+PADDING;
        length = (grid.getRows()*CELLENGTH)+PADDING;
        field = new Picture(width, length);
        field.translate(PADDING,PADDING);
        field.load(fieldPic);
    }


    public void show() {
        field.draw();
    }

    public void hide() {
        field.delete();
    }

    public int getCellsize(){
        return CELLENGTH;
    }

    public int rowToY(int row) {
        return PADDING + (CELLENGTH * row);
    }

    public int columnToX(int col) {
        return PADDING + (CELLENGTH * col);
    }

    //public showText(){};
    //TODO create a screen for text output.
}
