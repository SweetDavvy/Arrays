public class ArrayDemo {
    public static void main(String args[]) {
        int sample[] = new int[10];
        int i;
// Имитация выхода индекса за пределы массива
        for (i = 0; i < 10; i = i + 1)
            sample[i] = i;
    }

}
