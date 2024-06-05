package ru.netology;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.Name = "Иван";
        post.Surname = "Иванов";
        post.Patronymic = "Иванович";
        post.Passport ="4444 № 444444" ;
        post.Phone = "+79999999999 " ;
        post.Subscription = true;

        FormDate formDate = new FormDate();
        formDate.Date = 13;
        formDate.Month = 6;
        formDate.Year = 1999;


    }


}