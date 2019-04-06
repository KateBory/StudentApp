package com.company;

public class Student {
    private String name;
    private  int rating;

    public String getName(){
        return name;
    }

    public void setName(String a){
        name=a;
    }

    public int getRating(){
        return rating;
    }

    public void setRating(int a){
        rating=a;
    }

  public Student (String name, int rating){
       this.name = name;
        this.rating = rating;
  }

    public Student (){

    }

    public String toString (){
        return String.format("Name: %s, Rating: %d", name, rating);
    }

    public  void  changeRating (int rating) {
        this.rating = rating;
    }

    public boolean betterStudent (Student s){
        return this.rating > s.rating;
    }

}
