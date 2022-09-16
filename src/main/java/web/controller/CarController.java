package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.Service.CarService;
import web.Service.CarServiceImpl;

@Controller
@RequestMapping("/cars")
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping()
    public String show(@RequestParam(value = "count", required = false) Integer count, Model model){
        model.addAttribute("carList", carService.index(count));
        return "cars/cars";
    }
}
