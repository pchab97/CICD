package pl.wedel.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dogs")
public class HomeController {

    private final DogRepo dogRepo;

    public HomeController(DogRepo dogRepo) {
        this.dogRepo = dogRepo;
    }

    @GetMapping
    public Iterable<Dog> hello(){
        return dogRepo.findAll();
    }

    @PostMapping
    public Dog addDog(){
        return this.dogRepo.save(new Dog("Burek"));
    }

}
