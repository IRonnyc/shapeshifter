package de.saidim.shapeshifter.infrastructure.storage.shapeshifter;

import de.saidim.shapeshifter.domain.shapeshifter.Shapeshifter;
import org.mapstruct.Mapper;

import static org.mapstruct.InjectionStrategy.CONSTRUCTOR;
import static org.mapstruct.MappingConstants.ComponentModel.SPRING;
import static org.mapstruct.NullValueMappingStrategy.RETURN_DEFAULT;

@Mapper(componentModel = SPRING, injectionStrategy = CONSTRUCTOR, nullValueIterableMappingStrategy = RETURN_DEFAULT)
public interface ShapeshifterMapper {

    /**
     * Maps a {@link Shapeshifter} object to its mongodb representation.
     *
     * @param shapeshifter the {@link Shapeshifter}
     * @return the {@link ShapeshifterDocument}
     */
    ShapeshifterDocument mapToMongo(Shapeshifter shapeshifter);

    /**
     * Maps a {@link ShapeshifterDocument} object to its domain representation.
     *
     * @param document the {@link ShapeshifterDocument}
     * @return the {@link Shapeshifter}
     */
    Shapeshifter mapToDomain(ShapeshifterDocument document);
}
