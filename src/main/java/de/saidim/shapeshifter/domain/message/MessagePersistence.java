package de.saidim.shapeshifter.domain.message;

import java.util.Optional;
import java.util.UUID;

public interface MessagePersistence {

    void save(Message shapeshifter);

    Optional<Message> loadById(UUID id);

    void deleteById(UUID id);
}
