package kochetov;

/**
 * Triangle.
 *
 * @author Kochetov
 * @version $Id$
 * @since 0.1
 */
public class Triangle implements Shape {
    /**
     * Triangle print.
     * @return tag
     */
    @Override
    public String pic() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            for (int j = i; j < 4; j++) {
                sb.append("x");
            }
            if (i != 3) {
                sb.append(System.getProperty("line.separator"));
            }
        }
        return sb.toString();
    }
}
