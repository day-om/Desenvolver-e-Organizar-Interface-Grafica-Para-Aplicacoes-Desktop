
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;


public class Registro {
    private String data;
    private String hora;
    private int pressaoS;
    private int pressaoD;
    private String estresse;

    public Registro(String data, String hora, int pressaoS, int pressaoD, String estresse) {
        this.data = data;
        this.hora = hora;
        this.pressaoS = pressaoS;
        this.pressaoD = pressaoD;
        this.estresse = estresse;
    }

    public String getEstresse() {
        return estresse;
    }

    public void setEstresse(String estresse) {
        this.estresse = estresse;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getPressaoS() {
        return pressaoS;
    }

    public void setPressaoS(int pressaoS) {
        this.pressaoS = pressaoS;
    }

    public int getPressaoD() {
        return pressaoD;
    }

    public void setPressaoD(int pressaoD) {
        this.pressaoD = pressaoD;
    }
}

    

