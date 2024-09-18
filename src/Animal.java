// Интерфейс Animal
interface Animal {
    void makeSound();
}

// Класс Dog, реализующий интерфейс Animal
class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Гав-гав-гав!");
    }
}

// Класс Cat, реализующий интерфейс Animal
class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Мяу!");
    }
}

// Класс Cow, реализующий интерфейс Animal
class Cow implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Мууу!");
    }
}