package com.practice.pointers;




public class Person {
    private String name;
    private int age;
    /*Variable for Practice Exercise*/
    private Person toldTo;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /** setter function to change the name, requires the old name and the new name*/
    public void setName(String name, String newName) {
        if (this.name.equals(name)) {
            this.name = newName;
        }
    }

    public String getName () {
        return this.name;
    }

    public void setToldTo(Person newToldTo) {
            this.toldTo = newToldTo;
    }

    public String getToldTo() {
        if (this.toldTo == null) {
            return this.name +  " didn't told anybody";
        }

        return this.name + " Told to: " + this.toldTo.name;

    }




    @Override
    public String toString() {
        return name + " " + age + " " + (toldTo != null ? toldTo.name : null );
    }
}
