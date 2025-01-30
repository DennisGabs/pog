package lista01.questao02;

public class Test {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante("Dennis", 22, "0000000000", "123");
        Estudante estudante2 = new Estudante("Maria", 25, "1111111111111", "124");

        Pessoa pessoas[] = {estudante1, estudante2};


        for(Pessoa p : pessoas){
            System.out.println(p);
        }
    }
}
