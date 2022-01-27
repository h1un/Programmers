package level1.신규_아이디_추천;

public class Soultion {
    public String solution(String new_id) {
        //1
        String id = new_id.toLowerCase();
        //2
        char[] idChars = id.toCharArray();
        StringBuilder idStringBuilder = new StringBuilder();
        for (char c : idChars) {
            if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || c == '-' || c == '_' || c == '.') {
                idStringBuilder.append(c);
            }
        }

        id = idStringBuilder.toString();

        //3
        while (id.contains("..")) {
            id = id.replace("..", ".");
        }
        //4
        if (id.startsWith(".")) {
            id = id.substring(1, id.length());
        }
        ;
        if (id.endsWith(".")) {
            id = id.substring(0, id.length() - 1);
        }
        //5
        if (id.equals("")) {
            id = "a";
        }
        //6
        if (id.length() >= 16) {
            id = id.substring(0, 15);
            if (id.endsWith(".")) {
                id = id.substring(0, id.length() - 1);
            }
            ;
        }
        //7
        if (id.length() <= 2) {
            while (id.length() < 3) {
                id += id.charAt(id.length() - 1);
            }
        }

        return id;
    }
}
