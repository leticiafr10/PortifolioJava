import java.util.Scanner;
public class EXE_meses {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
        
		System.out.println("escolha um mes: ");
	      int mes= scanner.nextInt();
	      
	      switch(mes) {
	      
	      case 1:
	    	  System.out.println("esse numero corresponde ao mes de Janeiro");
	    	  break;
	    	  
	      case 2:
	    	  System.out.println("esse numero corresponde ao mes de Fevereiro");
	    	  break;
	    	  
	      case 3: 
	    	  System.out.println("esse numero corresponde ao mes de Fevereiro");
	    	  break;
	      case 4:
	    	  System.out.println("esse numero corresponde ao mes de Março");
	    	  break;
	      case 5: 
	    	  System.out.println("esse numero corresponde ao mes de Abril");
	    	  break;
	      case 6:
	    	  System.out.println("esse numero corresponde ao mes de Junho");
	    	  break;
	      case 7:
	    	  System.out.println("esse numero corresponde ao mes de Julho");
	    	  break;
	      case 8:
	    	  System.out.println("esse numero corresponde ao mes de Agosto");
	    	  break;
	      case 9: 
	    	  System.out.println("esse numero corresponde ao mes de Setembro");
	    	  break;
	      case 10:
	    	  System.out.println("esse numero corresponde ao mes de Ourubro");
	    	  break;
	      case 11:
	    	  System.out.println("esse numero corresponde ao mes de Novembro");
	    	  break;
	      case 12:
	    	  System.out.println("esse numero corresponde ao mes de Dezembro");
	    	  break;
	    	  
	    	  default:
	    		  System.out.println("opcao invalida.Tente novamente ");
	    		  
	    		  scanner.close();
	    		  
	      }
	}

}
