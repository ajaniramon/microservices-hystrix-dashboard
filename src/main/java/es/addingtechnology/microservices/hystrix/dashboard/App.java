/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.addingtechnology.microservices.hystrix.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 *
 * @author ramon
 */
@SpringBootApplication
@EnableHystrixDashboard
public class App {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
    
}
