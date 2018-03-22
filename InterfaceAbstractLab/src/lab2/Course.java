package lab2;

/**
 *
 *Interface setting what methods every course should have.
 *
 * @Author Joshua Rauch
 * @Version 1.0
 */
public interface Course {

    String getCourseName();
    void setCourseName(String courseName);

    String getCourseNumber();
    void setCourseNumber(String courseNumber);

    double getCredits();
    void setCredits(double credits);
}
