// Дополните объявление класса Contact
public abstract class Contact {
    // Класс должен содержать одно полe - имя пользователя name
    String name;

    public Contact(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // И два метода -
    public void sendMessage() {

    }
    public void print() {

    }
}
