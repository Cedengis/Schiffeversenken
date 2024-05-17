import java.util.ArrayList;

public class Board {
    // Parameter
    ArrayList<Field> fields;

    // Constructor
    Board() {
        fields = new ArrayList<>(100);
        for (int i = 0; i < 100; i++) {
            fields.add(new Field('O'));
        }
    }

    // Methods
    public void showBoard() {
        System.out.println("  |A|B|C|D|E|F|G|H|I|J|");
        for (int i = 0; i < fields.size(); i++) {
            if (i % 10 == 0) {
                int rowNumber = (i / 10) + 1;
                System.out.print((rowNumber < 10 ? "0" : "") + rowNumber + "|");
            }
            System.out.print(fields.get(i).getStatus() + "|");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }

    // Getter und Setter
    public ArrayList<Field> getFields() {
        return fields;
    }
    public void setFields(ArrayList<Field> fields) {
        this.fields = fields;
    }
}
