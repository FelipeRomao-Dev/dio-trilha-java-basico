package edu.felipe.segundasemana;
public class MInhaClasse {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // Declarando váriaveis 
        // Tipo NomeBemDefinido = Atribuição (em alguns caso pode ser não necessário a atribuição)

        String meuNome = "Felipe";
        int  idade = 28;
        String spike = "chow chow";
    System.out.println("Meu nome é " + meuNome + " e minha idade é " + idade  + " e meu cachorro é da raça " + spike);

    String primeiroNome = "Felipe";
    String segundoNome = "Romão";

    String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
    System.out.println(nomeCompleto);
    }
    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return "Resultado do método é " + primeiroNome.concat(" ").concat(segundoNome);
    }
    }

