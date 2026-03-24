public class AppBuilder {
    public static void main(String[] args) {
        DbConfig config = DbConfig.builder()
            .host("hostname")
            .port(3306)
            .username("username")
            .dbname("demo")
            .build()
        ;
    }
}
