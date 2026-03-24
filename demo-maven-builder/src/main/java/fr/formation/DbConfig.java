package fr.formation;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@Builder
@ToString
public class DbConfig {
    private String host;
    private int port;
    private String username;
    private String password;
    private String dbname;
}
