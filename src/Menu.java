public class Menu {
    // Parameter
    int shipTwo;
    int shipThree;
    int shipFour;
    int shipFive;
    int shipSix;

    // Constructor
    Menu(int shipTwo,int shipThree, int shipFour, int shipFive, int shipSix){
        this.shipTwo = shipTwo;
        this.shipThree = shipThree;
        this.shipFour = shipFour;
        this.shipFive = shipFive;
        this.shipSix = shipSix;
    }

    // Methods
    public void showMenu(){
        UserInput input = new UserInput();
        System.out.println("""
                (1) Game Start
                (2) Settings
                (3) Exit""");
        switch (input.getInstInput("Please enter: ")){
            case 1 : startGame();break;
            case 2 : settings();break;
            case 3 : exit();
        }
    }

    public void startGame(){
        if (gamePossible()){

        }else {
            System.out.println("Current settings are not possible!\nPlease change the settings to less ships.");
            showMenu();
        }
    }

    public void settings(){
        UserInput input = new UserInput();
        System.out.println("(0) Exit");
        System.out.println("(1) 2 long Ship: " + shipTwo);
        System.out.println("(2) 3 long Ship: " + shipThree);
        System.out.println("(3) 4 long Ship: " + shipFour);
        System.out.println("(4) 5 long Ship: " + shipFive);
        System.out.println("(5) 6 long Ship: " + shipSix);
        switch (input.getInstInput("Please enter what you would like to change: ")){
            case 0 : showMenu();break;
            case 1 : setShipTwo(input.getInstInput("Please enter how many Ships you want: "));break;
            case 2 : setShipThree(input.getInstInput("Please enter how many Ships you want: "));break;
            case 3 : setShipFour(input.getInstInput("Please enter how many Ships you want: "));break;
            case 4 : setShipFive(input.getInstInput("Please enter how many Ships you want: "));break;
            case 5 : setShipSix(input.getInstInput("Please enter how many Ships you want: "));break;
        }
        settings();
    }

    public void exit(){
        System.exit(0);
    }

    private boolean gamePossible(){
        return shipTwo * 2 + shipThree * 3 + shipFour * 4 + shipFive * 5 + shipSix * 6 <= 50 && shipTwo * 2 + shipThree * 3 + shipFour * 4 + shipFive * 5 + shipSix * 6 >0;
    }

    // Getter & Setter

    public int getShipTwo() {
        return shipTwo;
    }
    public void setShipTwo(int shipTwo) {
        this.shipTwo = shipTwo;
    }
    public int getShipThree() {
        return shipThree;
    }
    public void setShipThree(int shipThree) {
        this.shipThree = shipThree;
    }
    public int getShipFour() {
        return shipFour;
    }
    public void setShipFour(int shipFour) {
        this.shipFour = shipFour;
    }
    public int getShipFive() {
        return shipFive;
    }
    public void setShipFive(int shipFive) {
        this.shipFive = shipFive;
    }
    public int getShipSix() {
        return shipSix;
    }
    public void setShipSix(int shipSix) {
        this.shipSix = shipSix;
    }
}
