package ltd.newbee.mall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("ltd.newbee.mall.dao")
@SpringBootApplication
public class OnlineGameApplication {
    public static void main(String[] args) {
        SpringApplication.run(OnlineGameApplication.class, args);
    }
}
