package level2.오픈채팅방;

import java.util.ArrayList;

class Solution {
    ArrayList<User> users = new ArrayList<>();

    public String[] solution(String[] recordsString) {

        ArrayList<Record> records = new ArrayList<>();
        for (String recordString : recordsString) {
            String[] recordsplit = recordString.split(" ");
            Record record = new Record(recordsplit);
            records.add(record);
        }

        return records.stream().filter(record -> record.command.equals("Enter") || record.command.equals("Leave")).map(record -> {
            String s = null;
            if (record.command.equals("Enter")) {
                s = users.stream().filter(user -> user.userId.equals(record.userId)).findFirst().get().nickName + "님이 들어왔습니다.";
            } else if (record.command.equals("Leave")) {
                s = users.stream().filter(user -> user.userId.equals(record.userId)).findFirst().get().nickName + "님이 나갔습니다.";
            }
            return s;
        }).toArray(String[]::new);

    }

    public class Record {
        String command;
        String userId;

        public Record(String[] record) {
            command = record[0];
            userId = record[1];
            if (command.equals("Enter")) {
                users.stream()
                        .filter(user -> user.userId.equals(userId))
                        .findFirst()
                        .map(user -> user.nickName = record[2])
                ;
                User user = new User(record[1], record[2]);
                users.add(user);
            } else if (command.equals("Change")) {
                users.stream().filter(user -> user.userId.equals(userId)).findFirst().get().nickName = record[2];
            }
        }
    }

    public class User {
        String userId;
        String nickName;

        public User(String userId, String nickName) {
            this.userId = userId;
            this.nickName = nickName;
        }
    }
}
