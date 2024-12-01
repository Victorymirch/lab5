public class n2 {

    private char startSymbol;
    private char endSymbol;

    public n2(char start, char end) {
        this.startSymbol = start;
        this.endSymbol = end;
    }

    public void printSymbolRange() {
        char from = (startSymbol < endSymbol) ? startSymbol : endSymbol;
        char to = (startSymbol > endSymbol) ? startSymbol : endSymbol;

        System.out.println("Символы от '" + from + "' до '" + to + "':");
        for (char c = from; c <= to; c++) {
            System.out.print(c + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        n2 obj = new n2('A', 'D');
        obj.printSymbolRange();

        n2 obj2 = new n2('X', 'T');
        obj2.printSymbolRange();
    }
}
