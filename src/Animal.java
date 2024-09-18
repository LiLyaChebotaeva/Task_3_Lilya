// Интерфейс Animal
interface Animal {
    void makeSound();
}

class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Гав-гав-гав!");
    }
}

class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Мяу!");
    }
}

class Cow implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Мууу!");
    }
}