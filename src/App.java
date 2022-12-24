public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        //Slide do Conteúdo DIO: https://docs.google.com/presentation/d/1UCNtQfyKPnei-1Xs_pVyku8CPEMXRPbc/edit#slide=id.g1015af5f028_1_86
        //Material de Estudo: https://felipe-silva-aguiar.gitbook.io/dio-java/gitbook/summary

        /* ANOTAÇÕES
         * Fundamentos
            Java e sua história: Era para ser Oak, que era uma arvoré de carvalho que dava de frente para a janela de James G. enquanto pensava em uma estrutura de diretórios para a linguagem, mas já existia e então numa visita a cafeteria local a equipe da Sun Mycrosystems sugeriu que o nome fosse Java em homenagem ao nome da cidade de origem do café importado. Lançada com o propósito de estar em dispositivos eletrônicos inteligentes, projetada no ano de 91 com o codinome de Green, teve seu ano de lançamento em 95.

            Plataformas(4): JSE, JEE, JME, JFX
            Para programar em Java precisa da JDK. Para apenas executar os programas irá precisar da JRE. 
            
            JVM: uma máquina abstrata. É uma especificação que fornece em ambiente de tempo de execução no qual o bytecode java pode ser executado. 

            Java é compilado e interpretado. Compilados em bytecodes e interpretado pela JVM (https://medium.com/@MarianaSSABA/java-%C3%A9-uma-linguagem-compilada-ou-interpretada-16fcb04e60d3)
            
            
         * Sintaxe
            Anatomia das Classe
             todo arquivo java (Arquivo.java) tem sua respectiva classe com o mesmo formato e nome. É dentro dela que vão os códigos. Comumente iniciada `public class Nome{}`

             formatação de nomes nomes
             - variáveis: camelCase
             - classes: PascalCase
             - constantes: SCREAMING_SNAKE_CASE

            Tipos e Variaveis
             Tipos: estilos de representação de valores. String, byte, short, int, long(L no final do valor atribuído), float(F no final do valor atribuído) e double. Padroes de valores numeiros para o Java são int para inteiro e double para decimais.
             Variáveis: são nomedas com referencia a um endereço de memoria. Podem ser alteradas após atribuir o valor se na declaração não estiver 'final' antes do tipo. Sintaxe: <tipo> <nome> = <valor?>

            Operadores
             Simbolos especiais que trabalham em prol de uma funcionalidade. Existem 6: Atribuição(=), Artiméticos(barra, asterisco, mais, menos, porcentagem), Relacionais(==, => >, =<, <), Lógicos(||, &&), Unários(+, -, --, ++, !) e Ternario(<expressao>?<verdadeiro>:<falso>).
             a partir de uma linha seuqencial de op. matematicas + string, o depurador pausa a operação matematica e passa a concatenar. Valor negativo para positivo: n = n * -1
             ⚠ ++n e n++. A ordem importa no momento de compilação. equals() serve para comparar o literal de String


             Métodos
             Membros de uma classe que possuem funcionalidades para executar uma ou mais ações para o objeto. Escritas no infitivo e de responsabilidade unitária.
         * 
         */
    }
}
