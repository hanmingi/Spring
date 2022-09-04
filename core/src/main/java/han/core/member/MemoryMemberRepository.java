package han.core.member;
import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository{

	private static Map<Long, Member> store = new HashMap<>();
	
	@Override
	public void save(Member member) {
		// TODO Auto-generated method stub
		store.put(member.getId(), member);
	}

	@Override
	public Member findById(Long memberId) {
		// TODO Auto-generated method stub
		return store.get(memberId);
	}
	
}
