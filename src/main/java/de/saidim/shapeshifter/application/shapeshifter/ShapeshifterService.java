package de.saidim.shapeshifter.application.shapeshifter;

import de.saidim.shapeshifter.domain.shapeshifter.Shapeshifter;
import de.saidim.shapeshifter.domain.shapeshifter.ShapeshifterPersistence;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ShapeshifterService {

    ShapeshifterPersistence persistence;

    public void save(Shapeshifter shapeshifter) {
        persistence.save(shapeshifter);
    }


}
