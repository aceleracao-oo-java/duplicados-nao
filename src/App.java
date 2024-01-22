import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        // mock dos arrays
        String[] array1 = { "Morango", "Banana", "Maçã", "Uva", "Caqui" };
        // exemplo em que existem elementos comuns
        // String[] array2 = { "Manga", "Caqui", "Morango", "Amora" };
        // elementos em que não existem elementos comuns
        String[] array2 = { "Manga", "Dragonfruit", "Kiwi", "Amora" };

        // acima, comentar um ou outro para teste


        // List para adicionar os elementos comuns entre os arrays
        List<String> commonElements = new ArrayList<>();

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i].equals(array2[j])) {
                    commonElements.add(array1[i]);
                }
            }
        }

        int k = 0;

        if (!commonElements.isEmpty()) {
            while (k < commonElements.size()) {
                System.out.println(commonElements.get(k));
                k++;
            }
        } else {
            System.out.println("Não existe elemento em comum entre os arrays!");
        }

    }
}
