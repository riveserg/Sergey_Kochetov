package kochetov;

/**
 * Square.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class Square implements Shape {
    /**
     * Square print.
     * @return tag
     */
    @Override
    public String pic() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                sb.append("x");
            }
            if (i != 3) {
                sb.append(System.getProperty("line.separator"));
            }
        }
        return sb.toString();
    }
}
