package tbs.tutorialspringrestwebsevc.services;

import tbs.tutorialspringrestwebsevc.model.Beer;

import java.util.UUID;

public interface BeerService {
    Beer getBeerById(UUID uuid);
}
