package kz.bitlab.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kz.bitlab.db.DBManager;
import kz.bitlab.db.Tasks;

import java.io.IOException;

@WebServlet(value = "/save-task")
public class SaveTaskServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        long id = Long.parseLong(request.getParameter("task_id"));
        String name = request.getParameter("task_name");
        String description = request.getParameter("task_description");
        String deadlineDate = request.getParameter("task_deadline");
        boolean isDone = Boolean.parseBoolean(request.getParameter("task_done"));

        Tasks newTask = DBManager.getTask(id);
        newTask.setName(name);
        newTask.setDescription(description);
        newTask.setDeadlineDate(deadlineDate);
        newTask.setDone(isDone);

        DBManager.updateTask(newTask);
        response.sendRedirect("/details?task_id=" + id);
    }
}
