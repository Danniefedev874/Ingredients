package com.example.demo.Service;

import com.example.demo.Repository.DrinkRepository;
import com.example.demo.domain.Drink;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class DrinkServiceImpl implements DrinkService{

    @Autowired
    DrinkRepository  drinkRepository;

    @Override
    public Drink saveDrink(Drink drink) {
        return null;
    }

    @Override
    public Drink getDrinkById(long id) {
        return null;
    }

    @Override
    public List<Drink> getallDrink() {
        return null;
    }

    @Override
    public Drink updateDrink(Drink drink, long id) {
        return null;
    }


    @Override
    public Drink updateDrink(Drink drink) {
        Optional<Drink> optionalDrink = drinkRepository.findById(getallDrink());
        if (optionalDrink.isPresent()){
            Drink updateDrink = new Drink();
            updateDrink.setCapacity(drink.getCapacity());
            updateDrink.setColour(drink.getColour());
            updateDrink.setCompany(drink.getCompany());
            updateDrink.setName(drink.getName());
            updateDrink.setType(drink.getType());
            updateDrink.setId(drink.getId());
            updateDrink.setIngredientList(drink.getIngredientList());

            drinkRepository.save(updateDrink);
        }
        return null;
    }

    @Override
    public void deleteDrinkById(long id) {

    }
}
