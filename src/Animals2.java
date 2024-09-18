public class Animals2 {
    public void move(){
    }

    class Fish extends Animals2{
        @Override
        public void move() {
            System.out.println("Рыба плавает");
        }
    }

    class Bird extends Animals2{
        @Override
        public void move() {
            System.out.println("Птица летает");
        }
    }

    class Dog extends Animals2 {
        @Override
        public void move() {
            System.out.println("Собака бегает");
        }
    }
}
