package br.facens.carro.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.facens.carro.model.Carro;
import br.facens.carro.repository.CarroRepository;

/**
 * CarroService
 */
@Service
public class CarroService {

    @Autowired
    CarroRepository carroRepository;

    public Carro getCarroById(int id){
        return carroRepository.getCarroById(id);
    }

   
    public ArrayList<Carro> getCarros(){
        return carroRepository.getCarros();
    }

}