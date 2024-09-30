package microsContratados;

import junit.framework.TestCase;

public class TestMicro extends TestCase {

    Micro unMicro = new Micro();
    Apurado unApurado = new Apurado();

    public void setUp() {
        unMicro.setCantParados(4);
        unMicro.setCantSentados(10);
    }

}
