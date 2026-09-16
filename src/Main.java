//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Leao animal1 = new Leao("Simba", 45, 90, "Rei");
        LeoPardo animal2 = new LeoPardo("Jenifa", 15, 300, "Gatinho");
        Cao animal3= new Cao("Gervasio", 9, 20, "Rafeiro");

        System.out.println("Nome: " + animal1.getNome());
        System.out.println("idade: " + animal1.getIdade());
        System.out.println("peso: " + animal1.getPeso());
        System.out.println("Raca: " + animal1.getRaca());
        animal1.falar();

        System.out.println("Nome: " + animal2.getNome());
        System.out.println("idade: " + animal2.getIdade());
        System.out.println("peso: " + animal2.getPeso());
        System.out.println("Raca: " + animal2.getRaca());
        animal2.falar();

    }
}