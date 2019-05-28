package pl.wedel.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController
{
    @GetMapping
    public String hello()
    {
        return "Hello world!";
    }
}
