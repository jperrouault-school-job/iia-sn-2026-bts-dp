public class AppSingleton {
    public static void main(String[] args) {
        DbContext ctx1 = DbContext.getInstance();
        DbContext ctx2 = DbContext.getInstance();

        System.out.println(ctx1 == ctx2);
    }
}
