package models;

import entities.User;

import java.util.ArrayList;

public class UserModel {
    private ArrayList<User> userList;

    public UserModel() {
        this.userList = new ArrayList<>();
    }

    public ArrayList<User> getUserList() {
        // tạo bản sao danh sách người dùng và trả về bản sao đó
        ArrayList<User> userListCopy = new ArrayList<>();
        for (User user: userList) {
            userListCopy.add(user.copy());
        }
        return userListCopy;
    }

    public void setUserList(ArrayList<User> userList) {
        this.userList = userList;
    }

    public boolean create(User creatingUser) {
        for (User user: userList) {
            if (user.getId().equals(creatingUser.getId())) {
                return false;
            }
        }
        userList.add(creatingUser);
        return true;
    }

    public boolean update(User updatingUser) {
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getId().equals(updatingUser.getId())) {
                userList.set(i, updatingUser);
                return true;
            }
        }
        return false;
    }

    public User read(User readingUser) {
        for (User user: userList) {
            if (user.getId().equals(readingUser.getId())) {
                return user.copy();
            }
        }
        return null;
    }

    public boolean delete(User deletingUser) {
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getId().equals(deletingUser.getId())) {
                userList.remove(i);
                return true;
            }
        }
        return false;
    }

}
