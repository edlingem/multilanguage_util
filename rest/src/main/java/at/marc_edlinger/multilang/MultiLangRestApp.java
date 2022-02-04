package at.marc_edlinger.multilang;

import at.marc_edlinger.multilang.config.RestConfig;
import eu.forumat.config.JsonConfigAPI;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MultiLangRestApp {

    public static void main(String[] args) {
        JsonConfigAPI.getInstance().registerConfig(new RestConfig());
        SpringApplication.run(MultiLangRestApp.class, args);
    }

}
