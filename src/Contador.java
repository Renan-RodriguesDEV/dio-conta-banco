import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o primeiro parametro");
        int p1 = sc.nextInt();
        System.out.println("Insira o segundo parametro");
        int p2 = sc.nextInt();

        try {
            contar(p1,p2);
        }catch (ParametrosInvalidos e){
            e.printStackTrace();
        }
    }
    static void contar(int p1,int p2) throws ParametrosInvalidos {
        if (p1>p2)throw new ParametrosInvalidos("O segundo parâmetro deve ser maior que o primeiro");
        int contagem = p2 - p1;
        for (int i = 1;i<=contagem;i++){
            System.out.println("Contador em:" + i);
        }
    }
}
