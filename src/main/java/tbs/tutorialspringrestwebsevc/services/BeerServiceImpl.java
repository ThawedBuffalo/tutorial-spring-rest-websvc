package tbs.tutorialspringrestwebsevc.services;

import tbs.tutorialspringrestwebsevc.model.Beer;
import tbs.tutorialspringrestwebsevc.model.BeerStyle;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public class BeerServiceImpl implements BeerService {
    @Override
    public Beer getBeerById(UUID uuid) {
        return Beer.builder()
                .id(id)
                .version(1)
                .beerName('Sabre Piss')
                .beerStyle(BeerStyle.IPA)
                .upc("12345")
                .price(new BigDecimal("12.99"))
                .quantityOnHand(100)
                .updateDate(LocalDateTime.now())
                .updateDate(LocalDateTime.now())
                .build();
   }
}
