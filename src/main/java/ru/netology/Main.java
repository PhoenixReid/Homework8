package ru.netology;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.surname = "Иванов";
        post.patronymic = "Иванович";
        post.passport = "4444 № 44444444";
        post.phone = "+79999999999 ";
        post.subscription = true;

        FormDate formDate = new FormDate();
        formDate.date = 13;
        formDate.month = 6;
        formDate.year = 1999;


    }


}