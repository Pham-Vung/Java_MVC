package controllers;

import entities.User;
import models.UserModel;

public class UserController {
    private UserModel userModel;

    public UserController() {
        this.userModel = new UserModel();
    }

    public UserModel getUserModel() {
        return userModel;
    }

    public void setUserModel(UserModel userModel) {
        this.userModel = userModel;
    }

    public void create(User creatingUser) {
        if (userModel.create(creatingUser)) {
            System.out.println("Create success!");
        } else {
            System.out.println("Create failed!");
        }
    }

    public void update(User updatingUser) {
        if (userModel.update(updatingUser)) {
            System.out.println("Update success!");
        } else {
            System.out.println("Update failed!");
        }
    }

    public void read(User readingUser) {
        User user = userModel.read(readingUser);
        if (user != null) {
            System.out.println(user);
        } else {
            System.out.println("Read failed!");
        }
    }

    public void delete(User deletingUser) {
        if (userModel.delete(deletingUser)) {
            System.out.println("Delete success!");
        } else {
            System.out.println("Delete failed!");
        }
    }

    public void showAll() {
        for (User user : userModel.getUserList()) {
            System.out.println(user);
        }
    }
}
