package at.marc_edlinger.multilang.language;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguageRepository extends JpaRepository<Language, Long> {

    boolean existsLanguageByDisplayName(String displayName);

}
