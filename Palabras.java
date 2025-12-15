import java.util.Random;

public class Palabras {
    public static String obtenerPalabra() {
        Random random = new Random();

        // JUGADORES HISTÓRICOS TOP
        String[] palabras = {
                "PELE", "MARADONA", "MESSI", "CRISTIANO", "ZIDANE",
                "RONALDO", "RONALDINHO", "CRUYFF", "BECKENBAUER", "PLATINI",
                "GARRINCHA", "MALDINI", "XAVI", "INIESTA", "PUSKAS",
                "ROMARIO", "RIVALDO", "KAKA", "FIGO", "BATISTUTA",
                "BAGGIO", "VANBASTEN", "RIJKAARD", "GULLIT", "SHEVCHENKO",
                "HENRY", "MBAPPE", "HAALAND", "LEWANDOWSKI", "SUAREZ",
                "NEYMAR", "MODRIC", "KROOS", "CASEMIRO", "RAMOS",
                "BUFFON", "CASILLAS", "NEUER", "YASHIN", "SCHMEICHEL",
                "KAHN", "PIRLO", "SEEDORF", "ZICO", "SOCRATES",
                "RONALDOZ", "KEMPES", "DIDI", "CAFÚ", "CARLOS",
                "ALVES", "PUYOL", "VIDIC", "NESTA", "CANNAVARO",
                "LAUDRUP", "BERGKAMP", "STOICHKOV", "HAGI", "RAUL",
                "DELPIERO", "TOTTI", "GERRARD", "LAMPARD", "SCHOLES",
                "BEST", "CHARLTON", "MAGUIRE", "MATTHAUS", "NAVAS"
        };

        // Devuelve un jugador aleatorio
        return palabras[random.nextInt(palabras.length)];
    }
}
