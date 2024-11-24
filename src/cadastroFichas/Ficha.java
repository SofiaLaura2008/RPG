package cadastroFichas;

public abstract class Ficha {
    private String nome_personagem;
    private int idade_personagem;
    private int forca;
    private int agilidade;
    private int intelecto;
    private int vigor;
    private int presenca;
    private int nivel_exposicao;
    private int sanidade;
    private int postos_esforcos;
    private int vida;
    private int deslocamento;
    private int p_e_rodada;


    public Ficha(String nome_personagem, int idade_personagem, int forca, int agilidade, int intelecto, int vigor, int presenca, int nivel_exposicao, int sanidade, int postos_esforcos, int vida, int deslocamento, int p_e_rodada) {
        this.nome_personagem = nome_personagem;
        this.idade_personagem = idade_personagem;
        this.forca = forca;
        this.agilidade = agilidade;
        this.intelecto = intelecto;
        this.vigor = vigor;
        this.presenca = presenca;
        this.nivel_exposicao = nivel_exposicao;
        this.sanidade = sanidade;
        this.postos_esforcos = postos_esforcos;
        this.vida = vida;
        this.deslocamento = deslocamento;
        this.p_e_rodada = p_e_rodada;
    }


    public String getNome_personagem() {
        return this.nome_personagem;
    }

    public void setNome_personagem(String nome_personagem) {
        this.nome_personagem = nome_personagem;
    }

    public int getIdade_personagem() {
        return this.idade_personagem;
    }

    public void setIdade_personagem(int idade_personagem) {
        this.idade_personagem = idade_personagem;
    }

    public int getForca() {
        return this.forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getAgilidade() {
        return this.agilidade;
    }

    public void setAgilidade(int agilidade) {
        this.agilidade = agilidade;
    }

    public int getIntelecto() {
        return this.intelecto;
    }

    public void setIntelecto(int intelecto) {
        this.intelecto = intelecto;
    }

    public int getVigor() {
        return this.vigor;
    }

    public void setVigor(int vigor) {
        this.vigor = vigor;
    }

    public int getPresenca() {
        return this.presenca;
    }

    public void setPresenca(int presenca) {
        this.presenca = presenca;
    }

    public int getNivel_exposicao() {
        return this.nivel_exposicao;
    }

    public void setNivel_exposicao(int nivel_exposicao) {
        this.nivel_exposicao = nivel_exposicao;
    }

    public int getSanidade() {
        return this.sanidade;
    }

    public void setSanidade(int sanidade) {
        this.sanidade = sanidade;
    }

    public int getPostos_esforcos() {
        return this.postos_esforcos;
    }

    public void setPostos_esforcos(int postos_esforcos) {
        this.postos_esforcos = postos_esforcos;
    }

    public int getVida() {
        return this.vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDeslocamento() {
        return this.deslocamento;
    }

    public void setDeslocamento(int deslocamento) {
        this.deslocamento = deslocamento;
    }

    public int getP_e_rodada() {
        return this.p_e_rodada;
    }

    public void setP_e_rodada(int p_e_rodada) {
        this.p_e_rodada = p_e_rodada;
    }
    
    public abstract void habilidades();
}
