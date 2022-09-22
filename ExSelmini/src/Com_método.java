import java.util.Scanner;
public class Com_método {

    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
   
    
    int sala = 0, alunos = 0;
    double med = 0, por = 0, mf = 0;
    
    System.out.print("Número de salas:");
    sala = teclado.nextInt();
    
    double [] salay = new double[sala];
    
    for(int i = 0; i < salay.length;  i++){
        System.out.print("Número de alunos na " + (i+1) + "ª sala: ");
        alunos = teclado.nextInt();
       
       double [] alunay = new double[alunos];
       	med = notas(alunay,med,i);
        
       	
        
        med = med/alunay.length;
            por = porcentagem(por, alunay, med);
             
            
            impressao(por, i, med,mf, alunay, salay);
            
            	por = 0;
            		med = 0;
    }
}
    public static void impressao(double porcentagem, int i, double media, double media_final, double alunay[], double salay[]) {
    	 System.out.print("Sala " + (i+1) + ", com " + alunay.length + " alunos, médias:  ");
                for(int s = 0; s <alunay.length; s++) {
                	System.out.print(alunay[s] + " ");    
                }
                	System.out.println("\nMédia da sala: " + String.format("%.2f", media));
                
            media_final = porcentagem/alunay.length;
            salay[i] = media_final;
            System.out.println(String.format("%.3f", salay[i] * 100)+ "% Ficaram acima da média.\n");
    }
    
    public static double porcentagem(double porcentagem, double alunay[], double media) {
    	for(int m = 0; m < alunay.length; m++) {
                    if(alunay[m] > media) {
                        porcentagem++;
                    }
                    }
    	return porcentagem;
    	
    }
    public static double notas(double alunay[], double media, int i) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Nota (0 - 100)");
        
    	for(int a = 0; a < alunay.length; a++) {
        	do {
            	System.out.print("Nota do" + (a+1) + " Dequechito, sala: " + (i+1) + ": ");
            	alunay[a] = teclado.nextInt();
            		if(alunay[a]>100 || alunay[a]<0) {
            			System.out.println("\nOutra vez? Não confia nos meus codigos Seumini? Não vale colocar um valor acima de 100 ou abaixo de 0!");
            		}else {
            			media = media + alunay[a];
            		}
        	}while (alunay[a]>100 || alunay[a]<0);
        }
    		return media;
    }
}