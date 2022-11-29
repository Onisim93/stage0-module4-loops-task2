package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        int index = 0;
        StringBuilder sb = new StringBuilder();
        while (index < chars.length) {
            sb.append(chars[index++]);
        }

        System.out.print(sb);
    }
}
