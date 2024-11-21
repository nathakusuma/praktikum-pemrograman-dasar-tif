import java.util.Scanner;

public class RankingHalaman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input jumlah pemain
        int n = sc.nextInt();

        // Input skill ofensif
        int[] offensive = new int[n];
        for (int i = 0; i < n; i++) {
            offensive[i] = sc.nextInt();
        }

        // Input skill defensif
        int[] defensive = new int[n];
        for (int i = 0; i < n; i++) {
            defensive[i] = sc.nextInt();
        }

        // Input jumlah perintah
        int t = sc.nextInt();
        sc.nextLine(); // Consume newline

        for (int commandIndex = 0; commandIndex < t; commandIndex++) {
            String command = sc.nextLine();
            String[] parts = command.split(" ");

            if (parts[0].equals("tampil")) {
                if (parts[1].equals("skill")) {
                    System.out.print("Skill ofensif: ");
                    for (int i = 0; i < n; i++) {
                        System.out.print(offensive[i] + (i == n - 1 ? "\n" : " "));
                    }
                    System.out.print("Skill defensif: ");
                    for (int i = 0; i < n; i++) {
                        System.out.print(defensive[i] + (i == n - 1 ? "\n" : " "));
                    }
                } else if (parts[1].equals("rank")) {
                    int[] offensiveRank = calculateRank(offensive);
                    int[] defensiveRank = calculateRank(defensive);
                    int[] overallRank = calculateOverallRank(offensiveRank, defensiveRank);

                    System.out.print("Rank ofensif: ");
                    for (int i = 0; i < n; i++) {
                        System.out.print(offensiveRank[i] + (i == n - 1 ? "\n" : " "));
                    }
                    System.out.print("Rank defensif: ");
                    for (int i = 0; i < n; i++) {
                        System.out.print(defensiveRank[i] + (i == n - 1 ? "\n" : " "));
                    }
                    System.out.print("Rank overall: ");
                    for (int i = 0; i < n; i++) {
                        System.out.print(overallRank[i] + (i == n - 1 ? "\n" : " "));
                    }
                }
            } else if (parts[0].equals("latih")) {
                int playerIndex = Integer.parseInt(parts[2]) - 1; // Convert to 0-based index
                int points = Integer.parseInt(parts[3]);

                if (parts[1].equals("ofensif")) {
                    offensive[playerIndex] += points;
                    defensive[playerIndex] -= points / 2;
                } else if (parts[1].equals("defensif")) {
                    defensive[playerIndex] += points;
                    offensive[playerIndex] -= points / 2;
                }

                System.out.println("Melatih skill " + parts[1] + " pemain ke-" + (playerIndex + 1) + " sebanyak " + points + " poin");
            }
        }

        sc.close();
    }

    private static int[] calculateRank(int[] skills) {
        int n = skills.length;
        int[] ranks = new int[n];
        int[] indexToRank = new int[101];

        // Sort descending with frequency count (limited range 0-100)
        for (int skill : skills) {
            indexToRank[skill]++;
        }

        int rank = 1;
        for (int i = 100; i >= 0; i--) {
            if (indexToRank[i] > 0) {
                for (int j = 0; j < n; j++) {
                    if (skills[j] == i) {
                        ranks[j] = rank;
                    }
                }
                rank += indexToRank[i];
            }
        }

        return ranks;
    }

    private static int[] calculateOverallRank(int[] offensiveRank, int[] defensiveRank) {
        int n = offensiveRank.length;
        int[] overallRank = new int[n];
        int[] rankSum = new int[n];
        for (int i = 0; i < n; i++) {
            rankSum[i] = offensiveRank[i] + defensiveRank[i];
        }

        int[] indexToRank = new int[201]; // Max rank sum is 100+100

        for (int sum : rankSum) {
            indexToRank[sum]++;
        }

        int rank = 1;
        for (int i = 1; i <= 200; i++) {
            if (indexToRank[i] > 0) {
                for (int j = 0; j < n; j++) {
                    if (rankSum[j] == i) {
                        overallRank[j] = rank;
                    }
                }
                rank += indexToRank[i];
            }
        }

        return overallRank;
    }
}
