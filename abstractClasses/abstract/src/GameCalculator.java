public abstract class GameCalculator {
    // abstract operasyonun desteklenmesi için sınıfın abstract olması gerekir
    // abstract class abstract operasyon içermeyebilir.
    // kim implemente ediyorsa hesaplayı içermek zorunda
    // hesaplayı overriding etmek zorunda kendisine göre ayarlayacak
    public abstract void hesapla();

    // gamecalculator kullanılırken gameover olduğu gibi kullanılmak zorunda
    public final void gameOver(){
        System.out.println("oyun bitti");
    }
}
