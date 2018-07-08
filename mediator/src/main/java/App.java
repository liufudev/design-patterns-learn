public class App {
	public static void main(String args[]) {
		Party party = new PartyImpl();
		Member1 member1 = new Member1();
		Member2 member2 = new Member2();
		party.addMember(member1);
		party.addMember(member2);
		member1.act("hello java");
		member2.act("hello c++");
	}
}
