import java.util.ArrayList;

public class Theatre {
    public static void main(String[] args) {
        Actor actor1 = new Actor("Анна", "Иванова", Gender.FEMALE, 1.68);
        Actor actor2 = new Actor("Пётр", "Смирнов", Gender.MALE, 1.80);
        Actor actor3 = new Actor("Мария", "Орлова", Gender.FEMALE, 1.72);

        Person musicAuthor = new Person("Пётр", "Чайковский", Gender.MALE);
        Person choreographer = new Person("Мариус", "Петипа", Gender.MALE);

        Director director1 = new Director("Олег", "Волков", Gender.MALE, 12);
        Director director2 = new Director("Елена", "Лебедева", Gender.FEMALE, 7);

        Show show = new Show("Ревизор", 150, director1, new ArrayList<>());
        Opera opera = new Opera("Евгений Онегин", 180, director2, new ArrayList<>(),
                musicAuthor, "Текст либретто оперы", 40);
        Ballet ballet = new Ballet("Лебединое озеро", 140, director1, new ArrayList<>(),
                musicAuthor, "Текст либретто балета", choreographer);

        show.addActor(actor1);
        show.addActor(actor2);

        opera.addActor(actor2);
        opera.addActor(actor3);

        ballet.addActor(actor1);
        ballet.addActor(actor3);

        System.out.println("\n=== Обычный спектакль ===");
        System.out.println(show);
        System.out.println("\n=== Балет ===");
        System.out.println(ballet);
        System.out.println("\n=== Опера ===");
        System.out.println(opera);

        System.out.println("\n=== Замена актёра Иванова в обычном спектакле на Орлова ===");
        show.replaceActor(actor3, "Иванова");
        System.out.println(show);

        System.out.println("\n=== Замена актёра Новик в балете Смирнов ===");
        ballet.replaceActor(actor2, "Новик");
        System.out.println(ballet);

        System.out.println("\n=== Либретто ===");
        System.out.println(opera.getLibrettoText());
        System.out.println(ballet.getLibrettoText());
    }
}
