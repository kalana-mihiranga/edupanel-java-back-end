package lk.ijse.dep11.edupanel;


import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebRootConfig {
    public HikariDataSource dataSource(En){
        return new HikariDataSource();

    }
}