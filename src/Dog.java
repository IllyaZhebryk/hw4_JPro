public class Dog extends Animals{
    Dog (int runDistance, int swimDistance){

    }
    @Override
    public void swim() {
        System.out.printf("Пливу %d і сподіваюсь, що ширина річки не більше 10 метрів. Бо утону, будеш плакати.", swimDistance);
    }

    @Override
    public void run() {
        System.out.println("Пробіжу десь до 500 метрів, потім треба буде відхекатись.", runDistance);
    }
}
