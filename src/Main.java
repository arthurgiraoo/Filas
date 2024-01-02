public class Main {
    public static void main(String[] args) {
        Fila<String> fila = new Fila();
        fila.enqueue("1");
        fila.enqueue("2");
        fila.enqueue("3");
        fila.enqueue("4");
        fila.enqueue("5");
        fila.enqueue("6");

        System.out.println(fila);

        fila.dequeue();
        System.out.println(fila);
        fila.enqueue("Last");
        System.out.println(fila);
        System.out.println(fila.first());

    }
}