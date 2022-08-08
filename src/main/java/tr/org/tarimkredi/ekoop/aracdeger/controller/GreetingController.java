package tr.org.tarimkredi.ekoop.aracdeger.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tr.org.tarimkredi.ekoop.aracdeger.dto.Greeting;

@RestController
public class GreetingController
{
    private static final String template = "Merhaba, %s. Nasılsın? ";
    private final  AtomicLong counter= new AtomicLong();


    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name){
        return new Greeting(counter.incrementAndGet(), String.format(template,name));

    }
    @GetMapping("/hello")
    public String hello()
    {
        return "Merhaba";
    }
}
