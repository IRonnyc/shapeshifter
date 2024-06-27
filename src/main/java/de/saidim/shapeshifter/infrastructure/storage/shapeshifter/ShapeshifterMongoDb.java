package de.saidim.shapeshifter.infrastructure.storage.shapeshifter;

import de.saidim.shapeshifter.domain.shapeshifter.Shapeshifter;
import de.saidim.shapeshifter.domain.shapeshifter.ShapeshifterPersistence;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.UUID;

@Component
@RequiredArgsConstructor
public class ShapeshifterMongoDb implements ShapeshifterPersistence {

    ShapeshifterRepository repository;

    ShapeshifterMapper mapper;

    @Override
    public void save(Shapeshifter shapeshifter) {
        repository.save(mapper.mapToMongo(shapeshifter));
    }

    @Override
    public Optional<Shapeshifter> loadById(UUID id) {
        return repository.findById(id).map(mapper::mapToDomain);
    }

    @Override
    public void deleteById(UUID id) {
        repository.deleteById(id);
    }
}
