//s23020
// result変数を使って　ABの勝敗を計算する。結果が正の場合はAチームの勝利、負の場合はBチームの勝利、同じ場合は引き分けとなる。

public class d48Q6kadai {
    public static void main(String[] args) {
        if(args.length != 4) {
            System.out.println("数値を４つ指定してください");
            return;
        }

        Achievement teamA = new Achievement();
        teamA.set(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        Achievement teamB = new Achievement();
        teamB.set(Integer.parseInt(args[2]), Integer.parseInt(args[3]));

        Match match = new Match();
        match.setAchievements(teamA, teamB);
        System.out.println(match.showResult());
    }
}

class Match {
    Achievement teamA;
    Achievement teamB;

    void setAchievements(Achievement a, Achievement b) {
        teamA = a;
        teamB = b;
    }

    String showResult() {
        int teamAPoints = teamA.point;
        int teamBPoints = teamB.point;
        int teamATryNumber = teamA.tryNumber;
        int teamBTryNumber = teamB.tryNumber;

        int result = winPoint(teamAPoints, teamBPoints, teamATryNumber) - winPoint(teamBPoints, teamAPoints, teamBTryNumber);
        
        if (result > 0) {
            return "チームAの勝利！";
        } else if (result < 0) {
            return "チームBの勝利！";
        } else {
            return "引き分け！";
        }
    }

    int winPoint(int teamXPoint, int teamYPoint, int teamXTryNumber) {
        return matchPoint(teamXPoint, teamYPoint) + bonusPoint(teamXTryNumber);
    }

    int matchPoint(int teamXPoint, int teamYPoint) {
        if (teamXPoint == teamYPoint) {
            return 2;
        } else if (teamXPoint > teamYPoint) {
            return 4;
        } else if (teamYPoint - teamXPoint <= 7) {
            return 1;
        }
        return 0;
    }

    int bonusPoint(int tryNumber) {
        return tryNumber >= 4 ? 1 : 0;
    }
}

class Achievement {
    int point;
    int tryNumber;

    void set(int teamPoint, int teamTryNumber) {
        point = teamPoint;
        tryNumber = teamTryNumber;
    }
}

