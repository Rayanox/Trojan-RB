package rb.hacking.trojan.trojanserver.features.menu;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class MenuConfig {

    @Bean
//    @Qualifier("RootStep")
    public List<MenuRoute> rootStep(@Qualifier("loginStep") List<MenuRoute> loginStep) {
        return loginStep;
    }

    @Bean("loginStep")
    @Qualifier("loginStep")
    public List<MenuRoute> loginStep() {
        return List.of(
                MenuRoute.builder()
                        .labelToDisplay("Login:")
                        .commandExpected("Deconnexion")
                        .build()
        );
    }

    @Bean
    public List<MenuRoute> mainMenuStep() {
        return null;
    }
}
