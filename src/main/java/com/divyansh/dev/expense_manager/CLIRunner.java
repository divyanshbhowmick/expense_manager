package com.divyansh.dev.expense_manager;

import com.divyansh.dev.expense_manager.service.TestService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CLIRunner implements CommandLineRunner {

    public TestService service;

    public CLIRunner(TestService service) {
        this.service = service;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello world!!");
    }
}
