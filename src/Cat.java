public class Cat extends Animals{
    public Cat(int runDistance) {
    }

    @Override
    public void swim() {
        System.out.println("Ти крейзі? Коти не плавають!");
    }

    @Override
    public void run() {

        System.out.println("Я біжу, але не більше, ніж 200 метрів. Назад ти мене на руках принесеш.");
    }
}
