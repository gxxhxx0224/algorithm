import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input Yeondoo's name
        String yeondooName = scanner.nextLine();

        // Input number of team name candidates
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        // Input team names
        String[] teamNames = new String[n];
        for (int i = 0; i < n; i++) {
            teamNames[i] = scanner.nextLine();
        }

        String bestTeamName = "";
        int highestScore = -1;

        for (String teamName : teamNames) {
            // Calculate L, O, V, E counts
            int l = countCharacter(yeondooName + teamName, 'L');
            int o = countCharacter(yeondooName + teamName, 'O');
            int v = countCharacter(yeondooName + teamName, 'V');
            int e = countCharacter(yeondooName + teamName, 'E');

            // Calculate the score
            int score = ((l + o) * (l + v) * (l + e) * (o + v) * (o + e) * (v + e)) % 100;

            // Update the best team name
            if (score > highestScore || (score == highestScore && teamName.compareTo(bestTeamName) < 0)) {
                highestScore = score;
                bestTeamName = teamName;
            }
        }

        // Output the result
        System.out.println(bestTeamName);
    }

    // Helper function to count occurrences of a character in a string
    private static int countCharacter(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
}
