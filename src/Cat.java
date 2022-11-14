public class Cat extends Animals{
    public Cat(int runCat) {
        this.runCat = runCat;
    }

    @Override
    public void swim() {
        System.out.println("Ти крейзі? Коти не плавають!");
    }

    @Override
    public void run() {

        System.out.println("Я побіжу на %d метрів, і сподіваюсь, що це не більше 200 метрів. Назад ти мене на руках принесеш.", runCat);
    }
}
