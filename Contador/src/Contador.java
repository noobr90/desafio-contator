import java.util.Scanner;
public class Contador {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = sc.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = sc.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
			
			
		}catch (ParametrosInvalidosException e) {
			System.out.println(e.getMessage());
		}
		}
		
	
		static void contar(int parametroUm,int parametroDois)throws ParametrosInvalidosException{
			if(parametroUm>parametroDois){
				throw new ParametrosInvalidosException("O segundo parametro deve ser maior que o primeiro");
			}else{
			int i;
			int cont = parametroDois - parametroUm;
			for (i=0;i<cont;i++){
				System.out.println(parametroUm);
				System.out.println(parametroDois);
				}
			}
		}
}

