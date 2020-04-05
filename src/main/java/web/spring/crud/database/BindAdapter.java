package web.spring.crud.database;

import web.spring.crud.entity.User;

import java.util.List;

interface BindAdapter {

     void createUser(User user);

     User getUser(int id);

     void updateUser(User user);

     void deleteUser(int id);

     List<User> getAllUsers();

     int getUserAmount();
}
