package lista01.questao01;

public class Test {
    public static void main(String[] args) {
        Animal animais[] = {new Cachorro(), new Gato()};
        for(Animal animal : animais){
            animal.fazerSom();
        }
    }
}
