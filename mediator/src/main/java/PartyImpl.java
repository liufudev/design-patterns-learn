import com.google.common.collect.Lists;

import java.util.List;

public class PartyImpl implements Party {

	private final List<Member> list;

	public PartyImpl() {
		this.list = Lists.newArrayList();
	}

	@Override
	public void addMember(Member member) {
		list.add(member);
		member.joinParty(this);
	}

	@Override
	public void act(Member member, String param) {
		list.stream().filter(a -> a.equals(member)).forEach(b -> b.exe(param));
	}
}
