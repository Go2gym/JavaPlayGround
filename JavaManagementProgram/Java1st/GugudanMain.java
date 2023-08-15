class GugudanMain {
    public static void main(String[] args) {
        for(int i = 2; i < 10; i++) {
            int [] ans = Main.gugudan(i);
            Main.print(ans, i);
        }
    }
}