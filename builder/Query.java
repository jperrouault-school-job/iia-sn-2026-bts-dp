import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Query {
    private String from;
    private List<String> columns = new ArrayList<>();
    private String orderBy;

    public Query(String from, List<String> columns, String orderBy) {
        this.from = from;
        this.columns = columns;
        this.orderBy = orderBy;
    }

    public void execute() {
        String query = "SELECT " + String.join(", ", columns);

        query += " FROM " + from;

        if (orderBy != null) {
            query += " ORDER BY " + orderBy;
        }

        System.out.println(query);
    }

    public static QueryBuilder builder() {
        return new QueryBuilder();
    }

    public static class QueryBuilder {
        private String from;
        private List<String> columns = new ArrayList<>();
        private String orderBy;

        public Query build() {
            return new Query(from, columns, orderBy);
        }

        public QueryBuilder from(String from) {
            this.from = from;
            return this;
        }

        public QueryBuilder select(String column) {
            this.columns.add(column);
            return this;
        }

        public QueryBuilder select(List<String> columns) {
            this.columns.addAll(columns);
            return this;
        }

        public QueryBuilder select(String... columns) {
            this.columns.addAll(Arrays.asList(columns));
            return this;
        }

        public QueryBuilder orderBy(String orderBy) {
            this.orderBy = orderBy;
            return this;
        }
    }
}
