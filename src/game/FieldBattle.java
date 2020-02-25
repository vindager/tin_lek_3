package game;

/**
 * Игровое поле.
 */
public class FieldBattle {
    private String[][] field;
    private int sizeField = 10;

   new char[] {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J' };


    public FieldBattle() {
        field = new String[sizeField][sizeField];
        setWawe();
    }

    /**
     * Заполнение поля 'волнами'.
     */
    private void setWawe() {
        field[0][0] = " ";
        for (int x = 0; x < sizeField; ++x) {
            for (int y = 0; y < sizeField; ++y) {
                field[x][y] = "~";
            }
        }
    }

    /**
     * Вывод поля в консоль.
     */
    public void printField() {

        int coordX = 1;
        int coordY = 1;

        System.out.print( ' ' );
        for(int x = 0; x < sizeField; ++x) {

            System.out.print(' ');
            System.out.print(coordX++);
        }
        System.out.println();

        for (int y = 0; y < sizeField; ++y) {
            System.out.print( coordY++ );

            for (int x = 0; x < sizeField; ++x) {
                if( !(x == 0 && coordY == 11) ) {
                    System.out.print( ' ' );
                }
                System.out.print(field[x][y]);
            }
            System.out.println("|");
        }
    }
}
