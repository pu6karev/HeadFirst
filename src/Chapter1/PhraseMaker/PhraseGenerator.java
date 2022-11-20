package Chapter1.PhraseMaker;

public class PhraseGenerator {
    public static void main(String[] args) {

        String[] worldList1 = { "превосходнейший", "изумительный", "3-хметровый", "достаточный",
                                "дрожжевой", "душещипательный", "торжественный"};
        String[] worldList2 = { "отражающий", "усыпляющий", "дающий", "гуляющий", "спящий",
                                "животрепещущий", "очаровывающий", "ужасающий"};
        String[] worldList3 = { "процесс", "тандем", "результат", "прибор", "трансформатор",
                                "генератор", "дуб", "шум"};

        int len1 = worldList1.length;
        int len2 = worldList2.length;
        int len3 = worldList3.length;

        double random1 = Math.random();
        double random2 = Math.random();
        double random3 = Math.random();

        int rand1 = (int) (random1*len1);
        int rand2 = (int) (random2*len2);
        int rand3 = (int) (random3*len3);

        System.out.println(random1 + " " + random2 + " " + random3);
        System.out.println(len1 + " " + len2 + " " + len3);
        System.out.println(rand1 + " " + rand2 + " " + rand3);

        String phrase = worldList1[rand1] + " " + worldList2[rand2] + " " + worldList3[rand3];

        System.out.println("Все что нам нужно - это " + phrase);
    }
}
