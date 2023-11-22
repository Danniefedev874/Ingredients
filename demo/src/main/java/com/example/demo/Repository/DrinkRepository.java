package com.example.demo.Repository;

import com.example.demo.domain.Drink;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface DrinkRepository extends JpaRepository<Drink, Long> {
    List<Drink> findDrinkByPrice(int price);


    Optional<Drink> findById(List<Drink> drinks);
}
