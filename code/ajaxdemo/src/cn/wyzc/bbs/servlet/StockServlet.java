package cn.wyzc.bbs.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.wyzc.bbs.entity.Stock;

/**
 * Servlet implementation class StockServlet
 */
public class StockServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private HashMap<String, Stock> stocks;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StockServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		//模拟涨跌数据
		double a = Math.random() * 200;
		double b = Math.random() * 10;
		
		boolean flags = ((int)(Math.random() * 20)) % 2 == 1;
		boolean flagp = ((int)(Math.random() * 20)) % 2 == 0;
		
		Stock szzs = stocks.get("30000");
		Stock pfyh = stocks.get("00001");
		
		if(flags){
			szzs.setNow((int)(szzs.getNow() + a));
		}else{
			szzs.setNow((int)(szzs.getNow() - a));
		}
		
		if(flagp){
			pfyh.setNow((int)(pfyh.getNow() + b));
		}else{
			pfyh.setNow((int)(pfyh.getNow() - b));
		}
		//System.out.println(szzs);
		//System.out.println(pfyh);
		PrintWriter out = response.getWriter();
		//需要把两个对象传递给web前端
		StringBuffer buffer = new StringBuffer();
		buffer.append("({")
        .append("\"").append(szzs.getId()).append("\":{name:\"").append(szzs.getName())
        .append("\",yes:").append(szzs.getYestoday()).append(",tod:").append(szzs.getToday())
        .append(",now:").append(szzs.getNow())
        .append("},")
        .append("\"").append(pfyh.getId()).append("\":{name:\"").append(pfyh.getName())
        .append("\",yes:").append(pfyh.getYestoday()).append(",tod:").append(pfyh.getToday())
        .append(",now:").append(pfyh.getNow())
        .append("}})");
		  
		out.print(buffer.toString());
	}
	@Override
	public void init() throws ServletException {
		stocks = new HashMap<String,Stock>();
		Stock szzs = new Stock("30000","上证指数",2202.2,2203.3);
		Stock pfyh = new Stock("00001","浦发银行",23.5,22.3);
		stocks.put(szzs.getId(), szzs);
		stocks.put(pfyh.getId(), pfyh);
	}
}
