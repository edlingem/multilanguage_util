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

}
