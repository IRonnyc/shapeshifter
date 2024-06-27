package de.saidim.shapeshifter.infrastructure.storage.message;

import de.saidim.shapeshifter.domain.message.Message;
import org.mapstruct.Mapper;

import static org.mapstruct.InjectionStrategy.CONSTRUCTOR;
import static org.mapstruct.MappingConstants.ComponentModel.SPRING;
import static org.mapstruct.NullValueMappingStrategy.RETURN_DEFAULT;

@Mapper(componentModel = SPRING, injectionStrategy = CONSTRUCTOR, nullValueIterableMappingStrategy = RETURN_DEFAULT)
public interface MessageMapper {

    /**
     * Maps a {@link Message} object to its mongodb representation.
     *
     * @param message the {@link Message}
     * @return the {@link MessageDocument}
     */
    MessageDocument mapToMongo(Message message);

    /**
     * Maps a {@link MessageDocument} object to its domain representation.
     *
     * @param document the {@link MessageDocument}
     * @return the {@link Message}
     */
    Message mapToDomain(MessageDocument document);
}
