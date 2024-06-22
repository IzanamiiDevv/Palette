import palette.palette;
import palette.palette.colors;
import palette.palette.decoration;

public class main {
    public static void main(String[] args) {
        String text = decoration.BOLD + colors.BG_BLUE + colors.WHITE + "Hello";
        String text2 = decoration.BOLD + colors.BG_CYAN + colors.GrayScale(5) + "World";
        System.out.println(text + text2);
        palette.resetAll();

        System.out.println(palette.setStyle(colors.RGB(30, 160, 240), "Colors!"));

        String rainbow = colors.BG_RED + "R" + colors.getBG_ANSI(202) + "A" + colors.BG_YELLOW + "I" + colors.BG_GREEN + "N" + colors.getBG_ANSI(211) + "B" + colors.BG_BLUE + "O" + colors.BG_PURPLE + "W" + palette.RESET;
        System.out.println(rainbow);
    }
}
