package ProjetoSocial;

import java.io.BufferedReader;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
	
public class ManipuladorJava {
	private static BufferedWriter write;
    private static BufferedReader reader;
    private static ArrayList<String> projetoSocial;
    private static String nameFile;

    public static void CriarArquivo(String namePath) throws IOException {
        File dir = new File(namePath + ".txt");
        dir.createNewFile();
        System.out.println("Arquivo criado com sucesso");
        nameFile = String.valueOf(dir);
    }

    public static void Writer(String txtTitulo, String txtObjetivo, String txtEndereco, String txtData, String txtStatus) throws IOException {
        write = new BufferedWriter(new FileWriter(nameFile + ".txt", true));
        projetoSocial = new ArrayList<>();
        projetoSocial.add("\n Titulo do projeto: " + txtTitulo + " \nObjetivo: " + txtObjetivo + " \nEndereço: " + txtEndereco + " \nData de inicio: " + txtData + "\nStatus: " + txtStatus+"\n");
        write.append(Arrays.toString(projetoSocial.toArray()));
        write.close();
    }
    public static void WriterAgenda(String txtDataA, String txtHora, String txtDesc, String txtAcao) throws IOException {
        write = new BufferedWriter(new FileWriter(nameFile + ".txt", true));
        projetoSocial = new ArrayList<>();
        projetoSocial.add("\n Data: " + txtDataA + " \nHora: " + txtHora + " \nDescrição: " + txtDesc + " \nAcao: " + txtAcao + "\n");
        write.append(Arrays.toString(projetoSocial.toArray()));
        write.close();
    }

    public static void Reading(String namePath) throws IOException {
        String dir = namePath+ ".txt";
        reader = new BufferedReader(new FileReader(dir));
        String line = "";
        while (true) {
            if (line != null) {
                System.out.println(line);
            } else
                break;
            line = reader.readLine();
        }
        reader.close();
    }
}
