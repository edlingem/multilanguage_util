package at.marc_edlinger.multilang.language;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(
        path = "api/v1/lang/"
)
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class LanguageRestController {

    private final LanguageRepository repository;

}
