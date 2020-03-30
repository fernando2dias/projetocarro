package br.facens.carro.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.facens.carro.model.Carro;
import br.facens.carro.service.CarroService;

/**
 * CarroController
 */

@Controller
@RequestMapping("/")
public class CarroController {
    @Autowired
    private CarroService carroService;

    @GetMapping("/")
    public ModelAndView Index(){
        ModelAndView mv = new ModelAndView("indexView");
        ArrayList<Carro> carros = carroService.getCarros();
        mv.addObject("carros", carros);
        return mv;
    }


    @GetMapping("/carro")
    //@RequestMapping(value="produto/{id}", method = RequestMethod.GET)
    public ModelAndView getCarroById(@RequestParam("id") int id){
        
         ModelAndView mv = new ModelAndView("carroView");
         Carro carro = carroService.getCarroById(id);
         mv.addObject("carro", carro);
         
 
         return mv;
    }


    

}