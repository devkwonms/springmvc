package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogTestController {

//    private final Logger log = LoggerFactory.getLogger(getClass());  = @Slf4j(어노테이션 시 자동으로 넣어줌)

    @RequestMapping("/log-test")
    public String logTest(){

        String name = "spring";
        System.out.println("name = " + name);

        log.trace("trace log = {}",name);
        log.debug("debug log ={}", name);
        log.info("info log ={}", name);
        log.warn("warn log ={}", name);
        log.error("error log ={}", name);

        return "ok";
    }
}
