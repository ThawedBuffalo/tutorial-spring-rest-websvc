package tbs.tutorialspringrestwebsvc.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import tbs.tutorialspringrestwebsvc.model.Beer;
import tbs.tutorialspringrestwebsvc.services.BeerService;

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
