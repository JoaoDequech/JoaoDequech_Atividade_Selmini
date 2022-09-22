import java.util.Scanner;
public class Sem_método {

	
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    
    int sala = 0, aluno = 0;
    double media = 0, porcentagem = 0, media_final = 0;
    
    System.out.print("Número de salas: ");
    sala = teclado.nextInt();
   double [] salay = new double[sala];
    
    for(int i = 0; i < salay.length;  i++){
        System.out.print("Número de alunos na " + (i+1) + "ª sala: ");
        aluno = teclado.nextInt();
        
        double [] alunay = new double[aluno];
        
            System.out.println("Nota (0 - 100)");
               
            for(int a = 0; a < alunay.length; a++) {
                	
            	do {
                		System.out.print("Nota do " + (a+1) + " aluno, sala -" + (i+1) + ": ");
                			alunay[a] = teclado.nextInt();
                			
                if(alunay[a]>100 || alunay[a]<0) {
                    			System.out.println("\nEssa nota é impossível, por favor colabore com o programa Selmini...");
                }else {
                    			media = media + alunay[a];
                    		}
            	}while (alunay[a]>100 || alunay[a]<0);
            }
                
                media = media/aluno; 
                for(int m = 0; m < alunay.length; m++) {
                
                if(alunay[m] > media) {
                        porcentagem++;
                    	
                }
                    }
                
                System.out.print("Sala " + (i+1) + ", com " + alunay.length + " alunos, tem as médias ");
                	for(int s = 0; s <alunay.length; s++) {
                	System.out.print(alunay[s] + ", ");    
                }
                System.out.println("\nMédia da sala: " + String.format("%.2f", media));
                
            media_final = porcentagem/aluno;
            salay[i] = media_final;
            System.out.println(String.format("%.3f", salay[i] * 100)+ "%.\n");
            porcentagem = 0;
            media = 0;
    	}
    }
}