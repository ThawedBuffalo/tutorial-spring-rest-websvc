package tbs.tutorialspringrestwebsvc.services;

import tbs.tutorialspringrestwebsvc.model.Beer;

import java.util.UUID;

public interface BeerService {
    Beer getBeerById(UUID uuid);
}
