public class Client {
	public static void main(String[] args) {
		Dengen d;
		d = new AcAdapter();
		int denatsu = d.kyuuden();
		System.out.println( denatsu + "V で給電されています" );
		}
	}

interface Dengen { // Target
	public int kyuuden();
	}

class JapaneseConsent { // Adaptee
	public int power() {
		return 100;
		}
	}

class AcAdapter implements Dengen {// Adapter
	private JapaneseConsent consent = new JapaneseConsent();
	public int kyuuden() {
		return (int)(consent.power() * 0.16);
		}
	}
