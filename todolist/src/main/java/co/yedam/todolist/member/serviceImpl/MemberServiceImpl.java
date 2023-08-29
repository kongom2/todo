package co.yedam.todolist.member.serviceImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.yedam.todolist.common.DataSource;
import co.yedam.todolist.member.mapper.MemberMapper;
import co.yedam.todolist.member.service.MemberService;
import co.yedam.todolist.member.service.MemberVO;

public class MemberServiceImpl implements MemberService {
	private SqlSession sqlSession = DataSource.getInstance().openSession(true);
	private MemberMapper map = sqlSession.getMapper(MemberMapper.class);

	@Override
	public List<MemberVO> memberSelectList() {
		return map.memberSelectList();
	}

	@Override
	public MemberVO memberSelect(MemberVO vo) {
		return null;
	}

	@Override
	public int memberInsert(MemberVO vo) {
		return map.memberInsert(vo);
	}

	@Override
	public int memberDelete(MemberVO vo) {
		return 0;
	}

	@Override
	public int memberUpdate(MemberVO vo) {
		return 0;
	}

}
