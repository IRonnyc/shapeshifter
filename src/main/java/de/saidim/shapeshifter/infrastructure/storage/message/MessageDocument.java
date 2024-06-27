package de.saidim.shapeshifter.infrastructure.storage.message;

import de.saidim.shapeshifter.domain.message.Message;
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
public class MessageDocument {
    String content;
    Message author;
    List<UUID> recipients;
}
