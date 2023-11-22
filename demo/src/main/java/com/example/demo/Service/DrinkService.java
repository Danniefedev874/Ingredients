package com.example.demo.Service;

import com.example.demo.domain.Drink;

import java.util.List;

public interface DrinkService {
    static Drink saveDrink(Drink drink) {
        return null;
    }

    Drink saveDrink(Drink drink);

    Drink getDrinkById(long id);
    List<Drink> getallDrink();

    Drink updateDrink(Drink drink, long id);

    Drink updateDrink(Drink drink);
    void deleteDrinkById(long id);
}

