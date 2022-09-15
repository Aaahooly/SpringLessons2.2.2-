package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.Service.ServiceCar;

@Controller
@RequestMapping("/cars")
public class CarController {

    private final ServiceCar serviceCar;

    public CarController(ServiceCar serviceCar) {
        this.serviceCar = serviceCar;
    }

    @GetMapping()
    public String show(@RequestParam(value = "count", required = false) Integer count, Model model){
        model.addAttribute("carList", serviceCar.index(count));
        return "cars/cars";
    }
}
