package de.saidim.shapeshifter.infrastructure.storage.shapeshifter;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface ShapeshifterRepository extends MongoRepository<ShapeshifterDocument, UUID> {
}
