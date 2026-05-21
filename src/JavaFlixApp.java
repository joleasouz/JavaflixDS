public class JavaFlixApp {
    public static void main(String[] args) {
        System.out.println("--- Carregando Catálogo JavaFlix ---");

        Filme filme = new Filme("Inception", 2010, 148);

        Serie serie = new Serie("Stranger Things", 2016, 4);

        System.out.println("\n[Ficha do Filme]");
        filme.exibirFicha();

        System.out.println("\n[Ficha da Série]");
        serie.exibirFicha();
    }
}

class Midia {
    protected String titulo;
    protected int anoLancamento;

    public Midia(String titulo, int anoLancamento) {
    this.titulo = titulo;
    this.anoLancamento = anoLancamento;
    }

    public void exibirFicha() {
    System.out.println("Título: " + titulo);
    System.out.println("Ano de Lançamento: " + anoLancamento);
    }
}

class Filme extends Midia{
    private int duracaoEmMinutos;

    public Filme(String titulo, int anoLancamento, int duraçãoEmMinutos) {
    this.duracaoEmMinutos = duraçãoEmMinutos;
    super(titulo, anoLancamento);
    }

    @Override
    public void exibirFicha() {
        System.out.println("Título: " + titulo);
        System.out.println("Ano de Lançamento: " + anoLancamento);
        System.out.println("Duração: "+ duracaoEmMinutos + "min");
    }
}

class Serie extends Midia{
    
    private int totalTemporadas;

    public Serie(String titulo, int anoLancamento, int totalTemporadas) {
        this.totalTemporadas = totalTemporadas;
        super(titulo, anoLancamento);
    }

    @Override
    public void exibirFicha() {
        System.out.println("Título: " + titulo);
        System.out.println("Ano de Lançamento: " + anoLancamento);
        System.out.println("Total de Temporadas: " + totalTemporadas);
    }
}