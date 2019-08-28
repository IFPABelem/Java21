package ex15;
//Às vezes temos objetos menores envolvidos por objetos maiores, por exemplo, um batalhão
//possui vários pelotões que possui vários soldados. Faça um programa que permita criar objetos
//do tipo pelotão e dentro deles objetos do tipo soldado.

public class Ex15 {
    public static void main(String[] args) {
        Pelotao p1 = new Pelotao();
        Soldado p1s1 = new Soldado();
        Soldado p1s2 = new Soldado();
        Soldado[] soldadosp1  = {p1s1, p1s2};
        p1.setSoldado(soldadosp1);
        
        Pelotao p2 = new Pelotao();
        Soldado p2s1 = new Soldado();
        Soldado p2s2 = new Soldado();
        Soldado[] soldadosp2  = {p2s1, p2s2};
        p1.setSoldado(soldadosp2);
    }
}
