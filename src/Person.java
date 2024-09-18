class Person {
    private String name;
    private int age;
    private String gender;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void displayInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Пол: " + gender);
    }

    public void increaseAge() {
        age++;
        System.out.println("Возраст увеличен. Новый возраст: " + age);
    }

    public void changeName(String newName) {
        this.name = newName;
        System.out.println("Имя изменено на: " + name);
    }
}
