import org.example.Motorista;
import org.example.Veiculo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MotoristaTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Motorista motorista = new Motorista("Joao", "123456", new Veiculo("Ford", "Fiesta"));
        Motorista motoristaClone = motorista.clone();
        motoristaClone.setNome("Clone");
        motoristaClone.setCnh("12345");
        assertEquals("Motorista{CNH=12345, nome='Clone', veiculo=Veiculo{marca='Ford', modelo='Fiesta'}}",
                motoristaClone.toString());
        assertEquals("Motorista{CNH=123456, nome='Joao', veiculo=Veiculo{marca='Ford', modelo='Fiesta'}}",
                motorista.toString());
    }
}
