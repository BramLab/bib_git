package be.bruxellesformation.bib_git;

import java.util.Objects;

public class User {
    private int userId;
    private String userName;
    private int age;
    private String adresse ;

    public User(int userId, String userName, int age, String adresse) {
        this.userId = userId;
        this.userName = userName;
        this.age = age;
        this.adresse = adresse;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return userId == user.userId && age == user.age && Objects.equals(userName, user.userName) && Objects.equals(adresse, user.adresse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, userName, age, adresse);
    }

    @Override
    public String toString() {
        return userId + "\t|" + userName + "\t\t\t |" + age + "\t|" + adresse;
    }
}
