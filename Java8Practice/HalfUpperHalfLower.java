public class HalfUpperHalfLower {
    public static void main(String[] args) {
        String s = "Laptop";
        StringBuffer sb = new StringBuffer();
        int mid = s.length()/2;
        sb.append(s.substring(0, mid).toUpperCase()).append(s.substring(mid, s.length()).toLowerCase());
        System.out.println(sb.toString());
    }
}
