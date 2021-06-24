package cn.han.start.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author hanp
 * @title: HanProperties
 * @description: TODO
 * @date 2021/4/9 0009
 */
@ConfigurationProperties(prefix = "han.start")
public class HanProperties {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    @Override
    public String toString() {
        return "HanProperties{" +
                "name='" + name + '\'' +
                '}';
    }
}
