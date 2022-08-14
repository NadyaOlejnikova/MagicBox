public class Main {

    public static void main(String[] args) {
        MagicBox <String> magicBox = new MagicBox <>(3);
        magicBox.add("Nadya");
        magicBox.add("Dima");
        magicBox.add("Yulya");
        magicBox.pick();
        MagicBox <Integer> magicBox1 = new MagicBox <>(3);
        magicBox1.add(5);
        magicBox1.add(6);
        magicBox1.add(7);
        magicBox1.pick();
    }
}
