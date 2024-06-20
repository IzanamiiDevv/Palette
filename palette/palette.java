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
         * <h2>Dark Green</h2>
         * @category Standard Color
         */
        public static final String DARK_GREEN = "\u001b[38;5;2m";
        /**
         * <h2>Dark Yellow</h2>
         * @category Standard Color
         */
        public static final String DARK_YELLOW = "\u001b[38;5;3m";
        /**
         * <h2>Dark Blue</h2>
         * @category Standard Color
         */
        public static final String DARK_BLUE = "\u001b[38;5;4m";
        /**
         * <h2>Dark Purple</h2>
         * @category Standard Color
         */
        public static final String DARK_PURPLE = "\u001b[38;5;5m";
        /**
         * <h2>Dark Cyan</h2>
         * @category Standard Color
         */
        public static final String DARK_CYAN = "\u001b[38;5;6m";

        /**
         * <h2>Red</h2>
         * @category High Intensity Color
         */
        public static final String RED = "\u001b[38;5;9m";
        /**
         * <h2>Green</h2>
         * @category High Intensity Color
         */
        public static final String GREEN = "\u001b[38;5;10m";
        /**
         * <h2>Yellow</h2>
         * @category High Intensity Color
         */
        public static final String YELLOW = "\u001b[38;5;11m";
        /**
         * <h2>Blue</h2>
         * @category High Intensity Color
         */
        public static final String BLUE = "\u001b[38;5;12m";
        /**
         * <h2>Purple</h2>
         * @category High Intensity Color
         */
        public static final String PURPLE = "\u001b[38;5;13m";
        /**
         * <h2>Cyan</h2>
         * @category High Intensity Color
         */
        public static final String CYAN = "\u001b[38;5;14m";

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

            
            return "";
        }

        public static String GrayScale(int intensity) {
            return "";
        }
    }

    public static class decoration {

        public static final String BOLD = "\u001b[1m";
        public static final String ITALICIZE = "\u001b[3m";
        public static final String UNDERLINE = "\u001b[4m";

    }

    public static void resetAll() {

    }
}
