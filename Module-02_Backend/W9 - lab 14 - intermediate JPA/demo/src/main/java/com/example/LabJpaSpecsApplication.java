package com.example;

import com.example.task.domain.BillableTask;
import com.example.task.domain.InternalTask;
import com.example.task.repo.BillableTaskRepository;
import com.example.task.repo.TaskRepository;
import com.example.pr.domain.Contact;
import com.example.pr.domain.Name;
import com.example.pr.repo.ContactRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.time.LocalDate;

@SpringBootApplication
public class LabJpaSpecsApplication implements CommandLineRunner {

    private final TaskRepository taskRepo;
    private final BillableTaskRepository billableRepo;
    private final ContactRepository contactRepo;

    public LabJpaSpecsApplication(TaskRepository taskRepo,
                                  BillableTaskRepository billableRepo,
                                  ContactRepository contactRepo) {
        this.taskRepo = taskRepo;
        this.billableRepo = billableRepo;
        this.contactRepo = contactRepo;
    }

    public static void main(String[] args) {
        SpringApplication.run(LabJpaSpecsApplication.class, args);
    }

    @Override
    public void run(String... args) {
        BillableTask bt = new BillableTask();
        bt.setTitle("Landing page client A");
        bt.setDueDate(LocalDate.now().plusDays(7));
        bt.setStatus(false);
        bt.setHourlyRate(new BigDecimal("85.00"));
        billableRepo.save(bt);

        InternalTask it = new InternalTask();
        it.setTitle("Refactor build pipeline");
        it.setDueDate(LocalDate.now().plusDays(14));
        it.setStatus(false);
        taskRepo.save(it);

        Name n = new Name();
        n.setSalutation("Sr.");
        n.setFirstName("Carlos");
        n.setMiddleName("M.");
        n.setLastName("Ruiz");
        Contact c = new Contact();
        c.setName(n);
        c.setTitle("PR Manager");
        c.setCompany("Acme Inc.");
        contactRepo.save(c);
    }
}
