public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s1 = "anagram";
        String t1 = "nagaram";

        boolean result1 = solution.isAnagram(s1, t1);
        System.out.println(result1);

        String s2 = "rat";
        String t2 = "car";

        boolean result2 = solution.isAnagram(s2, t2);
        System.out.println(result2);
    }
}
