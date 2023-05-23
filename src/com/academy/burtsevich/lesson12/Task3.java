package com.academy.burtsevich.lesson12;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        ArrayDeque<Character> bracketsQueue = getBracketsQueue(s);
        System.out.println(isRightBracketsDisposition(bracketsQueue));
    }

    private static ArrayDeque<Character> getBracketsQueue(String s) {
        ArrayDeque<Character> queue = new ArrayDeque<>();
        List<Character> characters = new ArrayList<>(Arrays.asList('(', ')', '{', '}', '[', ']'));
        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            for (char b : characters) {
                if (Objects.equals(c, b)) {
                    queue.addLast(c);
                }
            }
        }
        return queue;
    }


    private static boolean isRightBracketsDisposition(ArrayDeque<Character> queue) {

        boolean flag = true;
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        ArrayDeque<Character> tempQueue = new ArrayDeque<>();
        Iterator<Character> iterator = queue.iterator();

        if (queue.size() > 0 && queue.size() % 2 == 0
                && map.containsKey(queue.peekFirst())
                && !map.containsKey(queue.peekLast())) {

            while (iterator.hasNext()) {
                if (map.containsKey(queue.peekFirst())) {
                    tempQueue.addLast(iterator.next());
                } else {
                    Iterator<Character> iteratorTemp = tempQueue.iterator();
                    while (iteratorTemp.hasNext()) {
                        if (Objects.equals(iterator.next(), map.get(iteratorTemp.next()))) {
                            iteratorTemp.remove();
                        } else {
                            flag = false;
                            break;
                        }
                    }
                }
            }
        } else {
            flag = false;
        }
        return flag;
    }
}




