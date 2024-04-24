import java.util.*;;
public class Uniqsubseq {
    public static void subseq(String str, int idx, String neString, HashSet<String> set) {
        if (idx == str.length()) {
            if (!set.contains(neString)) {
                System.out.println(neString);
                set.add(neString);
            }
            return;
        }

        char c = str.charAt(idx);
        subseq(str, idx + 1, neString + c, set); // Include current character
        subseq(str, idx + 1, neString, set);     // Exclude current character
    }

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        subseq("aaa", 0, "", set); // Pass an empty string initially
    }
}
