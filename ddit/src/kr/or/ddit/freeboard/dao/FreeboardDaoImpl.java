package kr.or.ddit.freeboard.dao;

import java.util.List;
import java.util.Map;

import org.apache.commons.fileupload.FileItem;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.ibatis.factory.SqlMapClientFactory;
import kr.or.ddit.vo.FreeboardVO;

public class FreeboardDaoImpl implements IFreeboardDao{
	private static IFreeboardDao dao = new FreeboardDaoImpl();
	private SqlMapClient smc;
	
	private FreeboardDaoImpl(){
		smc = SqlMapClientFactory.getSqlMapClient();
	}
	
	public static IFreeboardDao getInstance(){
		return (dao==null) ? dao = new FreeboardDaoImpl() : dao;
	}
	
	@Override
	public List<FreeboardVO> freeboardList(Map<String, String> params) throws Exception {
		return  smc.queryForList("board.freeboardList",params);
	}

	@Override
	public String insertFreeboard(FreeboardVO freeboardInfo) throws Exception {
		return (String) smc.insert("board.insertFreeboard",freeboardInfo);
		
	}

	@Override
	public FreeboardVO freeboardInfo(Map<String, String> params) throws Exception {
		return (FreeboardVO) smc.queryForObject("board.freeboardInfo",params);
	}

	@Override
	public void deleteFreeboard(Map<String, String> params) throws Exception {
		smc.update("board.deleteFreeboard",params);
	}

	@Override
	public void updateFreeboard(FreeboardVO freeboardInfo) throws Exception {
		smc.update("board.updateFreeboard",freeboardInfo);
	}

}
