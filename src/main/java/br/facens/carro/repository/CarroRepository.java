package br.facens.carro.repository;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.stereotype.Repository;

import br.facens.carro.model.Carro;

/**
 * CarroRepository
 */
@Repository
public class CarroRepository {
    private HashMap<String, Carro> hm = new HashMap<String, Carro>();

    public CarroRepository(){
        hm.put("1", new Carro(1, "Volkswagen", "Gol", 2020, 43690, "images/foto/gol.jpg", "images/thumb/gol.jpg"));
        hm.put("2", new Carro(2, "Volkswagen", "Golf", 2020, 90000, "images/foto/golf.jpg", "images/thumb/golf.jpg"));
        hm.put("3", new Carro(3, "Volkswagen", "UP!", 2020, 47390, "images/foto/up.jpg", "images/thumb/up.jpg"));
        hm.put("4", new Carro(4, "Volkswagen", "Voyage", 2020, 45000, "images/foto/voyage.jpg", "images/thumb/voyage.jpg"));
        hm.put("5", new Carro(5, "Volkswagen", "Jetta", 2020, 110000, "images/foto/jetta.jpg", "images/thumb/jetta.jpg"));
        hm.put("6", new Carro(6, "Volkswagen", "Passat", 2020, 150000, "images/foto/passat.jpg", "images/thumb/passat.jpg"));
        hm.put("7", new Carro(7, "Volkswagen", "T-Cross", 2020, 57630, "images/foto/tcross.jpg", "images/thumb/tcross.jpg"));
        hm.put("8", new Carro(8, "Volkswagen", "Novo Polo", 2020, 69490, "images/foto/polo.jpg", "images/thumb/polo.jpg"));
        hm.put("9", new Carro(9, "Volkswagen", "Saveiro", 2020, 50000, "images/foto/saveiro.jpg", "images/thumb/saveiro.jpg"));
        hm.put("10", new Carro(10, "Volkswagen", "Virtus", 2020, 65990, "images/foto/virtus.jpg", "images/thumb/virtus.jpg"));
        hm.put("11", new Carro(11, "Volkswagen", "Tiguan", 2020, 70000, "images/foto/tiguan.jpg", "images/thumb/tiguan.jpg"));
        hm.put("12", new Carro(12, "Volkswagen", "Amarok", 2020, 70000, "images/foto/amarok.jpg", "images/thumb/amarok.jpg"));
    }

    public Carro getCarroById(int id){
        return hm.get(Integer.toString(id));
    }

    public ArrayList<Carro> getCarros(){
        return new ArrayList<Carro>(hm.values());
    }

    
}