package estudodecaso.atividadeq2;

public class Televisao {
    String marca;
    int tamanhoTela;
    int volume;
    int voltagem;
    int canal;
    boolean ligado;
    int consumo;
    
    public Televisao(String marca, int tamanhoTela, int voltagem){
        this.marca = marca;
        this.tamanhoTela = tamanhoTela;
        this.volume = 5;
        this.voltagem = voltagem;
        this.canal = 1;
        this.ligado = false;
        this.consumo = 0;
    }
    
    void ligar(){
        if (!this.ligado){
            this.ligado = true;
            consumo = this.tamanhoTela * this.voltagem;
            System.out.println("A TV está ligada. Seu consumo é " + consumo + "W");
        } else {
            System.out.println("A TV já está ligada.");
        }
    }
    
    void desligar(){
        if (ligado){
            ligado = false;
            System.out.println("A TV está desligada.");
        } else {
            System.out.println("A TV já está desligada.");
        }
    }
    
    void aumentarVolume(){
        if (ligado && volume < 10){
            volume ++;
            System.out.println("Volume atual(após aumentar): " + volume);
        } else if(volume == 10){
            System.out.println("Já alcançou o volume máximo.");
        } else {
            System.out.println("A TV está desligada. Ligue-a para aumentar o volume.");
        }
        
    }
    
    void diminuirVolume(){
        if (ligado && volume > 1){
            volume--;
            System.out.println("Volue atual(após diminuir): " + volume);
        } else if(volume == 1){
            System.out.println("O volume já está no mínimo");
        } else {
            System.out.println("A TV está desligada. Ligue-a para diminuir o volume.");
        }
    }
    
    void subirCanal(){
        if(ligado){
            canal++;
            System.out.println("Mudou para o canal " + canal);
        } else {
            System.out.println("A TV está desligada. Ligue-a para mudar de cananl.");
        }
    }
    
    void descerCanal(){
        if (ligado && canal > 1){
            canal--;
            System.out.println("Mudou para o canal " + canal);
        } else if(canal == 1) {
            System.out.println("Não é possível descer mais canais.");
        } else {
            System.out.println("A TV está desligada. Ligue-a para poder mudar o canal.");
        }
    }
}
    

