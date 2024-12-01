public class n3 {

    private int num1;
    private int num2;


    public n3() {
        this.num1 = 0;
        this.num2 = 0;
    }

    public n3(int num1) {
        this.num1 = num1;
        this.num2 = 0;
    }

    public n3(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void printNumbers() {
        System.out.println("num1: " + num1 + ", num2: " + num2);
    }

    // Тестовый пример
    public static void main(String[] args) {
       n3 obj1 = new n3(); // Без аргументов
        n3 obj2 = new n3(10); // С одним аргументом
        n3 obj3 = new n3(20, 30); // С двумя аргументами

        obj1.printNumbers();
        obj2.printNumbers();
        obj3.printNumbers();
    }
}
