package hw_7;

import java.util.ArrayDeque;
import java.util.Deque;

/*
7. Проверка корректности скобочной последовательности
Задача:
Определить, правильно ли расставлены скобки.
 */
public class CheckingCorrectnessParenthesisSequence {
    private final Deque<Character> stringStack;

    public CheckingCorrectnessParenthesisSequence() {
        this.stringStack = new ArrayDeque<>();
    }

    public void elementAnalysis(String element) {
        for (char ch : element.toCharArray()) {
            switch (ch) {
                case '{', '[', '(' -> stringStack.add(ch);
                case '}' -> {
                    if (!stringStack.isEmpty() && stringStack.getLast() == '{') {
                        stringStack.removeLast();
                    }
                }
                case ']' -> {
                    if (!stringStack.isEmpty() && stringStack.getLast() == '[') {
                        stringStack.removeLast();
                    }
                }
                case ')' -> {
                    if (!stringStack.isEmpty() && stringStack.getLast() == '(') {
                        stringStack.removeLast();
                    }
                }
            }
        }
        System.out.println("Правильная последовательность скобок ? " + stringStack.isEmpty());
        stringStack.clear();
    }

}
