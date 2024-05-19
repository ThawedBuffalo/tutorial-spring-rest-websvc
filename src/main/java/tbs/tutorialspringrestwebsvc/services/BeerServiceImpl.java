package tbs.tutorialspringrestwebsvc.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tbs.tutorialspringrestwebsvc.model.Beer;
import tbs.tutorialspringrestwebsvc.model.BeerStyle;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public Beer getBeerById(UUID id) {

        log.debug("Service: getBeerById(): id ->" +id.toString()+  "<-");

        return Beer.builder()
                .id(id)
                .version(1)
                .beerName("Sabre Piss")
                .beerStyle(BeerStyle.IPA)
                .upc("12345")
                .price(new BigDecimal("12.99"))
                .quantityOnHand(100)
                .updateDate(LocalDateTime.now())
                .updateDate(LocalDateTime.now())
                .build();
   }
}
