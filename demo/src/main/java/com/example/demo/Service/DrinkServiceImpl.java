package com.example.demo.Service;

import com.example.demo.Repository.DrinkRepository;
import com.example.demo.domain.Drink;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
<<<<<<< HEAD
public class DrinkServiceImpl implements DrinkService{

    @Autowired
    DrinkRepository  drinkRepository;

    @Override
    public Drink saveDrink(Drink drink) {
        return null;
=======
public class DrinkServiceImpl implements DrinkService {

    @Autowired
    DrinkRepository drinkRepository;

    @Override
    public Drink saveDrink(Drink drink) {
        return drinkRepository.save(drink);
>>>>>>> 955f47c (First Commit for ingredients)
    }

    @Override
    public Drink getDrinkById(long id) {
<<<<<<< HEAD
        return null;
    }

    @Override
    public List<Drink> getallDrink() {
        return null;
    }

    @Override
    public Drink updateDrink(Drink drink, long id) {
        return null;
=======
        Optional<Drink> drink = drinkRepository.findById(id);

        Drink emptyDrink = null;
        if (drink.isPresent()){
        emptyDrink = drink.get();
        return emptyDrink;
    }else {
        throw new RuntimeException("Drink not Found");
    }
}

    @Override
    public List<Drink> getallDrink() {
        return drinkRepository.findAll();
>>>>>>> 955f47c (First Commit for ingredients)
    }


    @Override
    public Drink updateDrink(Drink drink) {
<<<<<<< HEAD
        Optional<Drink> optionalDrink = drinkRepository.findById(getallDrink());
=======
        Optional<Drink> optionalDrink = drinkRepository.findById(drink.getId());
>>>>>>> 955f47c (First Commit for ingredients)
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
<<<<<<< HEAD
        }
        return null;
=======
            return updateDrink;
        } else {
            throw new RuntimeException("Drink was not found");
        }
>>>>>>> 955f47c (First Commit for ingredients)
    }

    @Override
    public void deleteDrinkById(long id) {
<<<<<<< HEAD

    }
}
=======
     drinkRepository.deleteById(id);
    }
}

>>>>>>> 955f47c (First Commit for ingredients)
