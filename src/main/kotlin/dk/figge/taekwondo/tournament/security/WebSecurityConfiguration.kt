package dk.figge.taekwondo.tournament.security

import org.springframework.context.annotation.Configuration
import org.springframework.http.HttpMethod
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter

@Configuration
@EnableWebSecurity
class WebSecurityConfiguration : WebSecurityConfigurerAdapter() {


    override fun configure(http: HttpSecurity) {
        http.authorizeRequests().antMatchers(HttpMethod.POST, "/accounts").permitAll().anyRequest().authenticated()
        http.csrf().disable()
    }

    override fun configure(auth: AuthenticationManagerBuilder) {
        //This code sets up a user store in memory. This is
        //useful for debugging and development
        auth
                .inMemoryAuthentication()
                .withUser("bob")
                .password("belcher")
                .roles("USER")
                .and()
                .withUser("admin")
                .password("admin")
                .roles("USER", "ADMIN")
    }

}