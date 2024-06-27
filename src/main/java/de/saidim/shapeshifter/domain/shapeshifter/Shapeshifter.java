package de.saidim.shapeshifter.domain.shapeshifter;

import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
@Builder
public class Shapeshifter {
    UUID id;
    String name;
    String gender;
    String age;
    List<String> hobbies;
    String aboutMe;
    String realIdentity;
}
