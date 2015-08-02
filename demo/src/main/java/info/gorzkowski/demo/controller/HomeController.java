package info.gorzkowski.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
class HomeController {

    private static final Logger LOGGER = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping("/")
    String index() {

        // TODO :) Run me with  --spring.profiles.active
        LOGGER.debug("Dev log");
        LOGGER.info("Prod log");

        return "home";
    }
}