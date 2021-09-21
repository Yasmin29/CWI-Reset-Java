package ResetModulo3;

public class InformacaoMario {
    public static void main(String[] args) {
        Mario mario = new Mario("Mario", 40,1.60);
        Luigi luigi = new Luigi("Luigi", 90,1.80);
        Yoshi yoshi = new Yoshi("Yoshi", 8000000,3.00);

        mario.crescer();
        yoshi.crescer();
        luigi.crescer();
        mario.saltar();
        mario.saltar(2.00);
        luigi.saltar();


    }
}
