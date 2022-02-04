package at.marc_edlinger.multilang.config;

import at.marc_edlinger.multilang.exception.ErrorCode;
import at.marc_edlinger.multilang.exception.RestException;
import eu.forumat.config.JsonConfigAPI;

import java.util.Arrays;

public class KeyValidator {

    public static void validate(String apiKey) throws RestException {
        if (!isValidAPIKey(apiKey)) {
            throw new RestException(ErrorCode.INVALID_API_KEY, "Key: " + apiKey + " is invalid!");
        }
    }

    private static boolean isValidAPIKey(String apiKey) {
        return Arrays.asList(((RestConfig) JsonConfigAPI.getInstance().getConfig(RestConfig.class)).getAdminToken())
                .contains(apiKey);
    }

}
