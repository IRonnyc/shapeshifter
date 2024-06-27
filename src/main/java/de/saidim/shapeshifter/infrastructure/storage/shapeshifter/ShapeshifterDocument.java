package de.saidim.shapeshifter.infrastructure.storage.shapeshifter;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ShapeshifterDocument {
    UUID id;
    String name;
    String gender;
    String age;
    List<String> hobbies;
    String aboutMe;
    String realIdentity;
}
