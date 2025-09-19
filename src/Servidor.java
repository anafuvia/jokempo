import ,
        ,java.net.*;
import java.io.*;

public class Servidor {
    public static void main(String[] args) throws Exception {
        ServerSocket servidor = new ServerSocket(12345);
        System.out.println("Servidor aguardando 2 clientes...");

        // Conectar Cliente A
        Socket clienteA = servidor.accept();
        System.out.println("Cliente A conectado!");
        BufferedReader inA = new BufferedReader(new InputStreamReader(clienteA.getInputStream()));
        PrintWriter outA = new PrintWriter(clienteA.getOutputStream(), true);

        // Conectar Cliente B
        Socket clienteB = servidor.accept();
        System.out.println("Cliente B conectado!");
        BufferedReader inB = new BufferedReader(new InputStreamReader(clienteB.getInputStream()));
        PrintWriter outB = new PrintWriter(clienteB.getOutputStream(), true);

        // recee do servidor
        String yasmin = inA.readLine();
        String anafuvia = inB.readLine();

        // Comparar pedra papel tesoura

        if(yasmin.equals("Tesoura")&& anafuvia.equals("Pedra")){
            outB.println("Parabéns, você ganhou!");
            outA.println("Infelizmente você perdeu!");
        }

        else if (yasmin.equals("Tesoura")&& anafuvia.equals("Papel")){
            outA.println("Parabéns, você ganhou!");
            outB.println("Infelizmente você perdeu!");


        }
        else if (yasmin.equals("Tesoura")&& anafuvia.equals("Tesoura")){
            outA.println("Deu empate");
            outB.println("Deu empate");

        }

        else if (yasmin.equals("Pedra")&& anafuvia.equals("Tesoura")){
            outA.println("Parabéns, você ganhou!");
            outB.println("Infelizmente você perdeu!");

        }

        else if (yasmin.equals("Pedra")&& anafuvia.equals("Papel")){
            outB.println("Parabéns, você ganhou!");
            outA.println("Infelizmente você perdeu!");
        }

        else if (yasmin.equals("Pedra")&& anafuvia.equals("Pedra")){
            outA.println("Deu empate");
            outB.println("Deu empate");

        }

        else if (yasmin.equals("Papel")&& anafuvia.equals("Pedra")){
            outA.println("Parabéns, você ganhou!");
            outB.println("Infelizmente você perdeu!");

        }

        else if (yasmin.equals("Papel")&& anafuvia.equals("Tesoura")){
            outB.println("Parabéns, você ganhou!");
            outA.println("Infelizmente você perdeu!");

        }
        else if (yasmin.equals("Papel")&& anafuvia.equals("Papel")){
            outA.println("Deu empate");
            outB.println("Deu empate");

        }



        // Fechar conexões
        clienteA.close();
        clienteB.close();
        servidor.close();
    }
}
