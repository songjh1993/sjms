package example;

/**
 * @auther: abird
 * @date: 2019/05/05
 * @Description: 备忘录管理员
 */
public class Caretaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
