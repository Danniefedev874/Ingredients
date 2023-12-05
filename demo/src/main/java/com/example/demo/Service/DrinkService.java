package com.example.demo3.Service;

import com.example.demo3.Domain.Drink;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface DrinkService {
    Drink saveDrink(Drink drink);
    Drink getDrinkById(long id);
    List<Drink> getAllDrink();
    Drink updateDrink(Drink drink);
    void deleteDrinkById(long id);
}
