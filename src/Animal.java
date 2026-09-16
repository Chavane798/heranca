public class Animal {

    private String nome;
    private int idade;
    private double peso;
    private String raca;

    public Animal(String nome, int idade, double peso, String raca){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }

    public String getRaca() {
        return raca;
    }

    public  String getNome(){
        return nome;
    }

    public void falar(){
        System.out.println("Ele fala");
    }
}
