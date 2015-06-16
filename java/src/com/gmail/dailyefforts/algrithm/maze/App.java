package com.gmail.dailyefforts.algrithm.maze;

import java.util.ArrayList;
import java.util.List;

public class App {
    private static class PosStack {
        private final List<Pos> list = new ArrayList<Pos>();

        public void clear() {
            list.clear();
        }

        public void push(int row, int col) {
            list.add(new Pos(row, col));
        }

        public boolean isEmpty() {
            return list.size() == 0;
        }

        public Pos peek() {
            final int size = list.size();
            if (size == 0) {
                return null;
            }
            return list.get(size - 1);
        }

        public Pos pop() {
            final int size = list.size();
            if (size == 0) {
                return null;
            }
            return list.remove(size - 1);
        }

        @Override
        public String toString() {
            StringBuilder buf = new StringBuilder();
            for (Pos p : list) {
                if (marked[p.row][p.col]) {
                    buf.append(String.format("(%d, %d) ", p.row, p.col));
                }
            }
            return buf.toString();
        }
    }

    private static class Pos {
        int row;
        int col;

        public Pos(int row, int col) {
            this.row = row;
            this.col = col;
        }

        @Override
        public String toString() {
            return String.format("(%d, %d)", row, col) + marked[row][col];
        }
    }

    private static final int M = 30;
    private static final int N = 27;
    private static int[][] m = {
            {0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    };
    private static boolean[][] marked = new boolean[M][N];
    private Pos end = new Pos(29, 26);

    final List<Pos> list = new ArrayList<Pos>();

    private void dfs(int row, int col) {
        if (row < 0 || row >= M || col < 0 || col >= N) {
            return;
        }

        if (marked[row][col]) {
            return;
        }

        marked[row][col] = true;
        if (row == end.row && col == end.col) {
            for (int r = 0; r < M; r++) {
                for (int c = 0; c < N; c++) {
                    System.out.print(marked[r][c] + "\t");
                }
                System.out.println();
            }
            return;
        }

        dfs(row, col + 1);
        dfs(row + 1, col);
        dfs(row, col - 1);
        dfs(row - 1, col);
    }

    private boolean tryPush(int row, int col) {
        if (row < 0 || row >= M || col < 0 || col >= N) {
            return false;
        }
        if (m[row][col] == 1) {
            return false;
        }
        if (marked[row][col]) {
            return false;
        }
        stack.push(row, col);
        if (row == end.row && col == end.col) {
            return true;
        }
        return false;
    }

    private PosStack stack = new PosStack();

    private void resolve() {
        stack.push(0, 0);
        while (!stack.isEmpty()) {
            Pos pos = stack.peek();
            if (!marked[pos.row][pos.col]) {
                marked[pos.row][pos.col] = true;
            }
            boolean done = tryPush(pos.row, pos.col + 1);
            if (!done) {
                done = tryPush(pos.row + 1, pos.col);
            }
            if (!done) {
                done = tryPush(pos.row, pos.col - 1);
            }
            if (!done) {
                done = tryPush(pos.row - 1, pos.col);
            }
            Pos p = stack.peek();
            if (p == pos || done) {
                if (done) {
                    marked[p.row][p.col] = true;
                    System.out.println(stack);
                }
                while (p != null && marked[p.row][p.col]) {
                    p = stack.pop();
                    marked[p.row][p.col] = false;
                    p = stack.peek();
                }
            }
        }
    }


    public static void main(String[] args) {
        final Pos start = new Pos(0, 0);
        final App app = new App();
//        app.dfs(start.row, start.col);
        app.resolve();
    }
}
