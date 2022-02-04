package at.marc_edlinger.multilang.language;

import at.marc_edlinger.multilang.config.KeyValidator;
import at.marc_edlinger.multilang.exception.RestException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(
        path = "api/v1/lang/{key}/"
)
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class LanguageRestController {

    private final LanguageRepository repository;

    @GetMapping("fetch/all")
    public List<Language> getLanguages(@PathVariable String key) throws RestException {
        KeyValidator.validate(key);

        return repository.findAll();
    }

}
