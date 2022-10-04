public class Main {
    public static void main(String[] args) {
        int s=0;
        int x=1;
        for (String arg : args) {
            try {
                int a = Integer.parseInt(arg);
                s+=a;
                x++;
            } catch (NumberFormatException ignored) {
            }
        }
        System.out.println(s/x);
    }
}