package kr.or.ddit.freeboard.service;

import java.util.List;
import java.util.Map;

import kr.or.ddit.vo.FreeboardVO;

public interface IFreeboardService {
	public List<FreeboardVO> freeboardList(Map<String, String> params);
	public String insertFreeboard(FreeboardVO freeboardInfo);
	public FreeboardVO freeboardInfo(Map<String, String> params);
	public void deleteFreeboard(Map<String,String> params);
	public void updateFreeboard(FreeboardVO freeboardInfo);

}