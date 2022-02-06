package at.marc_edlinger.multilang.config;

import com.mysql.cj.jdbc.MysqlDataSource;
import eu.forumat.config.JsonConfigAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class SpringConfig {

    @Bean
    public DataSource getDataSource() {
        RestConfig config = JsonConfigAPI.getInstance().getConfig(RestConfig.class);
        
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setServerName(config.getSqlHost());
        dataSource.setUser(config.getSqlUserName());
        dataSource.setPassword(config.getSqlPassword());
        dataSource.setPort(config.getSqlPort());
        dataSource.setDatabaseName(config.getSqlDatabase());

        return dataSource;
    }

}
