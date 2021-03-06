package at.marc_edlinger.multilang.config;

import eu.forumat.config.annotation.JsonConfig;
import lombok.Getter;

@JsonConfig(
        path = "config/",
        name = "rest-config.json"
)
@Getter
public class RestConfig {

    private String[] adminToken = new String[]{"asd", "fgh"};

    private String sqlHost = "localhost";
    private String sqlUserName = "admin";
    private String sqlPassword = "asd";
    private String sqlDatabase = "rest";
    private int sqlPort = 3306;

}
