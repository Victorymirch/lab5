public class n6 {
    private int max;
    private int min;

    // Конструктор с двумя параметрами
    public n6(int a, int b) {
        setValues(a, b);
    }

    // Конструктор с одним параметром (оба поля получают одинаковое значение)
    public n6(int value) {
        setValues(value, value);
    }

    // Метод для установки значений (с одним параметром)
    public void setValues(int value) {
        setValues(value, value);
    }

    // Метод для установки значений (с двумя параметрами)
    public void setValues(int a, int b) {
        if (a > b) {
            this.max = a;
            this.min = b;
        } else {
            this.max = b;
            this.min = a;
        }
    }

    // Метод для отображения значений полей
    public void displayValues() {
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }

    // Тестирование класса
    public static void main(String[] args) {
        // Создание объекта с двумя значениями
        n6 obj1 = new n6(10, 20);
        obj1.displayValues();

        // Создание объекта с одним значением
        n6 obj2 = new n6(15);
        obj2.displayValues();

        // Установка новых значений
        obj1.setValues(30, 5);
        obj1.displayValues();

        // Установка одного значения
        obj2.setValues(50);
        obj2.displayValues();
    }
}