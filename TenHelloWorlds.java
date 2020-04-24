public class TenHelloWorlds {

    public static void main(final String[] args) {
        final String str = "Hello, World";
        int counter = 10;
        while (counter > 0) {
            System.out.println(str);
            System.out.println(counter--);
            System.out.println(counter);
        }

    }

}