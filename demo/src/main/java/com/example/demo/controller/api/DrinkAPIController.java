package com.example.demo.controller.api;

import com.example.demo.Repository.DrinkRepository;
import com.example.demo.Service.DrinkService;
import com.example.demo.domain.Drink;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
<<<<<<< HEAD

import java.util.List;

=======
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
>>>>>>> 955f47c (First Commit for ingredients)
public class DrinkAPIController {

    @Autowired
    DrinkRepository drinkRepository;

    @Autowired
    DrinkService drinkService;

    @RequestMapping("/drinks")
    @GetMapping("/drinks")
    public ResponseEntity<List<Drink>> getAllDrinks() {
        return ResponseEntity.ok().body(drinkService.getallDrink());
    }

<<<<<<< HEAD
=======
    @RequestMapping("/drink/{id}")
    @GetMapping
    public ResponseEntity<Drink> getDrinkById(@PathVariable long id){
        return ResponseEntity.ok().body(drinkService.getDrinkById(id));
    }

    @PostMapping("/drink")
    public ResponseEntity<Drink> createDrink(@RequestBody Drink drink){
        return ResponseEntity.ok().body(drinkService.saveDrink(drink));
    }

    @PutMapping("/drink/{id}")
    public ResponseEntity<Drink> updateDrink(@PathVariable long id, @RequestBody Drink drink){
        return ResponseEntity.ok().body(drinkService.updateDrink(drink));
    }
     @DeleteMapping("/drink/{id}")
    public HttpStatus deleteDrink(@PathVariable long id){
        drinkService.deleteDrinkById(id);
        return HttpStatus.OK;
    }

>>>>>>> 955f47c (First Commit for ingredients)
}