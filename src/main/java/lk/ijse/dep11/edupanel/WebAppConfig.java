package lk.ijse.dep11.edupanel;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@ComponentScan
@Configuration
@EnableWebMvc
public class WebAppConfig {
@Bean
public StandardServletMultipartResolver multipartResolver(){  //to deal with multipart value data
    return  new StandardServletMultipartResolver();
}
}