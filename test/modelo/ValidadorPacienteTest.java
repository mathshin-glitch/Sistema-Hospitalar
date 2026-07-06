package modelo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ValidadorPacienteTest {

    //Chamar a Classe validadorPaciente e instanciar
    private final ValidadorPaciente validador = new ValidadorPaciente();

    public ValidadorPacienteTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        System.out.println("Iniciando os Teste Unitários");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("Fechando os Testes Unitáiros");
    }

    @Before
    public void setUp() {

    }

    @After
    public void tearDown() {
    }

    //Verificar se o CPF é valido.
    @Test
    public void testarCpfValido() {

        assertTrue(
                validador.cpfValido("12345678901")
        );
    }

    @Test
    public void testarCpfInvalido() {

        assertFalse(
                validador.cpfValido("123")
        );
    }

    @Test
    public void testarTelefoneValido() {

        assertTrue(
                validador.telefoneValido("(11)1234-5678")
        );
    }

    @Test
    public void testarTelefoneInvalido() {

        assertFalse(
                validador.telefoneValido("999999999999999")
        );
    }

    @Test
    public void testarEmailValido() {

        assertTrue(
                validador.emailValido("teste@email.com")
        );
    }

    @Test
    public void testarEmailInvalido() {

        assertFalse(
                validador.emailValido("abc123")
        );
    }
}
