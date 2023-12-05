package com.example.demo.Service;

import com.example.demo.domain.Drink;

import java.util.List;

public interface DrinkService {
<<<<<<< HEAD
    static Drink saveDrink(Drink drink) {
        return null;
    }
=======

>>>>>>> 955f47c (First Commit for ingredients)

    Drink saveDrink(Drink drink);

    Drink getDrinkById(long id);
    List<Drink> getallDrink();

<<<<<<< HEAD
    Drink updateDrink(Drink drink, long id);
=======
//    Drink updateDrink(Drink drink, long id);
>>>>>>> 955f47c (First Commit for ingredients)

    Drink updateDrink(Drink drink);
    void deleteDrinkById(long id);
}

