package Day5;

public class StringLength{
    public static void main(String[] args) {
        String s1 = "Seshu";
        System.out.println(s1.length());
        StringBuffer sb = new StringBuffer();
        sb.append("Seshu").append("trainer").reverse().insert(2," java").delete(3,7);
            System.out.println(sb);
    }
}
