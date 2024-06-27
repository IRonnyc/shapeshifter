package de.saidim.shapeshifter.infrastructure.storage.message;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface MessageRepository extends MongoRepository<MessageDocument, UUID> {
}
