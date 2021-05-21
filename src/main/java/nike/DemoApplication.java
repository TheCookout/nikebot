package nike;

//import nike.proxy.IProxy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.Set;

@SpringBootApplication
public class DemoApplication implements ApplicationRunner {

    private Logger logger = LoggerFactory.getLogger(DemoApplication.class);

    @Value("${role}")
    private  String role;

    @Value("${ipPolicy}")
    private   Integer ipPolicy;

    @Autowired
    RedisTemplate redisTemplate;



    public static void main(String[] args) {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println(">>>>>>>>>>>This is a sample program, severely castrated version....>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Castrated, pass akamai, break akamai, monitoring, hot product replenishment reminder, bot whole process, login and other core modules");
        System.out.println(">>>>>>>>>>>Please contact the author QQ if you need a program:   80258153  >>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println(">>>>>>>>>>>To run this example, please modify the mysql, redis ip port and other configuration information in the configuration file first");
        System.out.println(">>>>>>>>>>>>>>>>Username Password  zuozhe   zuozhe  >>>>>>>>><<<<<<<<<<<<<<");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        //if(ipPolicy!=8888)
        //IProxy.init(ipPolicy);
        //logger.info("initialization IP....");
        //if("platform".equals(role.trim())){
        //    logger.info("Backstage: start to start.");
        //}
    }
}
