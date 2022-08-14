import java.util.Random;

public class MagicBox<T> {
    protected int size; //размер
    protected T[] items;

    public MagicBox(int size) {
        this.size = size;
        items = (T[]) new Object[size];
    }

    int occupied = 0; // занято

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                occupied += 1;
                return true;
            }
        }
        return false;
    }

    public T pick() {
        for (int i = 0; i < items.length; i++) {
            if (occupied < items.length) {
                throw new RuntimeException("Cвободных ячеек: " + (items.length - occupied));
            }
            if (occupied == items.length) {
                Random random = new Random();
                int randomInt = random.nextInt(items.length);
                System.out.println("Коробка полна.");
                System.out.println("Случайный элемент: " + items[randomInt]);
                System.out.println("~~~~~~~~~~~~~~~~~");
                return items[randomInt];
            }
        }
        return null;
    }
}

