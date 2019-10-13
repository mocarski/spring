package com.jm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JpaController {
    @Autowired
    public TaskRepository taskRepository;

    @RequestMapping("/db")
    @ResponseBody
    public String testMethod() {
        StringBuilder response = new StringBuilder();

        Task task = new Task()
                .withId(1)
                .withName("Task 1");
        taskRepository.save(task);

        for(Task i: taskRepository.findAll()) {
            response.append(i).append("<br>");
        }

        return response.toString();
    }
}
