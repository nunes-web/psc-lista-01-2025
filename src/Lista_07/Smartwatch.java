package Lista_07;

public class Smartwatch {
  // Variáveis (Atributos)
  private boolean touchscreen;
  private String relogio;
  private String sensorBiomimpedancia;
  private String sensorMovimentoEGPS;
  private String sensorTemperaturaCorporal;

  // Construtor
  public Smartwatch() {
    this.touchscreen = true;
    this.relogio = "horas atuais";
    this.sensorBiomimpedancia = "ativo";
    this.sensorMovimentoEGPS = "ativo";
    this.sensorTemperaturaCorporal = "ativo";
  }

  // Métodos
  public void mostrarBatimentosCardiacos() {
    if (touchscreen) {
      System.out.println("Mostrando batimentos cardíacos na tela.");
    }
  }

  public void agendarAlarme(String horario) {
    if (relogio != null && !relogio.isEmpty()) {
      System.out.println("Alarme agendado para: " + horario);
    }
  }

  public void gravarRotaExercicio() {
    if (sensorBiomimpedancia != null && !sensorBiomimpedancia.isEmpty()) {
      System.out.println("Gravando rota de exercício...");
    }
  }

  public void mostrarHoras() {
    if (sensorMovimentoEGPS != null && !sensorMovimentoEGPS.isEmpty()) {
      System.out.println("Mostrando as horas com base no movimento e GPS.");
    }
  }

  public void mostrarMeteorologia() {
    if (sensorTemperaturaCorporal != null && !sensorTemperaturaCorporal.isEmpty()) {
      System.out.println("Mostrando meteorologia baseada nos sensores.");
    }
  }

  // Getters e Setters
  public boolean isTouchscreen() {
    return touchscreen;
  }

  public void setTouchscreen(boolean touchscreen) {
    this.touchscreen = touchscreen;
  }

  public String getRelogio() {
    return relogio;
  }

  public void setRelogio(String relogio) {
    this.relogio = relogio;
  }

  public String getSensorBiomimpedancia() {
    return sensorBiomimpedancia;
  }

  public void setSensorBiomimpedancia(String sensorBiomimpedancia) {
    this.sensorBiomimpedancia = sensorBiomimpedancia;
  }

  public String getSensorMovimentoEGPS() {
    return sensorMovimentoEGPS;
  }

  public void setSensorMovimentoEGPS(String sensorMovimentoEGPS) {
    this.sensorMovimentoEGPS = sensorMovimentoEGPS;
  }

  public String getSensorTemperaturaCorporal() {
    return sensorTemperaturaCorporal;
  }

  public void setSensorTemperaturaCorporal(String sensorTemperaturaCorporal) {
    this.sensorTemperaturaCorporal = sensorTemperaturaCorporal;
  }
}