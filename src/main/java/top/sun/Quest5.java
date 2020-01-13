package top.sun;

/**
 * Created by SunnyGrocery on 2020/1/12 21:05
 */
public class Quest5 {
    public static void main(String[] args) {
        StringBuffer example = new StringBuffer("We Are Happy");
        long st = System.currentTimeMillis();
        System.out.println(replaceSpace1(example));
        System.out.println(System.currentTimeMillis() - st);

        st = System.currentTimeMillis();
        System.out.println(replaceSpace2(example));
        System.out.println(System.currentTimeMillis() - st);
    }
    public static String replaceSpace1(StringBuffer str) {
        return str.toString().replace(" ", "%20");
    }

    public static String replaceSpace2(StringBuffer str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                result.append("%20");
            } else {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }
}
