public class Choinkazargumentem {
        public static void main(String[] args) {
            int zmienna=Integer.parseInt(args[0]);
            for (int i = 0; i <= zmienna; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.printf("*");
                }
                System.out.println("");

            }
        }

}
