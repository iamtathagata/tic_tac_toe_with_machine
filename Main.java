import java.util.*;

class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner scan = new Scanner(System.in);
            Random rand = new Random();
            int[][] gameBoard = new int[3][3];
            int x = 0;
            int y = 0;
            int player = 1;
            int win = 0;
            int empty = 0;
            for (int q = 1; q > 0; q++) {
                if (player == 1) {
                    print(gameBoard);
                }
                if (player == 1) {
                    System.out.println("Player's turn.");
                    while (true) {
                        while (true) {
                            System.out.print("x: ");
                            x = scan.nextInt();
                            if (x > 0 && x < 4) {
                                x--;
                                break;
                            } else {
                                System.out.println("That number is not in the range of 1-3");
                            }
                        }
                        while (true) {
                            System.out.print("y: ");
                            y = scan.nextInt();
                            if (y > 0 && y < 4) {
                                y--;
                                break;
                            } else {
                                System.out.println("That number is not in the range of 1-3");
                            }
                        }
                        if (gameBoard[x][y] > 0) {
                            System.out.println("That space is full.");
                        } else {
                            break;
                        }
                    }
                    gameBoard[x][y] = 1;
                    System.out.println("");
                }
                if (player == 2) {
                    // AI
                    while (true) {
                        x = rand.nextInt(3);
                        y = rand.nextInt(3);
                        for (int w = 0; w < 3; w++) {
                            if (gameBoard[0][w] == gameBoard[1][w] && gameBoard[0][w] > 0 && gameBoard[2][w] == 0) {
                                x = 2;
                                y = w;
                            }
                            if (gameBoard[0][w] == gameBoard[2][w] && gameBoard[0][w] > 0 && gameBoard[1][w] == 0) {
                                x = 1;
                                y = w;
                            }
                            if (gameBoard[1][w] == gameBoard[2][w] && gameBoard[2][w] > 0 && gameBoard[0][w] == 0) {
                                x = 0;
                                y = w;
                            }
                            if (gameBoard[w][0] == gameBoard[w][1] && gameBoard[w][0] > 0 && gameBoard[w][2] == 0) {
                                x = w;
                                y = 2;
                            }
                            if (gameBoard[w][0] == gameBoard[w][2] && gameBoard[w][0] > 0 && gameBoard[w][1] == 0) {
                                x = w;
                                y = 1;
                            }
                            if (gameBoard[w][1] == gameBoard[w][2] && gameBoard[w][2] > 0 && gameBoard[w][0] == 0) {
                                x = w;
                                y = 0;
                            }
                            if (gameBoard[0][0] == gameBoard[1][1] && gameBoard[0][0] > 0 && gameBoard[2][2] == 0) {
                                x = 2;
                                y = 2;
                            }
                            if (gameBoard[0][0] == gameBoard[2][2] && gameBoard[0][0] > 0 && gameBoard[1][1] == 0) {
                                x = 1;
                                y = 1;
                            }
                            if (gameBoard[1][1] == gameBoard[2][2] && gameBoard[2][2] > 0 && gameBoard[0][0] == 0) {
                                x = 0;
                                y = 0;
                            }
                            if (gameBoard[2][0] == gameBoard[1][1] && gameBoard[2][0] > 0 && gameBoard[0][2] == 0) {
                                x = 0;
                                y = 2;
                            }
                            if (gameBoard[2][0] == gameBoard[2][2] && gameBoard[2][0] > 0 && gameBoard[1][1] == 0) {
                                x = 1;
                                y = 1;
                            }
                            if (gameBoard[1][1] == gameBoard[0][2] && gameBoard[0][2] > 0 && gameBoard[2][0] == 0) {
                                x = 2;
                                y = 0;
                            }
                        }
                        if (gameBoard[x][y] == 0) {
                            break;
                        }
                    }
                    gameBoard[x][y] = 2;
                }
                if (player == 1) {
                    player = 2;
                } else {
                    player = 1;
                }
                for (int i = 0; i < 3; i++) {
                    if (gameBoard[0][i] == gameBoard[1][i] &&
                            gameBoard[2][i] == gameBoard[1][i]
                            && gameBoard[1][i] != 0) {
                        if (gameBoard[1][i] == 1) {
                            print(gameBoard);
                            System.out.println("Player wins");
                            System.out.println();
                            q = -1;
                            win = 1;
                        }
                        if (gameBoard[1][i] == 2) {
                            print(gameBoard);
                            System.out.println("AI wins");
                            System.out.println();
                            q = -1;
                            win = 1;
                        }
                    } else if (gameBoard[i][0] == gameBoard[i][1] && gameBoard[i][2] == gameBoard[i][1]
                            && gameBoard[i][1] != 0) {
                        if (gameBoard[i][1] == 1) {
                            print(gameBoard);
                            System.out.println("Player wins");
                            System.out.println();
                            q = -1;
                            win = 1;
                        }
                        if (gameBoard[i][1] == 2) {
                            print(gameBoard);
                            System.out.println("AI wins");
                            System.out.println();
                            q = -1;
                            win = 1;
                        }
                    } else if (gameBoard[0][0] == gameBoard[1][1] && gameBoard[2][2] == gameBoard[1][1]
                            && gameBoard[1][1] != 0) {
                        if (gameBoard[1][1] == 1) {
                            print(gameBoard);
                            System.out.println("Player wins");
                            System.out.println();
                            q = -1;
                            win = 1;
                        }
                        if (gameBoard[1][1] == 2) {
                            print(gameBoard);
                            System.out.println("AI wins");
                            System.out.println();
                            q = -1;
                            win = 1;
                        }
                    } else if (gameBoard[2][0] == gameBoard[1][1] && gameBoard[0][2] == gameBoard[1][1]
                            && gameBoard[1][1] != 0) {
                        if (gameBoard[1][1] == 1) {
                            print(gameBoard);
                            System.out.println("Player wins");
                            System.out.println();
                            q = -1;
                            win = 1;
                        }
                        if (gameBoard[1][1] == 2) {
                            print(gameBoard);
                            System.out.println("AI wins");
                            System.out.println();
                            q = -1;
                            win = 1;
                        }
                    } else {
                        win = 2;
                    }
                }
                for (int t = 0; t < 3; t++) {
                    for (int o = 0; o < 3; o++) {
                        if (gameBoard[t][o] > 0 && win != 1) {
                            empty = 1;
                        } else {
                            empty = 0;
                            t = 4;
                            o = 4;
                        }
                    }
                }
                if (empty == 1) {
                    print(gameBoard);
                    System.out.println("There is a tie");
                    System.out.println();
                    q = -1;
                }
            }
        }
    }

    public static void print(int gameBoard[][]) {
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                if (gameBoard[x][y] == 0) {
                    System.out.print(" ");
                }
                if (gameBoard[x][y] == 1) {
                    System.out.print("X");
                }
                if (gameBoard[x][y] == 2) {
                    System.out.print("O");
                }
                if (x < 2) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (y < 2) {
                System.out.println("-----");
            }
        }
    }
}
