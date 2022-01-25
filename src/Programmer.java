/*
name (имя, строка);
company (имя компании, строка);
position (позиция, строка);
конструктор, принимающий name и company;
метод getPosition(), возвращающий строку — позицию программиста.
метод work(), поднимающий позицию программиста на уровень вверх
(с самого начала (при инициализации)
программист — intern (стажер), потом junior (джуниор), далее middle, senior, lead).
 */
public class Programmer {
    String name;
    String company;
    String position;

    Programmer(String name, String company) {
        this.name = new String(name);
        this.company = new String(company);
        this.position = new String("intern");
    }
    public String getPosition() {
        return this.position;
    }
    public void work() {
        switch (this.position) {
            case "intern":
                this.position = "junior";
                break;
            case "junior":
                this.position = "middle";
                break;
            case "middle":
                this.position = "senior";
                break;
            case "senior":
                this.position = "lead";
                break;
        }
    }
}
