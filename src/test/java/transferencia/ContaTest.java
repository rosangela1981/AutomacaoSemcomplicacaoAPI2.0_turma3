package transferencia;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;


public class ContaTest {

    Cliente silvioSantos;
    Conta contaXuxa;
    Conta contaSilvio;

    @Test
    public void realizarTransacao() {
        contaXuxa = new Cliente("Xuxa", "12345678900", "111111");
        silvioSantos = new Cliente("Silvio Santos", "00987654231", "22222");


        contaXuxa = new Conta("0024", "2254", 2500.00, contaXuxa);
        contaSilvio = new Conta("0026", "2251", 3500.00, silvioSantos);

        assertTrue(contaXuxa.realizarTransferencia(1000.00, contaSilvio));


        assertEquals(1500.00, contaXuxa.getSaldo());
        assertEquals(4500.00, contaSilvio.getSaldo());
    }

     @Test
    public void realizarTransferenciaInvalida(){
         contaXuxa = new Cliente("XUXA", "12345678900", "111111");
         silvioSantos = new Cliente("Silvio Santos", "00987654231", "22222");


         contaXuxa = new Conta("0024", "2254", 2500.00, xuxa);
         contaSilvio = new Conta("0026", "2251", 3500.00, silvioSantos);

         boolean resultado = contaXuxa.realizarTransferencia(3500.00, contaSilvio);
         assertFalse(resultado);
     }
}
