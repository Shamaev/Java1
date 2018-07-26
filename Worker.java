package ru.shamaev.HW5;

public class Worker {
    public String name;
    private String post;
    private String email;
    private String phone;
    private int pay;
    private int age;

    public int getAge () {
        return age;
    }

    public Worker (String name, String post, String email, String phone, int pay, int age) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.pay = pay;
        this.age = age;
    }

    public void info () {
        System.out.println("Ful Name: " + name);
        System.out.println("Post: " + post);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Pay: " + pay + " \u20BD");
        System.out.println("Age: " + age);
        System.out.println();
    }
}
