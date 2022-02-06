package at.marc_edlinger.multilang.config;

import eu.forumat.config.JsonConfigAPI;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class SpringConfig {

    @Bean
    @Primary
    public DataSource getDataSource() {
        RestConfig config = JsonConfigAPI.getInstance().getConfig(RestConfig.class);
        return DataSourceBuilder.create()
                .username(config.getSqlUserName())
                .password(config.getSqlPassword())
                .url("jdbc:mysql://" + config.getSqlHost() + ":" + config.getSqlPort() + "/" + config.getSqlDatabase())
                .build();
    }

}
