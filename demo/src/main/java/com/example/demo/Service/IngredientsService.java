package com.example.demo.Service;

import com.example.demo.domain.Ingredient;
import com.example.demo.domain.Ingredient;

import java.util.List;

public interface IngredientsService {


    Ingredient saveIngredients(Ingredient ingredient);

    Ingredient getIngredientById(long id);
    List<Ingredient> getallIngredient();

    Ingredient updateIngIngredient(Ingredient ingredient, long id);

    Ingredient updateIngredient(Ingredient ingredient);
    void deleteIngredientById(long id);
}

