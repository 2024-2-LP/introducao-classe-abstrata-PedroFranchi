package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Imagem {
    private List<Figura> figuras = new ArrayList<>();

    public List<Figura> getFiguras() {
        return figuras;
    }

    public void setFiguras(List<Figura> figuras) {
        this.figuras = figuras;
    }


    public void adicionar(Figura figura){
        figuras.add(figura);
    }

    public Double calcularSomaDasAreas(){
        Double somaDasAreas = 0.0;
        for (Figura figura : figuras) {
            somaDasAreas += figura.calcularArea();
        }
        return somaDasAreas;
    }

    public List<Figura> buscarPorAreaMaiorQue20(){
        List<Figura> figurasmaior20 = new ArrayList<>();
        for (Figura figura : figuras) {
            if (figura.calcularArea() > 20){
                figurasmaior20.add(figura);
            }
        }
        return figurasmaior20;
    }

    public List<Figura> buscarQuadrados(){
        List<Figura> figurasQuadarado = new ArrayList<>();
        for (Figura figura : figuras) {
           if (figura instanceof Quadrado){
               figurasQuadarado.add(figura);
            }
        }
        return figurasQuadarado;
    }

}
