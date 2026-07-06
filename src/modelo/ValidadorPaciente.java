package modelo;

public class ValidadorPaciente {

    public boolean camposObrigatoriosPreenchidos(
            String nome,
            String endereco,
            String dataNasc,
            String telefone,
            String cpf,
            String rg) {

        return !nome.trim().isEmpty()
                && !endereco.trim().isEmpty()
                && !dataNasc.trim().isEmpty()
                && !telefone.trim().isEmpty()
                && !cpf.trim().isEmpty()
                && !rg.trim().isEmpty();
    }

    public boolean cpfValido(String cpf) {

        cpf = cpf.replace(".", "")
                .replace("-", "")
                .trim();

        return cpf.matches("\\d{11}");
    }

    public boolean telefoneValido(String telefone) {

        return telefone.matches("\\(\\d{2}\\)\\d{4}-\\d{4}");
    }

    public boolean emailValido(String email) {

        if (email == null || email.trim().isEmpty()) {
            return true;
        }

        return email.matches(
                "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$"
        );
    }

}
