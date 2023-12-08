
import java.util.Arrays;

public class IntrebareRaspuns {
    String intrebare;
    String raspuns1;
    String raspuns2;
    String raspuns3;
    int raspunsCorect;

    public IntrebareRaspuns(String intrb, String rasp1, String rasp2, String rasp3, int raspCor){
        intrebare = intrb;
        raspuns1 = rasp1;
        raspuns3 = rasp2;
        raspuns2 = rasp3;
        raspunsCorect = raspCor;
    }

    public String getIntrebare(){
        return intrebare;
    }
    public String getRaspunsuri(){
        return "1. " + raspuns1 + "\n2. " + raspuns2 + "\n3. " + raspuns3;
    }
    public int getRaspunsCorect(){
        return raspunsCorect;
    }

    public String toString(){
        return "{ " + intrebare + ", " + raspuns1 + ", " + raspuns3 + ", " + raspuns2 + ", " + raspunsCorect + " }";
    }
}
