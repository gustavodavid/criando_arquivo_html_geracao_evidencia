import java.io.File;
import java.io.FileWriter;

public class Principal {

    public static void main(String[] args) {

        StringBuilder texto = new StringBuilder();

        texto.append("<!doctype html>\n");
        texto.append("<html lang=\"pt-br\">\n");
        texto.append("\t<head>\n");
        texto.append("\t\t<meta charset=\"utf-8\">\n");
        texto.append("\t\t<title>SOVIS - Resultado Execução</title>\n");
        texto.append("\t</head>\n");
        texto.append("\t<body>\n");
        texto.append("\t\t<div class=\"container\" style=\"display:flex; width:800px;\">\n");
        texto.append("<h2>Relatório</h2>");
        texto.append("\t\t</div>\n");
        texto.append("\t</body>\n");
        texto.append("</html>");

        try {
            FileWriter fw = new FileWriter(new File("evidencia.html"));
            fw.write(texto.toString());
            fw.flush();
            fw.close();
        } catch (Exception e) {
            System.out.print("Erro ao salvar arquivo html.");
            e.printStackTrace();
        }

    }
}
