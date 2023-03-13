package org.example.mvc;

public class Controller {
    Person person;
    View view;

    public Controller(Person person, View view){
        this.person = person;
        this.view = view;
    }

    public void updateView(){
        view.update(person.getName());
    }


}
