package pratica;

import java.io.IOException;
import java.util.Scanner;

public class Voluntario {

	public static void main(String[] args) throws IOException {

    	Scanner entrada = new Scanner(System.in);
        String recebearquivo="";
        int opcao = 0;
        
        do{
            
	        System.out.println("Digite o Número de sua opção!");
	        System.out.println("1- Defina o nome do seu projeto");
	        System.out.println("2- Cadastrar Projeto");
	        System.out.println("3- Abrir Arquivo do Projeto");
	        System.out.println("4- Sair ");

	        opcao = entrada.nextInt();
            
	        switch(opcao){
            case 1:  
		        System.out.println("\nEscreva o nome do arquivo");
		        recebearquivo = entrada.next();        
		        break;
            case 2:   
		        ManipuladorArquivo.escritor(recebearquivo);
		        break;
            case 3:
            	ManipuladorArquivo.leitor(recebearquivo);
            	break;
            case 4:
            	break;
            
            default:
                System.out.println("Opção inválida.");
            }
        } while(opcao != 4);
    }

	private static void menu() {
	}

	}

