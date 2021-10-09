package dio.ParadigmasFuncional;

import java.util.function.Function;

public class Functions {
    public static void main(String[] args) {
        Function<String, String[]> dadosPessoais = id -> id.split(",");
        String[] pessoa = dadosPessoais.apply("lindemberg,24 anos,aluno de computação,estudando java com prog. funcional");
        for (String dados: pessoa){
            System.out.println(dados);
        }
    }
}
