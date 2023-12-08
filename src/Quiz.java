import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Quiz{
    ArrayList<IntrebareRaspuns> intrebRaps;
    String filepath;

    public Quiz(String filepath){
        intrebRaps = new ArrayList<>();
        this.filepath = filepath;
        try {
            File f = new File(filepath);
            BufferedReader br = new BufferedReader(new FileReader(f));
            String line = br.readLine();
            if (line != null) {
                line = br.readLine();
            }
            while (line != null) {
                String[] token = line.split(",");

                IntrebareRaspuns elem = new IntrebareRaspuns( token[0].trim(), token[1].trim(), token[2].trim(), token[3].trim(), Integer.parseInt(token[4].trim()) );

                intrebRaps.add(elem);
                line = br.readLine();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public String getIntrebare(int i){
        return intrebRaps.get(i).intrebare;
    }
    public String getRaspunsuri(int i){
        return "1. " + intrebRaps.get(i).raspuns1 + "\n2. " + intrebRaps.get(i).raspuns2 + "\n3. " + intrebRaps.get(i).raspuns3;
    }
    public int getRaspunsCorect(int i){
        return intrebRaps.get(i).raspunsCorect;
    }

    public void startQuiz(Quiz quiz){
        System.out.println("\nQuiz-ul a inceput! \nAlege raspunsul corect si scrie numarul raspunsului. \n");
        int nota = 0;
        int i = 0;
        while(i < quiz.intrebRaps.size()) {
            Scanner scanner = new Scanner(System.in);

            System.out.println(quiz.getIntrebare(i));
            System.out.println(quiz.getRaspunsuri(i));

            int inputNumericUser = 0;

            int inputOK = 0;
            while(inputOK == 0){
                try {
                    inputNumericUser = scanner.nextInt();
                    if(inputNumericUser == 1 || inputNumericUser == 2 || inputNumericUser == 3){
                        inputOK = 1;
                    } else System.out.println("Scrie numarul raspunsului...");
                } catch (Exception e) {
                    System.out.println("Nu ai introdus un numar...");
                    scanner.nextLine();
                }
            }

            if (inputNumericUser == quiz.getRaspunsCorect(i) + 1) {
                System.out.println("Raspuns corect!");
                nota++;
            } else System.out.println("Raspuns gresit!");

            i++;
        }
        System.out.println("\nQuiz-ul s-a terminat!");
        System.out.println("Ai obtinut nota: " + nota + " !");

    }

}
