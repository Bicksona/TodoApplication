package com.todo.todoApplication.Controller;

import com.todo.todoApplication.Model.Task;
import com.todo.todoApplication.Service.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/tasks")
public class TaskController {
    private TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }
    public String getTasks(Model model){
        List<Task> tasks = taskService.getTasks();
        model.addAttribute("tasks",tasks);
        return"tasks";
    }
}
