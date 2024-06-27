package de.saidim.shapeshifter.infrastructure.storage.message;

import de.saidim.shapeshifter.domain.message.Message;
import de.saidim.shapeshifter.domain.message.MessagePersistence;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.UUID;

@Component
@RequiredArgsConstructor
public class MessageMongoDb implements MessagePersistence {

    MessageRepository repository;

    MessageMapper mapper;

    @Override
    public void save(Message message) {
        repository.save(mapper.mapToMongo(message));
    }

    @Override
    public Optional<Message> loadById(UUID id) {
        return repository.findById(id).map(mapper::mapToDomain);
    }

    @Override
    public void deleteById(UUID id) {
        repository.deleteById(id);
    }
}
