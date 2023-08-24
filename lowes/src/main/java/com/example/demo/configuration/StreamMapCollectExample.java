package com.example.demo.configuration;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapCollectExample {
    public static void main(String[] args) {
        List<User> userList= new ArrayList<User>();
        userList.add(new User(1, "Ramesh","secrete","ramesh@gmail.com"));
        userList.add(new User(2, "kiran","secrete","kiran@gmail.com"));
        userList.add(new User(3, "satish","secrete","satish@gmail.com"));

        // without stream
        List<UserDTO> userListDTO= new ArrayList<UserDTO>();
        for (User user: userList) {
            userListDTO.add(new UserDTO(user.getId(),user.getUserName(), user.getEmail()));
        }
        userListDTO.forEach(System.out::println);
        System.out.println("**************");

        // using stream().map()
        List<UserDTO> userDTOList=userList.stream().map((User user)->(new UserDTO(user.getId(),user.getUserName(), user.getEmail()))).collect(Collectors.toList());
        userDTOList.forEach(System.out::println);
    }
}

class UserDTO{
    private int id;
    private String userName;
    private String email;

    public UserDTO(int id, String userName, String email) {
        this.id = id;
        this.userName = userName;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "userDTO{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
class User{
    private int id;
    private String userName;
    private String userPassword;
    private String email;

    public User(int id, String userName, String userPassword, String email) {
        this.id = id;
        this.userName = userName;
        this.userPassword = userPassword;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}