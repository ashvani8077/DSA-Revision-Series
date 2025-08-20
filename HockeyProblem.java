import java.util.Scanner;

public class HockeyProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome!");
        System.out.println("Enter the name of team 1.");
        String teamOne = scanner.nextLine();
        System.out.println("Enter the name of team 2.");
        String teamTwo = scanner.nextLine();
        System.out.println("Enter hockey scores for seven games.");
        String scores = scanner.nextLine();
        System.out.println("Enter the number of power play goals for both teams in each game.");
        String powerPlay = scanner.nextLine();
        scanner.close();

        int currentScoreIndex = 0;
        int scoreOneTeamOne = Integer.parseInt(scores.substring(currentScoreIndex, currentScoreIndex + 2));
        currentScoreIndex += 3;
        int scoreOneTeamTwo = Integer.parseInt(scores.substring(currentScoreIndex, currentScoreIndex + 2));
        currentScoreIndex += 3;
        int scoreTwoTeamOne = Integer.parseInt(scores.substring(currentScoreIndex, currentScoreIndex + 2));
        currentScoreIndex += 3;
        int scoreTwoTeamTwo = Integer.parseInt(scores.substring(currentScoreIndex, currentScoreIndex + 2));
        currentScoreIndex += 3;
        int scoreThreeTeamOne = Integer.parseInt(scores.substring(currentScoreIndex, currentScoreIndex + 2));
        currentScoreIndex += 3;
        int scoreThreeTeamTwo = Integer.parseInt(scores.substring(currentScoreIndex, currentScoreIndex + 2));
        currentScoreIndex += 3;
        int scoreFourTeamOne = Integer.parseInt(scores.substring(currentScoreIndex, currentScoreIndex + 2));
        currentScoreIndex += 3;
        int scoreFourTeamTwo = Integer.parseInt(scores.substring(currentScoreIndex, currentScoreIndex + 2));
        currentScoreIndex += 3;
        int scoreFiveTeamOne = Integer.parseInt(scores.substring(currentScoreIndex, currentScoreIndex + 2));
        currentScoreIndex += 3;
        int scoreFiveTeamTwo = Integer.parseInt(scores.substring(currentScoreIndex, currentScoreIndex + 2));
        currentScoreIndex += 3;
        int scoreSixTeamOne = Integer.parseInt(scores.substring(currentScoreIndex, currentScoreIndex + 2));
        currentScoreIndex += 3;
        int scoreSixTeamTwo = Integer.parseInt(scores.substring(currentScoreIndex, currentScoreIndex + 2));
        currentScoreIndex += 3;
        int scoreSevenTeamOne = Integer.parseInt(scores.substring(currentScoreIndex, currentScoreIndex + 2));
        currentScoreIndex += 3;
        int scoreSevenTeamTwo = Integer.parseInt(scores.substring(currentScoreIndex, currentScoreIndex + 2));


        int currentPowerPlayIndex = 0;
        int powerPlayOneTeamOne = Integer.parseInt(powerPlay.substring(currentPowerPlayIndex,
                currentPowerPlayIndex + 2));
        currentPowerPlayIndex += 3;
        int powerPlayOneTeamTwo = Integer.parseInt(powerPlay.substring(currentPowerPlayIndex,
                currentPowerPlayIndex + 2));
        currentPowerPlayIndex += 3;
        int powerPlayTwoTeamOne = Integer.parseInt(powerPlay.substring(currentPowerPlayIndex,
                currentPowerPlayIndex + 2));
        currentPowerPlayIndex += 3;
        int powerPlayTwoTeamTwo = Integer.parseInt(powerPlay.substring(currentPowerPlayIndex,
                currentPowerPlayIndex + 2));
        currentPowerPlayIndex += 3;
        int powerPlayThreeTeamOne = Integer.parseInt(powerPlay.substring(currentPowerPlayIndex,
                currentPowerPlayIndex + 2));
        currentPowerPlayIndex += 3;
        int powerPlayThreeTeamTwo = Integer.parseInt(powerPlay.substring(currentPowerPlayIndex,
                currentPowerPlayIndex + 2));
        currentPowerPlayIndex += 3;
        int powerPlayFourTeamOne = Integer.parseInt(powerPlay.substring(currentPowerPlayIndex,
                currentPowerPlayIndex + 2));
        currentPowerPlayIndex += 3;
        int powerPlayFourTeamTwo = Integer.parseInt(powerPlay.substring(currentPowerPlayIndex,
                currentPowerPlayIndex + 2));
        currentPowerPlayIndex += 3;
        int powerPlayFiveTeamOne = Integer.parseInt(powerPlay.substring(currentPowerPlayIndex,
                currentPowerPlayIndex + 2));
        currentPowerPlayIndex += 3;
        int powerPlayFiveTeamTwo = Integer.parseInt(powerPlay.substring(currentPowerPlayIndex,
                currentPowerPlayIndex + 2));
        currentPowerPlayIndex += 3;
        int powerPlaySixTeamOne = Integer.parseInt(powerPlay.substring(currentPowerPlayIndex,
                currentPowerPlayIndex + 2));
        currentPowerPlayIndex += 3;
        int powerPlaySixTeamTwo = Integer.parseInt(powerPlay.substring(currentPowerPlayIndex,
                currentPowerPlayIndex + 2));
        currentPowerPlayIndex += 3;
        int powerPlaySevenTeamOne = Integer.parseInt(powerPlay.substring(currentPowerPlayIndex,
                currentPowerPlayIndex + 2));
        currentPowerPlayIndex += 3;
        int powerPlaySevenTeamTwo = Integer.parseInt(powerPlay.substring(currentPowerPlayIndex,
                currentPowerPlayIndex + 2));


        //
        int teamOneTotalScore=scoreOneTeamOne+scoreTwoTeamOne+scoreThreeTeamOne+scoreFourTeamOne+scoreFiveTeamOne+scoreSixTeamOne+scoreSevenTeamOne;
        int teamTwoTotalScore=scoreOneTeamTwo+scoreTwoTeamTwo+scoreThreeTeamTwo+scoreFourTeamTwo+scoreFiveTeamTwo+scoreSixTeamTwo+scoreSevenTeamTwo;
        int teamOnePowerPlay=powerPlayOneTeamOne+powerPlayTwoTeamOne+powerPlayThreeTeamOne+powerPlayFourTeamOne+powerPlayFiveTeamOne+powerPlaySixTeamOne+powerPlaySevenTeamOne;
        int teamTwoPowerPlay=powerPlayOneTeamTwo+powerPlayTwoTeamTwo+powerPlayThreeTeamTwo+powerPlayFourTeamTwo+powerPlayFiveTeamTwo+powerPlaySixTeamTwo+powerPlaySevenTeamTwo;
        int teamOneStandard=teamOneTotalScore-teamOnePowerPlay;
        int teamTwoStandard=teamTwoTotalScore-teamTwoPowerPlay;
        int teamOneMaxScore=scoreOneTeamOne;
        int teamOneMaxNumber=1;




        System.out.println("Score here");
        System.out.println("The "+teamOne+" scored "+teamOneTotalScore+" total goals");
        System.out.println("The "+teamTwo+" scored "+teamTwoTotalScore+" total goals");
        System.out.println("The "+teamOne+" scored "+teamOnePowerPlay+" power play goals");
        System.out.println("The "+teamTwo+" scored "+teamTwoPowerPlay+" power play goals");
        System.out.println("The "+teamOne+" scored "+teamOneStandard+" standard  goals");
        System.out.println("The "+teamTwo+" scored "+teamTwoStandard+" standard  goals");


    }
}
