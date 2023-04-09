package kz.bitlab.db;

import java.util.ArrayList;

public class DBManager {

    private static final ArrayList<Tasks> tasks = new ArrayList<>();

    private static Long id = 6L;

    static {
        tasks.add(
                new Tasks(1L,
                        "Создать Веб приложение на JAVA EE",
                        """
                                Создайте ВЕБ приложение на используя сервлеты и jsp. Проект связан с управлением задач.
                                Разбейте грамотно все страницы по блокам. (include jsp - очень важно!!!)
                                Использовать базу данных не обязательно.""",
                        "23.10.2021",
                        true));
        tasks.add(
                new Tasks(2L,
                        "Убраться дома и закупить продукты",
                        "",
                        "25.10.2021",
                        true));
        tasks.add(
                new Tasks(3L,
                        "Выполнить все домашние задания",
                        "",
                        "28.10.2021",
                        false));
        tasks.add(
                new Tasks(4L,
                        "Записаться на качку",
                        "",
                        "12.12.2021",
                        false));
        tasks.add(
                new Tasks(5L,
                        "Учить Итальянский",
                        "",
                        "01.05.2021",
                        false));
    }


    public static ArrayList<Tasks> getTasks(){
        return tasks;
    }

    public static void addTasks(Tasks task){
        task.setId(id);
        task.setDone(false);
        tasks.add(task);
        id++;
    }

    public static Tasks getTask(long id){
        return tasks.stream()
                .filter(task ->task.getId()==id)
                .findFirst()
                .orElse(null);
    }

    public static void updateTask(Tasks taskNeed){
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getId()==taskNeed.getId()){
                tasks.set(i, taskNeed);
                break;
            }
        }
    }

    public static void deleteTask(long id){
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getId()==id){
                tasks.remove(i);
                break;
            }
        }
    }

}
