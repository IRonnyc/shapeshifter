package de.saidim.shapeshifter.domain.shapeshifter;

import java.util.Optional;
import java.util.UUID;

public interface ShapeshifterPersistence {

    void save(Shapeshifter shapeshifter);

    Optional<Shapeshifter> loadById(UUID id);

    void deleteById(UUID id);
}
