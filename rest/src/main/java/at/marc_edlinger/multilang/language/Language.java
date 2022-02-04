package at.marc_edlinger.multilang.language;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "languages")
public class Language {

    @Id
    @Column(nullable = false)
    private String id;

    private String displayName;

    private LanguageState state;

}