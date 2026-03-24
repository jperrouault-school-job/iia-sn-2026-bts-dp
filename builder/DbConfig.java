public class DbConfig {
    private String host;
    private int port;
    private String username;
    private String password;
    private String dbname;

    public DbConfig() { }

    public DbConfig(String host, int port, String username, String password, String dbname) {
        this.host = host;
        this.port = port;
        this.username = username;
        this.password = password;
        this.dbname = dbname;
    }

    public static DbConfigBuilderV1 builder() {
        return new DbConfigBuilderV1();
    }

    public static DbConfigBuilderV2 builderV2() {
        return new DbConfigBuilderV2();
    }

    public static class DbConfigBuilderV1 {
        private String host;
        private int port;
        private String username;
        private String password;
        private String dbname;

        public DbConfig build() {
            // DbConfig config = new DbConfig();

            // config.host = this.host;
            // config.port = this.port;
            // config.username = this.username;
            // config.password = this.password;
            // config.dbname = this.dbname;

            // return config;

            return new DbConfig(host, port, username, password, dbname);
        }

        public DbConfigBuilderV1 host(String host) {
            this.host = host;
            return this;
        }

        public DbConfigBuilderV1 port(int port) {
            this.port = port;
            return this;
        }

        public DbConfigBuilderV1 username(String username) {
            this.username = username;
            return this;
        }

        public DbConfigBuilderV1 password(String password) {
            this.password = password;
            return this;
        }

        public DbConfigBuilderV1 dbname(String dbname) {
            this.dbname = dbname;
            return this;
        }
    }

    public static class DbConfigBuilderV2 {
        private DbConfig instance = new DbConfig();

        public DbConfig build() {
            return this.instance;
        }

        public DbConfigBuilderV2 host(String host) {
            this.instance.host = host;
            return this;
        }

        public DbConfigBuilderV2 port(int port) {
            this.instance.port = port;
            return this;
        }

        public DbConfigBuilderV2 username(String username) {
            this.instance.username = username;
            return this;
        }

        public DbConfigBuilderV2 password(String password) {
            this.instance.password = password;
            return this;
        }

        public DbConfigBuilderV2 dbname(String dbname) {
            this.instance.dbname = dbname;
            return this;
        }
    }
}
