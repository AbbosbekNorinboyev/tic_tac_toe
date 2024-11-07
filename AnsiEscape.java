public class AnsiEscape {
    public static void main(String[] args) {
        String RED_BACKGROUND = "\033[41m";
        String YELLOW_BACKGROUND = "\033[43m";
        String GREEN_BACKGROUND = "\033[42m";
        String RESET = "\033[0m";
        System.out.println(RED_BACKGROUND + " Hello " + RESET);
        System.out.println(YELLOW_BACKGROUND + " Hello " + RESET);
        System.out.println(GREEN_BACKGROUND + " Hello " + RESET);
    }
}
