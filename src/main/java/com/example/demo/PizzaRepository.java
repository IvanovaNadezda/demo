package com.example.demo;

import org.springframework.data.repository.CrudRepository;

// создавать читать менять удалять
public interface PizzaRepository extends CrudRepository<Pizza,Integer> { // тип данных с которым работаем, первичный ключ <>

}
