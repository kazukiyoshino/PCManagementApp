package com.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private UserDetailsService userDetailsService;
    /**
     * セキュリティ設定を無視するリクエスト設定
     */
    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers(
            "/img/**",
            "/css/**",
            "/js/**",
            "/webjars/**"
            );
    }
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/", "/login")
                .permitAll()
                .anyRequest().authenticated()
                .and()
            .formLogin()
                .loginPage("/login")
                .usernameParameter("username")
                .passwordParameter("password")
                .failureUrl("/login")
                .defaultSuccessUrl("/top",true)
                .permitAll()
                .and()
            .logout()
                // ログアウトでログインページへ
                .logoutSuccessUrl("/login")
                // セッションを破棄
                .invalidateHttpSession(true)
                .permitAll();
    }
    @SuppressWarnings("deprecation")
	@Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        //ＤBでの独自認証
        auth.userDetailsService(userDetailsService)
        .passwordEncoder(NoOpPasswordEncoder.getInstance());
    }

    //AuthenticationManager（認証処理）の設定
    //jdbcAuthentication()を実行したDBから取得するための設定を行う
//    @Override
//    @Autowired
//    protected void configure(AuthenticationManagerBuilder auth)
//            throws Exception {
//        auth.jdbcAuthentication()
//        	.passwordEncoder(new BCryptPasswordEncoder())//passwordの暗号化方式の指定。ここでは推奨されているBCryptを指定
//        	.dataSource(dataSource)//DataSourceの設定
//        	.usersByUsernameQuery(USER_QUERY)//認証情報取得SQLの設定
//        	.authoritiesByUsernameQuery(AUTHORITY_QUERY);//認可情報取得SQLの設定
//    }
}