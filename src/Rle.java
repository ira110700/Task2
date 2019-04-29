import java.util.Arrays;

public class Rle {
    public static String rleCode(String a){
        StringBuilder sc = new StringBuilder();
        int count = 1;
        for (int i = 0; i < a.length()-1; i++){
            if (a.charAt(i) == a.charAt(i+1)){
                count++;
                continue;
            }
            if (count == 1){
                sc.append(a.charAt(i));
            } else {
                sc.append(a.charAt(i)).append(count);
            }
            count = 1;
        }
        sc.append(a.charAt(a.length()-1)).append(count);
        return sc.toString();
    }
    public static String rleDecode(String a) {
        StringBuilder sc = new StringBuilder();
        String[] things = a.split(" ");
        Arrays.asList(things);
        for (String thing : things){
        int count = Integer.parseInt(thing.substring(1));
            for (int j = 0; j < count; j++){
                sc.append(thing.charAt(0));
            }
        }
    return sc.toString();
    }
}

