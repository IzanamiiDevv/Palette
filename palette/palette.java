package palette;

public class palette {

    public static String RESET = "\u001b[0m";


    public static class colors {

        /**
         * <h2>Dark Red</h2>
         * @category Standard Color
         */
        public static final String DARK_RED = "\u001b[38;5;1m";
        /**
         * <h2>Dark Red</h2>
         * @category Standard Color
         */
        public static final String BG_DARK_RED = "\u001b[48;5;1m";

        /**
         * <h2>Dark Green</h2>
         * @category Standard Color
         */
        public static final String DARK_GREEN = "\u001b[38;5;2m";
        /**
         * <h2>Dark Green</h2>
         * @category Standard Color
         */
        public static final String BG_DARK_GREEN = "\u001b[48;5;2m";

        /**
         * <h2>Dark Yellow</h2>
         * @category Standard Color
         */
        public static final String DARK_YELLOW = "\u001b[38;5;3m";
        /**
         * <h2>Dark Yellow</h2>
         * @category Standard Color
         */
        public static final String BG_DARK_YELLOW = "\u001b[48;5;3m";

        /**
         * <h2>Dark Blue</h2>
         * @category Standard Color
         */
        public static final String DARK_BLUE = "\u001b[38;5;4m";
        /**
         * <h2>Dark Blue</h2>
         * @category Standard Color
         */
        public static final String BG_DARK_BLUE = "\u001b[48;5;4m";

        /**
         * <h2>Dark Purple</h2>
         * @category Standard Color
         */
        public static final String DARK_PURPLE = "\u001b[38;5;5m";
        /**
         * <h2>Dark Purple</h2>
         * @category Standard Color
         */
        public static final String BG_DARK_PURPLE = "\u001b[48;5;5m";

        /**
         * <h2>Dark Cyan</h2>
         * @category Standard Color
         */
        public static final String DARK_CYAN = "\u001b[38;5;6m";
        /**
         * <h2>Dark Cyan</h2>
         * @category Standard Color
         */
        public static final String BG_DARK_CYAN = "\u001b[48;5;6m";

        /**
         * <h2>Red</h2>
         * @category High Intensity Color
         */
        public static final String RED = "\u001b[38;5;9m";
        /**
         * <h2>Red</h2>
         * @category High Intensity Color
         */
        public static final String BG_RED = "\u001b[48;5;9m";

        /**
         * <h2>Green</h2>
         * @category High Intensity Color
         */
        public static final String GREEN = "\u001b[38;5;10m";
        /**
         * <h2>Green</h2>
         * @category High Intensity Color
         */
        public static final String BG_GREEN = "\u001b[48;5;10m";

        /**
         * <h2>Yellow</h2>
         * @category High Intensity Color
         */
        public static final String YELLOW = "\u001b[38;5;11m";
        /**
         * <h2>Yellow</h2>
         * @category High Intensity Color
         */
        public static final String BG_YELLOW = "\u001b[48;5;11m";

        /**
         * <h2>Blue</h2>
         * @category High Intensity Color
         */
        public static final String BLUE = "\u001b[38;5;12m";
        /**
         * <h2>Blue</h2>
         * @category High Intensity Color
         */
        public static final String BG_BLUE = "\u001b[48;5;12m";

        /**
         * <h2>Purple</h2>
         * @category High Intensity Color
         */
        public static final String PURPLE = "\u001b[38;5;13m";
        /**
         * <h2>Purple</h2>
         * @category High Intensity Color
         */
        public static final String BG_PURPLE = "\u001b[48;5;13m";

        /**
         * <h2>Cyan</h2>
         * @category High Intensity Color
         */
        public static final String CYAN = "\u001b[38;5;14m";
        /**
         * <h2>Cyan</h2>
         * @category High Intensity Color
         */
        public static final String BG_CYAN = "\u001b[48;5;14m";

        /**
         * <h2>White</h2>
         * @category High Intensity Color
         */
        public static final String WHITE = "\u001b[38;5;15m";
        /**
         * <h2>Black</h2>
         * @category Standard Color
         */
        public static final String BLACK = "\u001b[38;5;0m";


        public static String RGB(int red, int green, int blue) {
            if(red < 0 || red > 255 || green < 0 || green > 255 || blue < 0 || blue > 255) {
                System.err.println("Invalid RGB values should be ranged [ 0 - 255 ]");
                return "";
            }

            String _red = Integer.toString(red);
            String _green = Integer.toString(green);
            String _blue = Integer.toString(blue);
            return String.format("\u001b[38;2;%s;%s;%sm", _red, _green, _blue);
        }

        public static String GrayScale(int scale) {
            int initial = 232;
            initial += 0;
            
            if(initial > 255)
                initial = 255;
            
            return String.format("\u001b[38;5;%sm", Integer.toString(initial));
        }

        public static String getANSI(int value) {
            int initial = 0;
            initial += value;

            if(initial > 255)
                initial = 255;
            return String.format("\u001b[38;5;%sm", Integer.toString(initial));
        }

        public static String getBG_ANSI(int value) {
            int initial = 0;
            initial += value;

            if(initial > 255)
                initial = 255;
            return String.format("\u001b[48;5;%sm", Integer.toString(initial));
        }

        public static String BG_RGB(int red, int green, int blue) {
            if(red < 0 || red > 255 || green < 0 || green > 255 || blue < 0 || blue > 255) {
                System.err.println("Invalid RGB values should be ranged [ 0 - 255 ]");
                return "";
            }

            String _red = Integer.toString(red);
            String _green = Integer.toString(green);
            String _blue = Integer.toString(blue);
            return String.format("\u001b[48;2;%s;%s;%sm", _red, _green, _blue);
        }

        public static String BG_GrayScale(int scale) {
            int initial = 232;
            initial += scale;
            
            if(initial > 255)
                initial = 255;
            
            return String.format("\u001b[48;5;%sm", Integer.toString(initial));
        }
    }

    public static class decoration {

        public static final String BOLD = "\u001b[1m";
        public static final String ITALICIZE = "\u001b[3m";
        public static final String UNDERLINE = "\u001b[4m";

    }

    public static void resetAll() {
        System.out.print(RESET);
    }

    public static String setStyle(String Style, String Text) {
        return Style + Text + RESET;
    }
}
