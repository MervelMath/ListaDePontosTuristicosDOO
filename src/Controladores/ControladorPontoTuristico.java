package Controladores;

import Dominios.PontoTuristico;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ControladorPontoTuristico {

    public boolean Inserir(PontoTuristico[] listaDePontos) {

        try {
            FileOutputStream arquivo = new FileOutputStream("ListaDePontos.ser");
            ObjectOutputStream out = new ObjectOutputStream(arquivo);

            out.writeObject(listaDePontos);
            out.close();
            arquivo.close();

            System.out.println("Serialização bem sucedida");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro na serialização");
        }

        return true;
    }

    public PontoTuristico[] SelecionarTodos() throws ClassNotFoundException {

        PontoTuristico[] vetorPT = new PontoTuristico[100];

        try {
            FileInputStream arquivo = new FileInputStream("ListaDePontos.ser");
            ObjectInputStream in = new ObjectInputStream(arquivo);

            vetorPT = (PontoTuristico[]) in.readObject();
            in.close();
            arquivo.close();

            System.out.println("Desserializado com sucesso");

            return vetorPT;
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Sem arquivos cadastrados.");
        }

        return vetorPT;
    }
}
