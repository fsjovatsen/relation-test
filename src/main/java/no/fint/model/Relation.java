package no.fint.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Relation {
    private String type;
    private String key1;
    private String key2;
}
