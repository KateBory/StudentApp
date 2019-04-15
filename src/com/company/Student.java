package com.company;

public class Student {
    private static int numberOfStudents = 0;
    private static int sumRating = 0;
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

    public void setRating(int rating){
        sumRating = sumRating - this.rating + rating;
        this.rating = rating;

    }

  public Student (String name){
        this ();
        this.name = name;


     //   this.rating = rating;
  }

    public Student (){
        numberOfStudents ++;

    }


    public String toString (){
        return String.format("Name: %s, Rating: %d", name, rating);
    }

    public  void  changeRating (int rating) {
        sumRating = sumRating - this.rating + rating;
        this.rating = rating;
    }

    public boolean betterStudent (Student s){
        return this.rating > s.rating;
    }

    public static double getAverageRating (Student[] students) {
        int sum = 0;
        for (int i = 0; i < students.length; i++){
           sum = sum + students[i].rating;

            System.out.println(students[i].toString());


        }

        return (double) sum / students.length;
    }

    public static double getAvgRating() {
        if (numberOfStudents == 0) {
            return 0;
        } else
            return (double) sumRating / numberOfStudents;
    }

    public static void removeStudent(Student student) {
        numberOfStudents --;
        sumRating = sumRating - student.rating;

    }
}
