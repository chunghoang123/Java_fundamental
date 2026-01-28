package session04;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class b6 {
     public static void main(String[] args) {

        String review = "Quyen sach nay rat hay nhung co vai doan rat te va noi dung hoi xau. "
                + "Mot so nguoi noi rang sach nay rat te va khong dang doc, "
                + "nhung theo toi thi no van co gia tri nhat dinh cho sinh vien moi hoc.";

        String[] blacklist = {"te", "xau", "khong dang"};

        for (String word : blacklist) {
            String regex = "(?i)\\b" + word + "\\b";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(review);

            StringBuffer sb = new StringBuffer();
            while (matcher.find()) {
                String stars = "*".repeat(matcher.group().length());
                matcher.appendReplacement(sb, stars);
            }
            matcher.appendTail(sb);
            review = sb.toString();
        }

        if (review.length() > 200) {
            int cutIndex = review.substring(0, 200).lastIndexOf(" ");
            StringBuilder builder = new StringBuilder();
            builder.append(review.substring(0, cutIndex));
            builder.append("...");
            review = builder.toString();
        }

        System.out.println(review);
    }
    
}
