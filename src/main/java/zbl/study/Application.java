package zbl.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        System.out.println("application service started !!!");
    }

    @RequestMapping("/casTest")
    public String casTest() {
        return "success !!!";
    }

    @RequestMapping("/ignoreTest")
    public String ignoreTest() {
        return "ignoreTest";
    }@RequestMapping("/test")
    public String test() {
        return "test";
    }

    @RequestMapping("/logout")
    public String logout() {
        return "logout";
    }
}
