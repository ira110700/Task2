public class Rle {
    public static String rleCode(String a) {
        StringBuilder sc = new StringBuilder();
        int count = 1;
        for (int i = 0; i < a.length() - 1; i++) {
            if (a.charAt(i) == a.charAt(i + 1)) {
                count++;
                continue;
            }
            if (count == 1) {
                sc.append(a.charAt(i));
            } else {
                sc.append(a.charAt(i)).append(count);
            }
            count = 1;
        }
        sc.append(a.charAt(a.length() - 1)).append(count);
        return sc.toString();
    }

    public static String rleDecode(String a) {
        final StringBuilder sb = new StringBuilder();

        final char[] chars = a.toCharArray();

        int i = 0;
        while (i < chars.length) {
            int repeat = 0;
            while ((i < chars.length) && Character.isDigit(chars[i])) {
                repeat = repeat * 10 + chars[i++] - '0';
            }
            final StringBuilder s = new StringBuilder();
            while ((i < chars.length) && !Character.isDigit(chars[i])) {
                s.append(chars[i++]);
            }

            if (repeat > 0) {
                for (int j = 0; j < repeat; j++) {
                    sb.append(s.toString());
                }
            } else {
                sb.append(s.toString());
            }
        }
        return sb.toString();
    }
}

