package de.saidim.shapeshifter.domain.message;

import de.saidim.shapeshifter.domain.shapeshifter.Shapeshifter;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
@Builder
public class Message {
    String content;
    Shapeshifter author;
    List<UUID> recipients;
}
