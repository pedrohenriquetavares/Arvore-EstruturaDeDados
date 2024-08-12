public class Main {
    public static void main(String[] args) {

        ArvoreBinaria arvoreBinaria = new ArvoreBinaria();
        arvoreBinaria.inserir(10);
        arvoreBinaria.inserir(20);
        arvoreBinaria.inserir(30);
        arvoreBinaria.inserir(40);
        arvoreBinaria.inserir(35);
        arvoreBinaria.inserir(50);
        arvoreBinaria.inserir(60);
        System.out.println("Árvore em ordem:");
        arvoreBinaria.emOrdem(arvoreBinaria.getRaiz());
        System.out.println("===============================");
        arvoreBinaria.removerRaiz();
        arvoreBinaria.emOrdem(arvoreBinaria.getRaiz());
        System.out.println("===============================");
        arvoreBinaria.removerFolha(60);
        arvoreBinaria.emOrdem(arvoreBinaria.getRaiz());
        System.out.println("===============================");
        arvoreBinaria.removerComUmFilho(20);
        arvoreBinaria.emOrdem(arvoreBinaria.getRaiz());
        System.out.println("===============================");
        arvoreBinaria.removerComDoisFilhos(40);
        arvoreBinaria.emOrdem(arvoreBinaria.getRaiz());
        System.out.println("===============================");
    }
}
