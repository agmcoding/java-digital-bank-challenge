package packageJavaBankChallenge;

public class Client {
	
	private static Integer sequential = 0;
	
	private String name;
	private Integer clientId;

	protected Client(String name) {
		super();
		this.name = name;
		this.clientId = ++sequential;
	}

	protected String getName() {
		return name;
	}

	protected Integer getClientId() {
		return clientId;
	}
	
	@Override
	public String toString() {
		return "Client [name=" + name + ", clientId=" + clientId + "]";
	}

}
