package cn.han.start.configure;

import cn.han.start.properties.HanProperties;
import cn.han.start.server.DemoServer;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author hanp
 * @title: HanConfigure
 * @description: TODO
 * @date 2021/4/9 0009
 */
@Configuration
@EnableConfigurationProperties(HanProperties.class)
public class HanAutoConfigure {

    private final HanProperties properties;

    public HanAutoConfigure(HanProperties properties){
        this.properties = properties;
    }

    @Bean
    public DemoServer demoServer(){
        System.out.println(properties.getName());
        return new DemoServer();
    }
}
