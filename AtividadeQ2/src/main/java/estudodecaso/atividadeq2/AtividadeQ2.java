package estudodecaso.atividadeq2;

import java.util.Scanner;

public class AtividadeQ2 {

    public static void main(String[] args) {
        int escolha;
        Scanner scanner = new Scanner(System.in);
        
        Televisao televisao = new Televisao("Samsung", 42, 110);
        System.out.println("Marca: " + televisao.marca + " - Polegadas: "+ televisao.tamanhoTela + " - Voltagem: "+ televisao.voltagem);
        
        do{
            System.out.println("\n---Funções---");
            System.out.println("1 - ligar\n2 - aumentar volume\n3 - diminuir volume\n4 - subir canal\n5 - descer canal\n6 - desligar\n7 - Fechar programa\n");
            System.out.println("Informe a função desejada: ");
            escolha = scanner.nextInt();
            
            switch (escolha){
                case 1: 
                    televisao.ligar();
                    break;
                case 2:
                    televisao.aumentarVolume();
                    break;
                case 3: 
                    televisao.diminuirVolume();
                    break;
                case 4:
                    televisao.subirCanal();
                    break;
                case 5: 
                    televisao.descerCanal();
                    break;
                case 6:
                    televisao.desligar();
                    break;
                case 7:
                    System.out.println("Você fechou o programa");
                    break;
                default: 
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
                
        } while(escolha != 7);
    }
}
