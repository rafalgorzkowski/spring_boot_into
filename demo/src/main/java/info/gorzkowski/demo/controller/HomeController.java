package info.gorzkowski.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.boot.actuate.metrics.GaugeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
class HomeController {

    @Autowired
    private CounterService counterService;

    @Autowired
    private GaugeService gauges;

    @RequestMapping("/")
    String index() {
//        this.gauges.submit("timer.test.value", Math.random() * 1000 + 1000);
        this.counterService.increment("info.gorzkowski.home-controller.invoked");
        return "home";
    }
}