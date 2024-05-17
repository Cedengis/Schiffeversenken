public class Main {
    public static void main(String[] args) {
        Player p1 = new Player(new Board());

        UnserInput input = new UnserInput();
        char i1 = input.getCharInput("Testinput 1: ");
        System.out.println(i1);
        int i2 = input.getInstInput("Testinput 2: ");
        System.out.println(i2);

        p1.getBoard().getFields().get(0).setStatus('X');
        p1.getBoard().showBoard();
    }
}
