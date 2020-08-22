package com.morpheus.pokedex.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.morpheus.pokedex.model.Pokemon;

public interface PokemonRepository extends ReactiveMongoRepository <Pokemon, String> {

}
