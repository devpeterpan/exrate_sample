package kr.devpeterpan.exrate_sample.exrate;

import org.springframework.jdbc.core.simple.JdbcClient;

import javax.sql.DataSource;

public class CurrencyDao {

    private final JdbcClient jdbcClient;

    public CurrencyDao(DataSource dataSource) {
        this.jdbcClient = JdbcClient.create(dataSource);
    }

    public boolean existsByCurrencyCode(String currencyCode) {
        String sql = """
            SELECT COUNT(*) FROM MDM_CURRENCY WHERE currency_code = %s
            """.formatted(currencyCode);
        Integer count = jdbcClient.sql(sql).query(Integer.class).single();
        return count != null && count > 0;
    }

}
