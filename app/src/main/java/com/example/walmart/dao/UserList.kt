package com.example.walmart.dao

import com.example.walmart.domain.User


class UserList{

    //create an ArrayList for the type of User, and store at least five users to validate login

    val userList: ArrayList<User> = ArrayList<User>()

    constructor(){
        userList.add(User("samiksha@gmail.com", "samik", "Samiksha", "Gautam"))
        userList.add(User("ram@gmail.com","ram","Ram","Shrestha"))
        userList.add(User("shire@gmail.com","shire","Shire","Pandey"))
        userList.add(User("sita@gmail.com","sita","Sita","Shah"))
        userList.add(User("tony@stark.com","tony","Tony","Stark"))
    }

    //getUserByUsernameAndPassword - if user exist with that username & password, return user
    //else return null

    fun getUserByUsernameAndPassword(username:String, password: String): User? {
        for(user in userList){
            if (user.username.equals(username) && user.password.equals(password))
                return user
        }
        return null
    }

    //add new User to arraylist 'userList'
    fun addUser(user: User){
        userList.add(user)
    }

}