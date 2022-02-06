package at.marc_edlinger.multilang.language;

import at.marc_edlinger.multilang.config.KeyValidator;
import at.marc_edlinger.multilang.exception.ErrorCode;
import at.marc_edlinger.multilang.exception.RestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(
        path = "api/v1/lang/{key}/"
)
public class LanguageRestController {

    private final LanguageRepository repository;

    @Autowired
    public LanguageRestController(LanguageRepository repository) {
        this.repository = repository;
    }

    @GetMapping("list")
    public List<Language> getLanguages(@PathVariable String key) throws RestException {
        KeyValidator.validate(key);

        return repository.findAll();
    }

    @PostMapping("create/{name}")
    public void createLanguage(@PathVariable String key, @PathVariable String name) throws RestException {
        KeyValidator.validate(key);

        if (repository.existsLanguageByDisplayName(name)) {
            throw new RestException(ErrorCode.ELEMENT_ALREADY_EXISTS, "Language already exists");
        }
        Language lang = new Language(null, name, LanguageState.NOT_IMPLEMENTED);
        repository.save(lang);
    }

}
