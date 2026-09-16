public class Leao extends Animal{
    public Leao(String nome, int idade, double peso, String raca){
        super(nome, idade, peso, raca);
    }

    @Override
    public void falar() {
        System.out.println("Raaaaaaaw");
    }
}
