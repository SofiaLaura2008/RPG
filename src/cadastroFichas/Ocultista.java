package cadastroFichas;

public class Ocultista extends Ficha {
    private int ocultismo;
    private int vontade;
    private int intuicao;

    public Ocultista(String nome_personagem, int idade_personagem, int forca, int agilidade, int intelecto, int vigor, int presenca, int nivel_exposicao, int sanidade, int postos_esforcos, int vida, int deslocamento, int p_e_rodada, int ocultismo, int vontade, int intuicao) {
        super(nome_personagem, idade_personagem, forca, agilidade, intelecto, vigor, presenca, nivel_exposicao, sanidade, postos_esforcos, vida, deslocamento, p_e_rodada);
        this.ocultismo = ocultismo;
        this.vontade = vontade;
        this.intuicao = intuicao;
    }

    public int getOcultismo() {
        return this.ocultismo;
    }

    public void setOcultismo(int ocultismo) {
        this.ocultismo = ocultismo;
    }

    public int getVontade() {
        return this.vontade;
    }

    public void setVontade(int vontade) {
        this.vontade = vontade;
    }

    public int getIntuicao() {
        return this.intuicao;
    }

    public void setIntuicao(int intuicao) {
        this.intuicao = intuicao;
    }

    @Override
    public void habilidades() {
        System.out.println("Nome do Personagem: " + getNome_personagem() + ", Ocultismo: " + getOcultismo() + ", Vontade: " + getVontade() + ", Intuição: " + getIntuicao());
    }
}
