package Utils;

import java.util.Random;

public class RandomUtils {

    public static String randomGender() {
        String[] gender = new String[]{"Male", "Female", "Other"};
        Random random = new Random();
        String randomGender = gender[random.nextInt(gender.length)];
        return randomGender;
    }

    public static String randomMonth() {
        String[] month = new String[]{"January", "February", "March", "April", "May", "June", "July", "August",
                "September", "October", "November", "December"};
        Random random = new Random();
        String randomMonth = month[random.nextInt(month.length)];
        return randomMonth;
    }

    public static String randomSubject() {
        String[] subject = new String[]{"Maths", "Economics", "English", "Biology", "Physics", "Chemistry",
                "Computer Science", "Accounting", "History"};
        Random random = new Random();
        String randomSubject = subject[random.nextInt(subject.length)];
        return randomSubject;
    }

    public static String randomHobby() {
        String[] hobby = new String[]{"Sports", "Reading", "Music"};
        Random random = new Random();
        String randomHobby = hobby[random.nextInt(hobby.length)];
        return randomHobby;
    }
}

