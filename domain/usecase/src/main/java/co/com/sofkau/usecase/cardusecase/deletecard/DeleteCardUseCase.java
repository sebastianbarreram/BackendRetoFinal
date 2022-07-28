package co.com.sofkau.usecase.cardusecase.deletecard;

import co.com.sofkau.model.card.gateways.CardRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class DeleteCardUseCase {
    private final CardRepository cardRepository;

    public Mono<Void> eliminarCarta(String id) {
        return cardRepository.delete(id);
    }
}
