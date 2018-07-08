public class Member1 implements Member {

	private Party party;

	@Override
	public void joinParty(Party party) {
		this.party = party;
	}

	@Override
	public void act(String param) {
		party.act(this, param);
	}

	@Override
	public void exe(String param) {
		System.out.println(param);
	}
}
