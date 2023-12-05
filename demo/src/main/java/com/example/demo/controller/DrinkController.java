package com.example.demo.controller;

<<<<<<< HEAD
public class DrinkController {
=======
import com.example.demo.Service.DrinkService;
import com.example.demo.domain.Drink;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DrinkController {
    @Autowired
    DrinkService drinkService;

    @GetMapping("/")
    public String homePage(Model model){
        model.addAttribute("drinks", drinkService.getallDrink());
        return "index";
    }

    @GetMapping("/showNewDrinkForm")
    public String showNewDrinkForm(Model model){
        Drink drink = new Drink();
        model.addAttribute("drink", drink);
        return "new drink";
    }
    @PostMapping("/saveDrink")
    public String saveDrink(@ModelAttribute("drink")Drink drink){
        drinkService.saveDrink(drink);
        return "redirect:/";
    }
>>>>>>> 955f47c (First Commit for ingredients)
}
