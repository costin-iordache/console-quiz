import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {

        Quiz quiz = new Quiz("date.csv");

        quiz.startQuiz(quiz);


    }
}