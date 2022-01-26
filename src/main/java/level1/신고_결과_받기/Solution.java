package level1.신고_결과_받기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution {

    Users users;

    public int[] solution(String[] id_list, String[] report, int k) {

        users = new Users(id_list);

        Set<String> reportsSet = Arrays.stream(report).collect(Collectors.toSet());

        for (String reportString : reportsSet) {
            new Report(reportString.split(" "), k);
        }

        return users.users.stream().mapToInt(user -> (int) user.reportedUsers.stream().filter(reportedUser ->
                reportedUser.numberOfReported >= k
        ).count()).toArray();
    }

    private class User {
        String userId;
        int numberOfReported;
        List<User> reportedUsers = new ArrayList<>();

        public User(String id) {
            this.userId = id;
            setNumberOfReported(0);
        }

        public int getNumberOfReported() {
            return numberOfReported;
        }

        public void setNumberOfReported(int numberOfReported) {
            this.numberOfReported = numberOfReported;
        }

    }

    private class Report {
        String reporter; //신고한 사람
        String reported; //신고 당한 사람

        public Report(String[] reportString, int k) {
            reporter = reportString[0];
            reported = reportString[1];

            //신고 당한 사람 횟수
            User reportedUser = users.users.stream().filter(user ->
                    user.userId.equals(reported))
                    .findFirst().get();

            reportedUser.setNumberOfReported(reportedUser.getNumberOfReported() + 1);

            //신고한사람(유저)이 신고한 유저 리스트
            users.users.stream().filter(reporterUser ->
                    reporterUser.userId.equals(reporter))
                    .forEach(reporterUser -> {
                        reporterUser.reportedUsers.add(reportedUser);
                    });
        }
    }

    private class Users {
        List<User> users = new ArrayList<>();

        public Users(String[] id_list) {
            Arrays.stream(id_list).forEach(id -> {
                users.add(new User(id));
            });
        }
    }
}
