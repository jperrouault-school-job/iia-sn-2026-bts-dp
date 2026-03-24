public class AppBuilder {
    public static void main(String[] args) {
        DbConfig config = DbConfig.builder()
            .host("hostname")
            .port(3306)
            .username("username")
            .dbname("demo")
            .build()
        ;

        Query q1 = Query.builder()
            .from("user")
            .select("id")
            .select("username", "password")
            .build()
        ;

        Query q2 = Query.builder()
            .from("role")
            .select("id")
            .select("acl")
            .select("userId")
            .orderBy("userId")
            .build()
        ;

        q1.execute();
        q2.execute();
    }
}
