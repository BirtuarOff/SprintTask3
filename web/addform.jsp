<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<form action="/addTask" method="post">
    <div class="modal-body">
        <div class="container">
            <div class="row">
                <div class="col-8 mx-auto">
                    <div class="mt-4">
                        <label>Наименование: </label>
                        <input type="text" name="task_name" class="form-control" placeholder="Наименование...">
                    </div>
                    <div class="mt-3">
                        <label>Описание: </label>
                        <textarea name="task_description" class="form-control" placeholder="Описание..."></textarea>
                    </div>
                    <div class="mt-3">
                        <label>Крайний срок</label>
                        <input type="date" name="task_date" class="form-control" placeholder="date">
                    </div>
                    <div class="row mt-3">
                        <div class="col-12">
                        <label>Выполнено</label>
                        <select class="form-select" aria-label="Default select example">
                            <option selected value="1">Да</option>
                            <option value="2">Нет</option>
                        </select>
                        </div>
                    </div>

                    <div class="row mt-3">
                        <div class="col-12">
                            <button type="button" class="btn btn-primary btn-sm" data-bs-toggle="modal" data-bs-target="#editBook">
                                Сохранить
                            </button>
                            <!-- Button trigger modal -->
                            <button type="button" class="btn btn-danger btn-sm ms-2" data-bs-toggle="modal" data-bs-target="#deleteBook">
                                Удалить
                            </button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</form>