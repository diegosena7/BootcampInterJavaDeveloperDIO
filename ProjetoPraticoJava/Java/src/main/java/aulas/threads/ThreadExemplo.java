package aulas.threads;

/*
Trabalhando com processos paralelos, criando múltiplas tarefas que podem ser executadas simultaneamente.
Utilizamos a classe Thread com o método sleep para deixar o processamento "dormindo" até que se inicie.

Nesta classe usamos o processo da classe GeradorPDF a mesma inicia o processo com a msg: Iniciou o processo
de gerar o PDF , em seguida entra em modo sleep, neste momento aciona a thread da classe BarraDeCarregamento
que exibe a msg de loading, quando ela termina o seu processo volta ao processo da classe GeradorPDF e emite
a msg Processo finalizado, o PDF foi gerado com sucesso.
 */
public class ThreadExemplo {
    public static void main(String[] args) {
        GeradorPDF iniciaGeradorPDF = new GeradorPDF();
        BarraDeCarregamento iniciaBarraDeCarregamento = new BarraDeCarregamento(iniciaGeradorPDF);

        iniciaGeradorPDF.start();
        iniciaBarraDeCarregamento.start();

    }
}

class BarraDeCarregamento extends Thread {
    private Thread iniciaGeradorPDF;

    public BarraDeCarregamento(Thread iniciaGeradorPDF) {
        this.iniciaGeradorPDF = iniciaGeradorPDF;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
                if (!iniciaGeradorPDF.isAlive()) {//Se a thread não estiver ativa ee para o processamento
                    break;
                }
                System.out.println("Loading...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class GeradorPDF extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("Iniciou o processo de gerar o PDF... ");
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Processo finalizado, o PDF foi gerado com sucesso!!!");
    }
}
