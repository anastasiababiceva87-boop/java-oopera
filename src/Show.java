import java.util.ArrayList;

public class Show {
    private String title;
    private int duration;
    private Director director;
    private ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public Director getDirector() {
        return director;
    }

    public void replaceActor(Actor newActor, String surname) {
        for (Actor actor : listOfActors) {
            if (actor.getSurname().equals(surname)) {
                listOfActors.remove(actor);
                listOfActors.add(newActor);
                System.out.println("Актер был заменен");
                return;
            }
        }
        System.out.println("Актера с такой фамилией нет в списках");
    }

    public boolean addActor(Actor newActor) {
        if (listOfActors.contains(newActor)) {
            System.out.println("Этот актер уже есть в списках");
            return false;
        }
        listOfActors.add(newActor);
        return true;
    }

    private String actorsToString() {
        String result = "";
        for (Actor actor : listOfActors) {
            result += "\n" + actor;
        }
        return result;
    }

    @Override
    public String toString() {
        return "Спектакль: " + title +
                ", длительность: " + duration +
                ", режиссёр: " + director.getName() + " " + director.getSurname() +
                "\nАктёры:" + actorsToString();
    }
}
