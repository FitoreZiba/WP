package mk.ukim.finki.wp.lab;

import mk.ukim.finki.wp.lab.service.BookService;
import mk.ukim.finki.wp.lab.web.BookListServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.thymeleaf.spring6.SpringTemplateEngine;

@SpringBootApplication
@ServletComponentScan
public class Lab1Application {

    public static void main(String[] args) {
        SpringApplication.run(Lab1Application.class, args);

    }
    @Bean
    public ServletRegistrationBean<BookListServlet> bookListServlet(SpringTemplateEngine templateEngine,
                                                                    BookService bookService) {
        ServletRegistrationBean<BookListServlet> servlet =
                new ServletRegistrationBean<>(new BookListServlet(templateEngine, bookService), "/");
        return servlet;
    }

}
