package ch03.method_reference;

public class Duckling {
    public static void makeSound(String sound) {
        //LearnToSpeak learnToSpeak = s -> System.out.println(s);
        //improvement using method reference
        LearnToSpeak learnToSpeak = System.out::println;
        DuckHelper.teacher(sound, learnToSpeak);
    }
}
