package com.example.demo.Repository;

import com.example.demo.domain.Drink;
import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< HEAD
=======
import org.springframework.stereotype.Repository;
>>>>>>> 955f47c (First Commit for ingredients)

import java.util.List;
import java.util.Optional;

<<<<<<< HEAD
public interface DrinkRepository extends JpaRepository<Drink, Long> {
    List<Drink> findDrinkByPrice(int price);


    Optional<Drink> findById(List<Drink> drinks);
=======
@Repository
public interface DrinkRepository extends JpaRepository<Drink, Long> {
>>>>>>> 955f47c (First Commit for ingredients)
}
