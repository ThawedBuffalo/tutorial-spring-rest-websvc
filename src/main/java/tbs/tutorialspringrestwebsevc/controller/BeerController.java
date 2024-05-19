package tbs.tutorialspringrestwebsevc.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;
import org.springframework.stereotype.Controller;
import tbs.tutorialspringrestwebsevc.model.Beer;
import tbs.tutorialspringrestwebsevc.services.BeerService;

import java.util.UUID;

@Slf4j
@AllArgsConstructor
@Controller
public class BeerController {
    private final BeerService beerService;

    public Beer getBeerById(UUID id){
        log.debug("Controller: getBeerById(): id ->" +id.toString()+  "<-");
        return beerService.getBeerById(id);
    }
}
