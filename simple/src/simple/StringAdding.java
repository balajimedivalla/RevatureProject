package simple;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StringAdding {
    public static void main(String args[]) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        String[] likesInput = reader.readLine().split(" ");
        int[] likes = new int[num];
        for (int i = 0; i < num; i++) {
            likes[i] = Integer.parseInt(likesInput[i]) - 1;
        }
        boolean[] visited = new boolean[num];
        boolean[] inCycle = new boolean[num];
        int maxAttendees = 0;
        for (int i = 0; i < num; i++) {
            if (!visited[i]) {
                int current = i;
                int cycleSize = 0;
                boolean[] cycleVisited = new boolean[num];
                while (!visited[current]) {
                    if (cycleVisited[current]) {
                        int start = current;
                        do {
                            cycleSize++;
                            current = likes[current];
                        } while (current != start);
                        break;
                    }
                    cycleVisited[current] = true;
                    current = likes[current];
                }
                if (cycleSize > 0) {
                    maxAttendees = Math.max(maxAttendees, cycleSize);
                }
                for (int j = 0; j < num; j++) {
                    if (cycleVisited[j]) {
                        visited[j] = true;
                    }
                }
            }
        }
        System.out.println(maxAttendees);
    }
}
