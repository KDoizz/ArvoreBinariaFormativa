public class Main {
    public static void main(String[] args) throws Exception {
        Arvore arvore = new Arvore();
        arvore.insert(4);
        arvore.insert(1);
        arvore.insert(6);
        arvore.insert(3);
        arvore.insert(5);
        arvore.insert(7);
        arvore.insert(2);

        System.out.println("\n\n\n>>> Resultado inicial <<<");
        System.out.println("\nNúmeros pós ordem:");
        arvore.printPosOrdem(arvore.getRaiz());
        System.out.println("\nNúmeros em ordem:");
        arvore.printEmOrdem(arvore.getRaiz());
        System.out.println("\nNúmeros pré ordem:");
        arvore.printPreOrdem(arvore.getRaiz());

        arvore.removerMaior();

        System.out.println("\n\n\n>>> Resultado após a remoção do maior <<<");
        System.out.println("\nNúmeros pós ordem:");
        arvore.printPosOrdem(arvore.getRaiz());
        System.out.println("\nNúmeros em ordem:");
        arvore.printEmOrdem(arvore.getRaiz());
        System.out.println("\nNúmeros pré ordem:");
        arvore.printPreOrdem(arvore.getRaiz());

        arvore.removerMenor();

        System.out.println("\n\n\n>>> Resultado após a remoção do menor <<<");
        System.out.println("\nNúmeros pós ordem:");
        arvore.printPosOrdem(arvore.getRaiz());
        System.out.println("\nNúmeros em ordem:");
        arvore.printEmOrdem(arvore.getRaiz());
        System.out.println("\nNúmeros pré ordem:");
        arvore.printPreOrdem(arvore.getRaiz());;

        arvore.setRaiz(arvore.removerN(arvore.getRaiz(), 5));


        System.out.println("\n\n\n>>> Resultado após a remoção do N(5) <<<");
        System.out.println("\nNúmeros pós ordem:");
        arvore.printPosOrdem(arvore.getRaiz());
        System.out.println("\nNúmeros em ordem:");
        arvore.printEmOrdem(arvore.getRaiz());
        System.out.println("\nNúmeros pré ordem:");
        arvore.printPreOrdem(arvore.getRaiz());
    }
}