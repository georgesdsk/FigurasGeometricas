package figuras;

public class CuadradoCheto extends Cuadrado{
    public CuadradoCheto(double lado) {
        super(lado);
    }

    public String hacerCuadrado(){

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < getLadoMayor(); i++) {
            for (int j = 0; j < getLadoMayor(); j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return hacerCuadrado();
    }
}
