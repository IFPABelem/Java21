package ex05;


public class Ex05 {
    public static void main(String[] args) {
//Um centro social comunitário resolveu cadastrar seus associados, homens e mulheres. As ações
//do centro para os homens são diferentes das ações do centro para as mulheres. Portanto, os
//dados a armazenar para os homens serão diferentes dos dados para armazenar das mulheres.
//Dados dos homens Dados das mulheres
//Nome nome
//esporte preferido números de partos
//idade idade
//que trabalho manual sabe executar? fez preventivo?
//Instanciar 12 objetos do tipo Associado, sendo 6 homens e seis mulheres. Usar construtores
//diferentes para inicializar as variáveis. Usar método set() e get() e toString().

        
    Homem joao = new Homem("Nenhum","Nenhum","Sem nome","18");
    Homem jose = new Homem("Nenhum","Nenhum","Sem nome","18");
    Homem paulo = new Homem("Nenhum","Nenhum","Sem nome","18");
    Homem pedro = new Homem("Nenhum","Nenhum","Sem nome","18");
    Homem tiago = new Homem("Nenhum","Nenhum","Sem nome","18");
    Homem felipe = new Homem("Nenhum","Nenhum","Sem nome","18");
    Mulher ana = new Mulher(0,"Não","Sem nome","18");
    Mulher maria = new Mulher(0,"Não","Sem nome","18");
    Mulher eliza = new Mulher(0,"Não","Sem nome","18");
    Mulher luana = new Mulher(0,"Não","Sem nome","18");
    Mulher luciana = new Mulher(0,"Não","Sem nome","18");
    Mulher laura = new Mulher(0,"Não","Sem nome","18");
    
    joao.setNome("João");
    joao.setIdade("19");
    joao.setEsporte_preferido("Futebol");
    joao.setTrabalho_manual("Carpintaria");
    System.out.println(joao.toString());
    
    
    
    
    }
}
