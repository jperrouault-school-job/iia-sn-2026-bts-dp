package fr.formation;

public class Main {
    public static void main(String[] args) {
        DbConfig config = DbConfig.builder()
            .host("hostname")
            .port(3306)
            .username("username")
            .dbname("demo")
            .build()
        ;

        System.out.println(config);
    }
}